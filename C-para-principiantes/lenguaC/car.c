#include <stdio.h>
	main( )
	{
	char c;
	printf("Dame una letra \n");
	c=getchar( );
	if ( ( c>=65 ) && ( c<=90 ) )
        printf("Es letra mayuscula\n");
	else {
               if ( (c>=97) && (c<=122) )
                       printf("Es letra minuscula\n");
               else
                       printf("No es un caracter alfabetico\n");
        }
	}

