tree grammar SymbolraetselEmitter;

options {
  tokenVocab   = raesel;
  output       = template;
  ASTLabelType = CommonTree;
}

@header{
	import java.util.Set;
	import java.util.HashSet;
}

@members{
	Set<Character> symbolSet = new HashSet<>();
}

puzzle
  :
  ^(Operations constraints+=constraint*)
  -> sums(symbols = {symbolSet} ,sums={$constraints})
  ;

constraint
@after {
	Constraint constraint = new Constraint();
	constraint.numbers.add($n1.number);
	constraint.numbers.add($n2.number);
	constraint.numbers.add($n3.number);
	constraint.prepare();
}
  :
  ^(
    EQ
    ^(PLUS n1=number n2=number)
    n3=number
   )
   -> sum(number1={$n1.number}, number2={$n2.number}, number3={$n3.number})
  ;

number returns [Number number]
@after {
	$number = new Number();
	$number.setDigits($syms);
	symbolSet.addAll($number.getCharacters());
}
  :
  ^(OPERAND syms+=SYMBOL+)
  ;
