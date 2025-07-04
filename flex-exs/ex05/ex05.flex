%{
%}

NUM [0-9]+

%%

{NUM} {printf("%s ", yytext);}
. {}

%%

int main() {
    yylex();
    return 0;
}