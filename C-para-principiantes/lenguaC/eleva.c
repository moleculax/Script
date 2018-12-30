# include <stdio.h>
# include <stdlib.h>
 main()
{    

       int b, e, p, i;
       float k;
       printf("Calculo de potencias de exponente entero > 0\n");
       printf("Introducir base y exponente\n");
       scanf("%d %d", &b, &e);
       if ( e<=0 ) exit(-1);
       else 
       { 
       for ( p=1, i=1; i<=e; ++i ) p *=b;
       printf("%d elevado a %d es %d\n", b, e, p);
	
       exit(0);
       }
}

