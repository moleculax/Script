#include<stdio.h>

main()
	{

	int edad;
	char nombre[50];
	printf("Dame tu edad  \n");
	scanf("%d",&edad);
	printf("Dame tu nombre  \n");
	scanf("%s",&nombre);
	printf("Tu edad:%d \n",edad);
	printf("Tu nombre :%s \n",nombre);
	if (edad > 30)
	{
	printf("Estas viejo \n ");
	}
	else
	{
	printf("Que joven eres \n ");
	}
	
	
	}
	

