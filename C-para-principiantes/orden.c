#include <stdio.h>

int main ()
{

float x1,x2,x3,menor,mayor;

printf ("Ingre los valores :");
scanf ("%f %f %f",&x1,&x2,&x3);

menor = x1;

mayor = x3;


if ( x2 < menor )
menor = x2;
if ( x3 < menor )
menor = x3;

if ( x1 > mayor )
mayor = x1;
if ( x2 > mayor )
mayor = x2;

printf ("El orden de menor a mayor : %f %f\n",menor,mayor);

return (0);

}
