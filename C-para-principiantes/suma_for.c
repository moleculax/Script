/* fichero suma_for.c */
/* Programa para sumar los enteros del 1 al 5 */
#include <stdio.h>
main()
{
   int i=1, suma = 0;
   for ( ; i <= 5 ; )     /* primera forma */
   {
      suma += i;
      ++i;
   }
   printf("suma 1 = %d\n", suma);
   suma = 0;        /* segunda forma */
   for ( i = 1; i <= 5; ++i)
      suma += i;
   printf("suma 2 = %d\n", suma);
   for( i = 1, suma = 0; i <= 5 ; ++i, suma+=i)  /* tercera forma */
      ;
   printf("suma 3 = %d\n", suma);
   for( i = 1, suma = 0; i <= 5 ; suma+=i, ++i)  /* cuarta forma */
      ;
   printf("suma 4 = %d\n", suma);
}

