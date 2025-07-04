%{
    #include <stdio.h>
    int algarismos = 0;
    int nLetras = 0;
    int nLinhas = 0;
    int nEspacos = 0;
    int caracteres = 0;
%}

NUMS [0-9]
LETRA [A-Za-z]
ESPACO [ ]
%%
{NUMS}{algarismos++;}
{LETRA}{nLetras++;}
{ESPACO}{nEspacos++;}
\t {nEspacos++;}
\n{nLinhas++;}
. {caracteres++;}

%%

int main() {
    yylex();
    printf("Algarismos: %d\n", algarismos);
    printf("Letras: %d\n", nLetras);
    printf("Espaços: %d\n", nEspacos);
    printf("Linhas: %d\n", nLinhas);
    printf("Caracteres: %d\n", caracteres); 
    return 0;
}