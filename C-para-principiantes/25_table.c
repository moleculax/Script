/* 25_tablen.c */ 
#include <stdio.h>

int main()
{
     int i, t; /* a new variable 't' */
     
     printf("Cual tabla quiere visualizar: (1 a N) \n  :"); scanf("%d", &t);
     for(i = 1; i <= 20; i++ )
          printf("\n%d * %d = %d", i, t, i * t);
     	  printf("\n");
	  return 0; 
}
