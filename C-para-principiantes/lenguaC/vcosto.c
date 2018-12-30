#include<stdio.h>

main()
	{
		
		printf("VECTOR DE COSTO -- PRUEBA 01 \n ");
		
		int i, wi[1000],k;
		int n,c;
		float peso,w,costo,alfa;
			
		printf("Tamaño vector\n ");
		scanf("%d",&n);
		printf("DAME EL VECTOR PESO: \n");
		for (i=0;i<n;i++)
		{
		printf("W[%d",i);
		printf("]=");
		scanf("%d",&wi[i]);
		}
		
			w=0;
			k=10;
			alfa=0.75;
		for (i=0;i<n;i++)
		{
		w=w+wi[i];
		}
		costo=alfa*w;
		printf("CAPACIDAD W[i] es: %f",w);
		printf("\n");
		printf("COSTO: %f",costo);
		printf("\n");


	}
	

