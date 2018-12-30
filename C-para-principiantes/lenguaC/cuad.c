#include<stdio.h>
#include<math.h>
	main()

	{
	int u;
	float f;
	printf("DAME UN NUMERO ENTERO\n");
	scanf("%d",&u);
	if (u >= 0)
	{
	f = u*u;
	printf("El cuadrado de: %d",u);
	printf("  es: %f",f);
	}
	else {
	printf("Usted introdujo un numero negativo \n");
	}
	}

