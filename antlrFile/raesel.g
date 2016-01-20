grammar raesel;
options { 
  output=AST; 
  ASTLabelType=CommonTree;
}
tokens{
  OPERAND;
  Operations;
}
s 	 :	r1_1 = symbols oh1 = op r1_2 = symbols EQ r1_3 = symbols '\n'
		ov1 = op ov2 = op ov3 = op'\n'
		r2_1 = symbols  oh2 = op r2_2 = symbols EQ r2_3 = symbols '\n'
		EQ EQ EQ '\n'
		r3_1 = symbols oh3 = op r3_2 = symbols EQ r3_3 = symbols
		
	 ->  ^(Operations
	     ^(EQ ^($oh1  $r1_1 $r1_2) $r1_3)
	     ^(EQ ^($oh2 $r2_1 $r2_2) $r2_3) 
	     ^(EQ ^($oh3 $r3_1  $r3_2) $r3_3)
	     ^(EQ ^($ov1 $r1_1 $r2_1) $r3_1)
	     ^(EQ ^($ov2  $r1_2 $r2_2) $r3_2) 
	     ^(EQ ^($ov3 $r1_3 $r2_3)  $r3_3))
	 ;
symbols	 :	syms = SYMBOL+ -> ^(OPERAND SYMBOL+ );

SYMBOL	 :	'A'..'Z';
op :	PLUS | MINUS;
PLUS	:	'+';
MINUS	:	'-';
EQ 	:	'=';
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;