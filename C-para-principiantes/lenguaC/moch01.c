#include<stdio.h>
main()
{
	
	int i,j,n;
	int valor[1000],peso[1000],k,M;
	int s[1000][1000];
	int sol[1000][1000];
		
	printf("NUMERO DE ELEMENTOS(n): \n ");
	scanf("%d",&n);
	printf("PESO MAXIMO: \n ");
	scanf("%d",&M);
	for (i=0;i<n;++i)
	{
	printf("ELEMENTO[%d",i);
	printf("]=");
	scanf("%d",&valor[i]);
	}
	for (i=0;i<n;++i)
	{
	printf("\n");
	printf("PESO[%d",i);
	printf("]=");
	scanf("%d",&peso[i]);
	}
	for (i=1;i<n;i++)
	for (j=0;j<M;j++)
	{
	sol[i][j]=s[i-1][j];
	printf("\n");
	printf("solucion[%d",i);
	printf("]");
	printf("[%d",j);
	printf("]=%d",sol[i][j]);
	printf("\n");
	}

}

/* :COMPILADO:05/07/06 05:31:07::  */

