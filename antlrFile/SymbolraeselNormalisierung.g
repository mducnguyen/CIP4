tree grammar SymbolraeselNormalisierung;

options {
	output = AST;
	tokenVocab=raesel;
	ASTLabelType=CommonTree;
}


s 	:	^(Operations operation operation operation operation operation operation)
	;
	 
operation
	:	plusOperation
	|	minusOpration 
	;
plusOperation
	:	^(EQ ^(PLUS operand operand) operand)	
	;
minusOpration
	:	^(EQ ^(MINUS op1 = operand op2=operand) op3=operand)
		 -> ^(EQ ^(PLUS[null,"+"] $op2 $op3) $op1) 
	;
operand	:	^(OPERAND SYMBOL+)
	; 