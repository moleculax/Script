#include <stdio.h>
main ( )
{
      int n1, n2, menor;
      
      printf ("Introducir dos enteros:\n");
      scanf ("%d%d", &n1, &n2);
      
       if (n1 < n2)
       
       {
       printf("El menor es: %d",n1);
       }
       if (n1 > n2)
       
       {
       
       printf("El menor es: %d",n2);
       }
       
      if (n1==n2)
      {
              printf ("LOS NUMEROS SON IGUALES \n");
      }
}

