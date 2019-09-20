grammar SimpleCalc;

expr			: seq+;
seq			    : exp NL
				|LIT NL
				| LIT ASSIGN exp
				|LIT ASSIGN LIT NL
				|NL;
				

exp 			: multdiv ( ( '*' | '/' ) multdiv )*';'*;
multdiv			: somsub ( ( '+' | '-' ) somsub )*';'*;
somsub			: LIT
				| INT
				| PE exp PD;

PE				:'('+;
PD				:')'+;
ASSIGN			:'=';				
LIT		   		:('a'..'z' | 'A'..'Z')+;
INT 			: '0'..'9'+;
NL				:'\r'?'\n';
WHITESPACE : ( ' '|'\t'|'\n'|'\r')+ -> channel(HIDDEN);