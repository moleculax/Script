#include<stdio.h>

main()
	{

	printf("DAME LA CANTIDAD DE NUMEROS: \n");
		int n,i,num[20];
		float suma;
		int m;
		
		scanf("%d",&n);
		printf("DAME LOS NUMEROS\n");
		
		for(i=0;i<n;i++)
		{
		printf("n[%d",i);
		printf("]=");
		
		scanf("%d",&num[i]);
		
		}
		suma = 0;
		m =1;
		for(i=0;i<n;i++)
		{
		suma=suma+num[i];
		m=m*num[i];
		
		}
		printf("\n La suma es: %f",suma);
		printf("\n ");
		printf("\n La multiplicacion es: %d",m);
		printf("\n ");
	}
	

