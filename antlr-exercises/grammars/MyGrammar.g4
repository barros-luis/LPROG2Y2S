// grammars/MyGrammar.g4
grammar MyGrammar;

options {
    language=Java; // Good practice to specify
    packageName='com.example.parser'; // <<-- THIS IS CRUCIAL
}

startRule
    : expression EOF
    ;

expression
    : term ( (PLUS | MINUS) term )*
    ;

term
    : factor ( (MUL | DIV) factor )*
    ;

factor
    : NUMBER
    | LPAREN expression RPAREN
    ;

PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
LPAREN: '(';
RPAREN: ')';
NUMBER: [0-9]+ ('.' [0-9]+)?;
WS: [ \t\r\n]+ -> skip;