/**
 * Copyright (C) 2014 SINTEF <franck.fleurey@sintef.no>
 *
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingml.compilers.c.arduino;

import org.sintef.thingml.ErrorAction;
import org.sintef.thingml.PrintAction;
import org.sintef.thingml.helpers.AnnotatedElementHelper;
import org.thingml.compilers.Context;
import org.thingml.compilers.c.CThingActionCompiler;

/**
 * Created by ffl on 11.06.15.
 */
public class CThingActionCompilerArduino extends CThingActionCompiler {

    @Override
    public void generate(ErrorAction action, StringBuilder builder, Context ctx) {
        final StringBuilder b = new StringBuilder();
        generate(action.getMsg(), b, ctx);

        builder.append("// PRINT ERROR: " + b.toString() + "\n");
    }

    @Override
    public void generate(PrintAction action, StringBuilder builder, Context ctx) {
        final StringBuilder b = new StringBuilder();
        generate(action.getMsg(), b, ctx);
        if (AnnotatedElementHelper.hasAnnotation(ctx.getCurrentConfiguration(), "arduino_stdout")) {
            builder.append(AnnotatedElementHelper.annotation(ctx.getCurrentConfiguration(), "arduino_stdout").iterator().next() + ".print(" + b.toString() + ");\n");
        } else {
            builder.append("// PRINT: " + b.toString() + "\n");
        }
    }

}
