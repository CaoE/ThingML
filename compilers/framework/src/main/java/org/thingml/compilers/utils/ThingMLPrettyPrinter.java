/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
package org.thingml.compilers.utils;

import org.thingml.compilers.Context;
import org.thingml.compilers.thing.ThingActionCompiler;
import org.thingml.xtext.helpers.ToString;
import org.thingml.xtext.thingML.Action;
import org.thingml.xtext.thingML.ActionBlock;
import org.thingml.xtext.thingML.AndExpression;
import org.thingml.xtext.thingML.ArrayIndex;
import org.thingml.xtext.thingML.BooleanLiteral;
import org.thingml.xtext.thingML.ByteLiteral;
import org.thingml.xtext.thingML.CastExpression;
import org.thingml.xtext.thingML.CharLiteral;
import org.thingml.xtext.thingML.ConditionalAction;
import org.thingml.xtext.thingML.Decrement;
import org.thingml.xtext.thingML.DivExpression;
import org.thingml.xtext.thingML.DoubleLiteral;
import org.thingml.xtext.thingML.EnumLiteralRef;
import org.thingml.xtext.thingML.EqualsExpression;
import org.thingml.xtext.thingML.ErrorAction;
import org.thingml.xtext.thingML.EventReference;
import org.thingml.xtext.thingML.ExpressionGroup;
import org.thingml.xtext.thingML.ExternExpression;
import org.thingml.xtext.thingML.ExternStatement;
import org.thingml.xtext.thingML.ForAction;
import org.thingml.xtext.thingML.FunctionCallExpression;
import org.thingml.xtext.thingML.FunctionCallStatement;
import org.thingml.xtext.thingML.GreaterExpression;
import org.thingml.xtext.thingML.GreaterOrEqualExpression;
import org.thingml.xtext.thingML.Increment;
import org.thingml.xtext.thingML.IntegerLiteral;
import org.thingml.xtext.thingML.LocalVariable;
import org.thingml.xtext.thingML.LoopAction;
import org.thingml.xtext.thingML.LowerExpression;
import org.thingml.xtext.thingML.LowerOrEqualExpression;
import org.thingml.xtext.thingML.MinusExpression;
import org.thingml.xtext.thingML.ModExpression;
import org.thingml.xtext.thingML.NotEqualsExpression;
import org.thingml.xtext.thingML.NotExpression;
import org.thingml.xtext.thingML.OrExpression;
import org.thingml.xtext.thingML.PlusExpression;
import org.thingml.xtext.thingML.PrintAction;
import org.thingml.xtext.thingML.PropertyReference;
import org.thingml.xtext.thingML.ReturnAction;
import org.thingml.xtext.thingML.SendAction;
import org.thingml.xtext.thingML.StartSession;
import org.thingml.xtext.thingML.StringLiteral;
import org.thingml.xtext.thingML.TimesExpression;
import org.thingml.xtext.thingML.UnaryMinus;
import org.thingml.xtext.thingML.VariableAssignment;

/**
 * Created by bmori on 01.12.2014.
 */
public class ThingMLPrettyPrinter extends ThingActionCompiler {

    public static boolean USE_ELLIPSIS_FOR_PARAMS = true;
    public static int MAX_BLOCK_SIZE = 3;
    public static boolean HIDE_BLOCKS = true;

    public final static String NEW_LINE = "\\n";
    public final static String INDENT = "  "; //two blank spaces for indentation
    public static int indent_level = 0;

    //ThingML pretty printer (useful for documentation, etc)

    @Override
    public void generate(SendAction action, StringBuilder builder, Context ctx) {        
        if (USE_ELLIPSIS_FOR_PARAMS && action.getParameters().size() > 1) {
        	builder.append(action.getPort().getName() + "!" + action.getMessage().getName() + "(");
            builder.append("...");
            builder.append(")" + NEW_LINE);
        } else {
        	builder.append(ToString.valueOf(action).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
        	builder.append(NEW_LINE);
        }
        
    }

    @Override
    public void generate(StartSession action, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(action).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    	builder.append(NEW_LINE);
    }

    @Override
    public void generate(VariableAssignment action, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(action).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
        builder.append(NEW_LINE);
    }

    @Override
    public void generate(ActionBlock action, StringBuilder builder, Context ctx) {
        StringBuilder temp = new StringBuilder();
        if (action.getActions().size() > 1)
            temp.append("do");
        if (!HIDE_BLOCKS) {
        	temp.append("\\n");
        }
        indent_level++;
        if (HIDE_BLOCKS && action.getActions().size() > 1) {
            temp.append("...");
        } else {
            if (action.getActions().size() > MAX_BLOCK_SIZE) {
                int i = 0;
                for (Action a : action.getActions()) {
                    if (i < MAX_BLOCK_SIZE/2) {
                        generate(a, temp, ctx);
                        i++;
                    } else {
                        break;
                    }
                }
                temp.append("..." + NEW_LINE);
                i = 0;
                for (Action a : action.getActions()) {
                    if (i > MAX_BLOCK_SIZE/2 + 1) {
                        generate(a, temp, ctx);
                    }
                    i++;
                }
            } else {
                for (Action a : action.getActions()) {
                    generate(a, temp, ctx);
                }
            }
        }
        indent_level--;
        if (action.getActions().size() > 1)
            temp.append("end");
        if (!HIDE_BLOCKS)
        	temp.append("\n");
        builder.append(temp.toString().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(ExternStatement action, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(action).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
        builder.append(NEW_LINE);
    }

    @Override
    public void generate(ConditionalAction action, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(action).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
        builder.append(NEW_LINE);
    }

    @Override
    public void generate(LoopAction action, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(action).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    	builder.append(NEW_LINE);
    }

    @Override
  	public void generate(ForAction fa, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(fa).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    	builder.append(NEW_LINE);
  	}

    @Override
    public void generate(PrintAction action, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(action).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
        builder.append(NEW_LINE);
    }

    @Override
    public void generate(ErrorAction action, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(action).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
        builder.append(NEW_LINE);
    }

    @Override
    public void generate(ReturnAction action, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(action).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
        builder.append(NEW_LINE);
    }

    @Override
    public void generate(LocalVariable action, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(action).trim().replace("\r\n", "\\n").replace("\n", "\\n"));        
        builder.append(NEW_LINE);
    }

    @Override
    public void generate(FunctionCallStatement action, StringBuilder builder, Context ctx) {
        if (USE_ELLIPSIS_FOR_PARAMS  && action.getParameters().size() > 1) {
            builder.append(action.getFunction().getName() + "(...)" + NEW_LINE);
        } else {
        	builder.append(ToString.valueOf(action).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
        	builder.append(NEW_LINE);
        }
    }


    //ThingML expressions that can be compiled the same way for any imperative language like (Java, JS, C)

    @Override
    public void generate(ArrayIndex expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(OrExpression expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(AndExpression expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(LowerExpression expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(GreaterExpression expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(LowerOrEqualExpression expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(GreaterOrEqualExpression expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(EqualsExpression expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(NotEqualsExpression expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }
    @Override
    public void generate(PlusExpression expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(MinusExpression expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(TimesExpression expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(DivExpression expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(ModExpression expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(UnaryMinus expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(NotExpression expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }



    @Override
    public void generate(PropertyReference expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(ByteLiteral expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(CharLiteral expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(IntegerLiteral expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(DoubleLiteral expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(StringLiteral expression, StringBuilder builder, Context ctx) {
        builder.append("\"" + expression.getStringValue().replace("\r\n", "\\n").replace("\n", "\\n").replace("\\n","\\\\n") + "\"");
    }

    @Override
    public void generate(BooleanLiteral expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(EnumLiteralRef expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(ExternExpression expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(FunctionCallExpression expression, StringBuilder builder, Context ctx) {
        if (USE_ELLIPSIS_FOR_PARAMS  && expression.getParameters().size() > 1) {
            builder.append(expression.getFunction().getName() + "(...)");
        } else {
        	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
        }
    }

    @Override
    public void generate(Increment action, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(action).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    	builder.append(NEW_LINE);
    }

    @Override
    public void generate(Decrement action, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(action).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    	builder.append(NEW_LINE);
    }

    @Override
    public void generate(EventReference expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(ExpressionGroup expression, StringBuilder builder, Context ctx) {
    	builder.append(ToString.valueOf(expression).trim().replace("\r\n", "\\n").replace("\n", "\\n"));
    }

    @Override
    public void generate(CastExpression expression, StringBuilder builder, Context ctx) {
        //We do not cast explicitly in the generated code. Should a cast be needed, it has to be done in an extern expression
        generate(expression.getTerm(), builder, ctx);
    }
}
