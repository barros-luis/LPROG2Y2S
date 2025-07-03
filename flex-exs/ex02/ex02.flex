%{
    char date[5];
    char isep[5];
%}

%%
FEUP    { printf("ISEP"); }
2007    { printf("2008"); }
.|\n    { printf("%s", yytext); }
%%

int main() {
    yylex();
    return 0;
}