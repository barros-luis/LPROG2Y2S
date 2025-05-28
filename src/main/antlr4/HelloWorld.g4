grammar HelloWorld;

program : HELLO WORLD EOF {System.out.println("Hello World!!!");};

HELLO : 'HELLO';
WORLD : 'WORLD';
WS    : [ \t\r\n]+ -> skip; // Ignora espaços em branco, tabulações e novas linhas