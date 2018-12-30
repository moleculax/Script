/* random.c */
#include <stdio.h>
#include <sys/types.h>
#include <time.h>

main()
{
        int i;
        time_t t1;
	/* srand 48 devulve enteros largos no negativos distribuidos
	uniformemente entre 0 y 2 exponente 31 */

        (void) time(&t1);
        srand48((long) t1);
        /* usar time en segundos para poner la semilla */
        printf("5 numeros aleatorios (semilla = %d):\n",(int) t1);
        for (i=0;i<5;++i)
                printf("%d ", lrand48());
        printf("\n\n");
}


