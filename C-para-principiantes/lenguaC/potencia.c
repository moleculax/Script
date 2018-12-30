/*
   Calcula potencias de base real positiva y exponente entero
*/
#include <stdio.h>
main ( )
{
  int exponente;
  float base, potencia (float, int);
  printf ("Introducir BASE: \n");
  
   scanf ("%f", &base);
   printf ("Introducir EXPONENTE: \n");
   scanf ("%d",&exponente);
   
  if ( base <= 0.0 ) printf ("Solo admito bases positivas \n");
  else { if ( exponente > 0 )
        printf ("Potencia: %f \n", potencia(base, exponente));
            else
                 printf ("Potencia: %f \n",
                                             1.0/potencia(base, -exponente));
        }
}

float potencia (float b, int e)
{
        if ( b == 1.0 ) return (1.0);
        else {
                 if ( e == 1 ) return ( b );
                 else {
                         int i; float p=1.0;
                         for ( i=1; i<=e; i++ ) p=p*b;
                         return ( p );
                 }
        }
}



