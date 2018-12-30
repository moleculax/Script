#include <stdio.h>

#include <stdlib.h>
void calculodatos(int numero);
double factorial(int dato);
void main(void)
{
int numero;
char respuesta;
printf("\n\n\nINICIO DEL PROGRAMA\n\n\n");
printf("\n\nEl programa te calcula el valor del numero e.");
do {
do {
printf("\n\nIntroduzca un numero de terminos de la serie: ");
scanf("%d",&numero);
} while (numero<0);
calculodatos(numero);
printf("\n\n¨Desea introducir mas datos\?\n\n");
system("clear");
} while (respuesta=='s' || respuesta=='S');
printf("\n\n\n\t\tÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛ");
printf("\n\t\tÛÛÛ FIN DEL PROGRAMA ÛÛÛ");
printf("\n\t\tÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛ\n\n\n");
}
void calculodatos(int numero)
{
register int i;
register double e=1.;
for (i=1;i<=numero;i++) {
e=e+1./factorial(i);
}
printf("\n\nEl valor de e para %d terminos es %f.",numero,e);
}
double factorial(int dato)
{
register int i;
register double resultado=1;
for (i=dato;i>0;i--) resultado=resultado*i;
return resultado;
}


