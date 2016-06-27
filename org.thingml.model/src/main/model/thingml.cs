SYNTAXDEF thingml
FOR <http://thingml>
START ThingMLModel


OPTIONS {
	
	reloadGeneratorModel = "true"; 
	memoize = "true";
	tokenspace = "0";
	usePredefinedTokens = "false";
	srcFolder = "src/main/java";
	
	
	// PROCESS TO RE-GENERATE THE THINGML COMPILER FROM THIS FILE
	//
	// The code should be generated *2 times*, once for eclipse and once for standalone
	// The generated code shares all the code that is manually edited in (src/main/java) so there is no need to create the resolvers twice.
	// Below are the different options to use.
	// Generate the standalone version first and then the eclipse version.
	
	// 1. FOR STANDALONE
	//srcGenFolder = "src/main/java-gen-standalone";
	//generateUIPlugin = "false";
	//removeEclipseDependentCode = "true";
	
	// 2. FOR ECLIPSE Comment the lines below
	srcGenFolder = "src/main/java-gen";
	
	
	// IMPORTANT: In the generated eclipse plugins it is required to change the Vendor to SINTEF and the Version from "1.0.0" to "0.x.0.qualifier"
}

TOKENS{
		DEFINE SL_COMMENT $'//'(~('\n'|'\r'|'\uffff'))* $ ;
		DEFINE ML_COMMENT $'/*'.*'*/'$ ;
		
		DEFINE ANNOTATION $'@'('A'..'Z' | 'a'..'z' | '0'..'9' | '_' )+$;
		
		DEFINE BOOLEAN_LITERAL $'true'|'false'$;
		
		DEFINE INTEGER_LITERAL $('1'..'9') ('0'..'9')* | '0'$;
		DEFINE REAL_LITERAL $ (('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ (('e'|'E') ('+'|'-')? ('0'..'9')*)?$;
		DEFINE STRING_LITERAL $'"'('\\'('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')|('\\''u'('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F'))|'\\'('0'..'7')|~('\\'|'"'))*'"'$;
	    DEFINE STRING_EXT $'\''('\\'('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')|('\\''u'('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F'))|'\\'('0'..'7')|~('\\'|'\''))*'\''$;
		
		DEFINE T_READONLY $'readonly'$;
		
		DEFINE T_OPTIONAL $'optional'$;
		
		DEFINE T_ASPECT $'fragment'$;
		DEFINE T_HISTORY $'history'$;
		DEFINE T_DYNAMIC $'dynamic'$;
		
		DEFINE WHITESPACE $(' '|'\t'|'\f')$;
		DEFINE LINEBREAKS $('\r\n'|'\r'|'\n')$;
		
		DEFINE T_ARRAY $'['$;
		
		//DEFINE MULTIPLICITY $(('0'..'9')+) '\.' '\.' ( ('*') | (('1'..'9')+) )$;
		//DEFINE MULTIPLICITY $( ('*') | (('1'..'9')+) )$;
		
		DEFINE TEXT $('A'..'Z' | 'a'..'z' | '0'..'9' | '_' )+$;
		//DEFINE TEXT $('A'..'Z' | 'a'..'z' | '0'..'9' | '_' )+ (':' ':' ('A'..'Z' | 'a'..'z' | '0'..'9' | '_')+ )* $;
}

TOKENSTYLES{
	
	// Default text
	"TEXT" COLOR #222222;
	
	"T_ARRAY" COLOR #222222, BOLD;
	
	// Comments
	"SL_COMMENT"  COLOR #666666;
	"ML_COMMENT"  COLOR #666666;
	
	// Annotations & ext
	"ANNOTATION" COLOR #0055bb , BOLD;
	"STRING_EXT" COLOR #0055bb;
	"&" COLOR #0055bb, BOLD;
	
	// Literals
	"STRING_LITERAL" COLOR #548A42;
	"INTEGER_LITERAL" COLOR #0055bb;
	"REAL_LITERAL" COLOR #0055bb;	
	"BOOLEAN_LITERAL" COLOR #6A2980, BOLD;
	
	// Definition of types and messages
	"T_READONLY" COLOR #CC8000, BOLD;
	"thing" COLOR #CC8000, BOLD;
	"includes" COLOR #CC8000, BOLD;
	"datatype" COLOR #CC8000, BOLD;
	"object" COLOR #CC8000, BOLD, ITALIC;	
	"enumeration" COLOR #CC8000, BOLD;
	"sends" COLOR #CC8000, BOLD;
	"receives" COLOR #CC8000, BOLD;
	"port" COLOR #CC8000, BOLD;
	"provided" COLOR #CC8000, BOLD;	
	"required" COLOR #CC8000, BOLD;
	"T_OPTIONAL" COLOR #CC8000, BOLD;
	"message" COLOR #CC8000, BOLD;	
	"property" COLOR #CC8000, BOLD;	
	
	
	// State machines
	"state" COLOR #A22000, BOLD;
	"composite" COLOR #A22000, BOLD;
	"statechart" COLOR #A22000, BOLD;
	"event" COLOR #A22000, BOLD;	
	"guard" COLOR #A22000, BOLD;
	"action" COLOR #A22000, BOLD;
	"on" COLOR #A22000, BOLD;
	"entry" COLOR #A22000, BOLD;
	"exit" COLOR #A22000, BOLD;
	"region" COLOR #A22000, BOLD;
	"session" COLOR #097A41, BOLD;
	"internal" COLOR #A22000, BOLD;
	"transition" COLOR #A22000, BOLD;
	"init" COLOR #A22000, BOLD;
	"keeps" COLOR #A22000, BOLD;
	"T_HISTORY" COLOR #A22000, BOLD;
	"->" COLOR #A22000, BOLD;
	
	//CEP
	"stream" COLOR #CF4729, BOLD;	
	"from" COLOR #CF4729, BOLD;
	"select" COLOR #CF4729, BOLD;
	"produce" COLOR #CF4729, BOLD;
	"keep if" COLOR #CF4729, BOLD;
	"during" COLOR #CF4729, BOLD;
	"buffer" COLOR #CF4729, BOLD;	
	"by" COLOR #CF4729, BOLD;
	"T_DYNAMIC" COLOR #CF4729, BOLD;
	
	
	// Action language
	"var" COLOR #444444, BOLD;
	"function" COLOR #444444, BOLD;
	"return" COLOR #444444, BOLD;
	"do" COLOR #444444, BOLD;
	"end" COLOR #444444, BOLD;
	"if" COLOR #444444, BOLD;
	"while" COLOR #444444, BOLD;
	"print" COLOR #444444, BOLD;
	"error" COLOR #444444, BOLD;
	"not" COLOR #6A2980, BOLD;
	"and" COLOR #6A2980, BOLD;
	"or" COLOR #6A2980, BOLD;
	"fork" COLOR #097A41, BOLD;
	
	//Protocols
	"protocol" COLOR #65BA9E, BOLD;
	
	// Configurations and Instances
	"configuration" COLOR #007F55, BOLD;
	"instance" COLOR #007F55, BOLD;	
	"connector" COLOR #007F55, BOLD;	
	"=>" COLOR #007F55, BOLD;
	"over" COLOR #006E54, BOLD;

	// Special keywords
	"T_ASPECT" COLOR #444444, BOLD;
	"import" COLOR #444444, BOLD;
	"set" COLOR #444444, BOLD;
	
	"(" COLOR #444444, BOLD;
	")" COLOR #444444, BOLD;
	"{" COLOR #444444, BOLD;
	"}" COLOR #444444, BOLD;
	"[" COLOR #444444, BOLD;
	"]" COLOR #444444, BOLD;
	
	"!" COLOR #444444, BOLD;
	"?" COLOR #444444, BOLD;
	"." COLOR #444444, BOLD;
	":" COLOR #444444, BOLD;
	
}


RULES {
	
	ThingMLModel::= ( !0 "import" #1 imports[STRING_LITERAL] )* ( !0 (types | configs | protocols) )* ;
		
	Message ::= "message" #1 name[]  "(" (parameters ("," #1  parameters)* )? ")"(annotations)* (";")?  ;
	
	Function ::= "function" #1 name[]  "(" (parameters ("," #1  parameters)* )? ")"(annotations)* ( #1 ":" #1 type[] ( (isArray[T_ARRAY] cardinality "]") | (isArray["[]" : ""] ))? )? #1 body ;
	
	Thing::= "thing" (#1 fragment[T_ASPECT])? #1 name[] (#1 "includes" #1 includes[] (","  #1 includes[])* )? (annotations)*  !0 "{" (  messages | functions | properties | assign | ports | behaviour | streams)* !0 "}" ;
	
	RequiredPort ::= !1 (optional[T_OPTIONAL])? "required" #1 "port" #1 name[] (annotations)* !0 "{" ( "receives" #1 receives[] (","  #1 receives[])* | "sends" #1 sends[] (","  #1 sends[])* )* !0 "}" ;

	ProvidedPort ::= !1  "provided" #1 "port" #1 name[] (annotations)* !0 "{" ( "receives" #1 receives[] (","  #1 receives[])* | "sends" #1 sends[] (","  #1 sends[])* )* !0 "}" ;
	
	InternalPort ::= !1  "internal" #1 "port" #1 name[] (annotations)* !0 "{" ( "receives" #1 receives[] (","  #1 receives[])* | "sends" #1 sends[] (","  #1 sends[])* )* !0 "}" ;
	
	Property::= !1 (changeable[T_READONLY])? "property" #1 name[] #1 ":" #1 type[]  ( (isArray[T_ARRAY] cardinality "]") | (isArray["[]" : ""] ))? (#1 "=" #1 init)?  (annotations)*;
	
	//("[" lowerBound[INTEGER_LITERAL] ".." upperBound[INTEGER_LITERAL] "]")?
		
	Parameter::= name[]  ":"  type[] ( (isArray[T_ARRAY] cardinality "]") | (isArray["[]" : ""] ))?;
	
	PrimitiveType::= "datatype" #1 name[] #1 "<" #1 ByteSize[INTEGER_LITERAL] #1 ">" (annotations)* (";")? ;
	
	ObjectType::= "object" #1 name[] (annotations)* (";")? ;
	
	Protocol::= "protocol" #1 name[] (annotations)* (";")? ;
	
	Enumeration::= "enumeration" #1 name[] (annotations)* !0 "{" (literals)* "}" ;
	
	EnumerationLiteral ::= !1 name[] (annotations)* ;
	 
	PlatformAnnotation ::= !1 name[ANNOTATION] #1 value[STRING_LITERAL] ;
	
	StateMachine::= !1 "statechart" (#1 name[])? #1 "init" #1 initial[] ("keeps" #1 history[T_HISTORY])? (annotations)* #1 "{" ( !1 properties )* ( !1 "on" #1 "entry" #1 entry )? ( !1 "on" #1 "exit" #1 exit )?  ((!1 substate) | internal)* (!1 region)* !0 "}"  ;
	
	State::= "state" #1 name[] (annotations)* #1 "{" ( !1 properties )* ( !1 "on" #1 "entry" entry )? ( !1 "on" "exit" exit )? ( outgoing | internal )* !0 "}"  ;
	
	FinalState::= "final state" #1 name[] (annotations)* #1 "{" ( !1 properties )* ( !1 "on" #1 "entry" entry )? !0 "}"  ;
	
	CompositeState::= "composite" #1 "state" #1 name[] #1 "init" #1 initial[] ("keeps" #1 history[T_HISTORY])? (annotations)* #1 "{" ( !1 properties )* ( !1 "on" #1 "entry" #1 entry )? ( !1 "on" #1 "exit" #1 exit )? ( outgoing | internal | (!1 substate))* (!1 region)* !0 "}"  ;
	
	ParallelRegion ::= "region" #1 name[] #1 "init" #1 initial[] ("keeps" #1 history[T_HISTORY])? (annotations)* #1 "{"(!1 substate)* !0 "}"  ;
		
	Session::= "session" #1 name[] #1 ("<" #1 maxInstances ">" #1)? "init" #1 initial[] (annotations)* #1 "{" ( !1 properties )* ( !1 "on" #1 "entry" #1 entry )? (internal | (!1 substate))* (!1 region)* !0 "}"  ;
	
	Transition::= !1 "transition" (#1 name[])? #1 "->" #1 target[] (annotations)* ( !1 "event" #1 event )*  ( !1 "guard" #1 guard)? (!1 "action" #1 action)? ;

	InternalTransition ::= !1 "internal" (#1 name[])? (annotations)* ( !1 "event" #1 event )*  ( !1 "guard" #1 guard)? (!1 "action" #1 action)?  ;

	ReceiveMessage ::= (name[] #1 ":" #1)? port[] "?" message[] ;
	
	PropertyAssign ::= "set" #1 property[] ("[" index "]")* #1 "=" #1 init ; 
	
	Increment ::= var #1 "++" ;
	
	Decrement ::= var #1 "--" ;

	// *******************************
	// * Configurations and Instances
	// *******************************
	
	Configuration ::= "configuration" #1 name[] (annotations)*  !0 "{" (  instances | connectors | propassigns )* !0 "}" ;
	
	Instance ::= "instance" #1 name[] #1 ":" #1 type[] (annotations)*  ; 
	
	Connector ::= "connector" #1 (name[] #1)? cli "." required[] "=>" srv "." provided[] (!0 annotations)*;
	
	ExternalConnector ::= "connector" #1 (name[] #1)? inst "." port[] "over" protocol[] (!0 annotations)*;	
	
	ConfigPropertyAssign ::= "set" instance "." property[] ("[" index "]")* #1 "=" #1 init;
	
	InstanceRef ::= instance[];

	// *********************
	// * Actions
	// *********************
	
	SendAction::= port[] "!" message[] "(" (parameters ("," #1 parameters)* )? ")";
	
	StartSession ::= "fork" #1 session[] (constructor)*;
	
	StartStream ::= "start" #1 stream[] ;
	
	StopStream ::= "stop" #1 stream[] ;
		
	VariableAssignment ::= property[] #1 ("[" index "]")* "=" #1 expression ; 
	
	ActionBlock::= "do" ( !1 actions  )* !0 "end"  ;
	
	LocalVariable::= !1 (changeable[T_READONLY])? "var" #1 name[] #1 ":" #1 type[] ( (isArray[T_ARRAY] cardinality "]") | (isArray["[]" : ""] ))? (#1 "=" #1 init)?  (annotations)*;
	
	ExternStatement::= statement[STRING_EXT] ("&" segments)*;
	
	ConditionalAction ::= "if" #1 "(" #1 condition #1 ")" !1 action (!1 "else" !1 elseAction)?;
	
	LoopAction ::= "while" #1 "(" #1 condition #1 ")" !1 action;
	
	PrintAction ::= "print" #1 msg;
	
	ErrorAction ::= "error" #1 msg;
	
	ReturnAction ::= "return" #1 exp;
	
	FunctionCallStatement ::= function[] "(" (parameters ("," #1 parameters)* )? ")";
	
	// *******************************
	// * CEP
	// *******************************
	MessageParameter ::= name[] ":" msgRef[];
	
	Filter ::= "keep if" #1 guard ;
	LengthWindow ::= "buffer" #1 size (#1 "by" #1 step)? ;
	TimeWindow ::= "during" #1 duration (#1 "by" #1 step)? ;
		
	SimpleSource ::= name[] (annotations)* ":" message ("::" operators)*;	
	JoinSources  ::= name[] ":" #1 "[" #1 sources (annotations)* #1 ("&" #1 sources (annotations)* #1 )+ #1 "->" resultMessage[] "(" (rules ("," rules)*)? ")" #1 "]" ("::" operators)* ;
	MergeSources ::= name[] ":" #1 "[" #1 sources (annotations)* #1 ("|" #1 sources (annotations)* #1 )+ #1 "->" resultMessage[] #1 "]" ("::" operators)* ;
	
	Stream ::= (dynamic[T_DYNAMIC] #1)? "stream" #1 name[] #1 (annotations)*
					 !1 "from" #1 input
					 (!1 "select" #1 ( selection ((",")? #1 selection)* )?)?
					 !1 "produce" #1 output ;
	
	SimpleParamRef ::= parameterRef[];	
	ArrayParamRef ::= parameterRef[] "[]";		
	LengthArray ::= "length";	 
	
	// *********************
	// * The Expressions
	// *********************
	
	@Operator(type="binary_left_associative", weight="1", superclass="Expression")
	OrExpression ::= lhs #1 "or" #1 rhs;
	
	@Operator(type="binary_left_associative", weight="2", superclass="Expression")
	AndExpression ::= lhs #1 "and" #1 rhs;
		
	@Operator(type="binary_left_associative", weight="3", superclass="Expression")
	LowerExpression ::= lhs #1 "<" #1  rhs;
	
	@Operator(type="binary_left_associative", weight="3", superclass="Expression")
	GreaterExpression ::= lhs #1 ">" #1  rhs;
	
	@Operator(type="binary_left_associative", weight="3", superclass="Expression")
	LowerOrEqualExpression ::= lhs #1 "<=" #1  rhs;
	
	@Operator(type="binary_left_associative", weight="3", superclass="Expression")
	GreaterOrEqualExpression ::= lhs #1 ">=" #1  rhs;
	
	@Operator(type="binary_left_associative", weight="3", superclass="Expression")
	EqualsExpression ::= lhs #1 "==" #1  rhs;
	
	@Operator(type="binary_left_associative", weight="3", superclass="Expression")
	NotEqualsExpression ::= lhs #1 "!=" #1  rhs;
	
	@Operator(type="binary_left_associative", weight="4", superclass="Expression")
	PlusExpression ::= lhs #1 "+" #1  rhs;
	
	@Operator(type="binary_left_associative", weight="4", superclass="Expression")
	MinusExpression ::= lhs #1 "-" #1 rhs;
	
	@Operator(type="binary_left_associative", weight="5", superclass="Expression")
	TimesExpression ::= lhs #1 "*" #1 rhs;
	
	@Operator(type="binary_left_associative", weight="5", superclass="Expression")
	DivExpression ::= lhs #1 "/" #1 rhs;
	
	@Operator(type="binary_right_associative", weight="6", superclass="Expression")
	ModExpression ::= lhs #1 "%" #1 rhs;
	
 	@Operator(type="unary_prefix", weight="7", superclass="Expression")	
	UnaryMinus ::= "-" term;
	
	@Operator(type="unary_prefix", weight="7", superclass="Expression")	
	NotExpression ::= "not" #1 term;
	
	@Operator(type="primitive", weight="9", superclass="Expression")
	Reference ::= reference[] "." parameter;	
	
	@Operator(type="primitive", weight="9", superclass="Expression")
	ExpressionGroup ::= "(" exp ")";
	 
	@Operator(type="primitive", weight="9", superclass="Expression")
	PropertyReference ::= property[] ;

	@Operator(type="primitive", weight="9", superclass="Expression")
	IntegerLiteral ::= intValue[INTEGER_LITERAL];
	
	@Operator(type="primitive", weight="9", superclass="Expression")
	DoubleLiteral ::= doubleValue[REAL_LITERAL];
		
	@Operator(type="primitive", weight="9", superclass="Expression")
	StringLiteral ::= stringValue[STRING_LITERAL];
	
	@Operator(type="primitive", weight="9", superclass="Expression")
	BooleanLiteral ::= boolValue[BOOLEAN_LITERAL];
	
	@Operator(type="primitive", weight="9", superclass="Expression")
	EnumLiteralRef ::= enum[] ":" literal[];
	
	@Operator(type="unary_postfix", weight="8", superclass="Expression")
	ArrayIndex ::= array "[" index "]";
	
	@Operator(type="primitive", weight="9", superclass="Expression")
	FunctionCallExpression ::= function[] "(" (parameters ("," #1 parameters)* )? ")";
	
	@Operator(type="primitive", weight="9", superclass="Expression")
	ExternExpression::= expression[STRING_EXT] ("&" segments)*;
	
	
	
}
