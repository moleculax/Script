 #include<stdio.h>
      main()
      {

      int i,j;

      /* ilustra los operadores logicos */

      printf("INTRODUZCA UNO O CERO\n");

      scanf("%d%d",&i,&j);

      printf("%d and %d es %d\n",i,j,i&&j);

      printf("%d or %d es %d\n",i,j,i||j);

      printf("not %d  %d\n",i,!i);

      printf("not %d  %d\n",j,!j);

      }
      