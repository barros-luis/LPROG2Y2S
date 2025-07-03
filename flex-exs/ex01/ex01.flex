%{
    int count = 0;
%}

%%

abc     { count++; }
.|\n    { /* ignore all other characters */ }

%%

int main() {
    yylex();
    printf("Numero de ocorrencias: %d\n", count);
    return 0;
}