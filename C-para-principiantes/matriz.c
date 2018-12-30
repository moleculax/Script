#include<stdio.h>
main()
{
       int mat[4][4], i, j;
       printf("Visualización de la matriz: \n");
       
       for(i=0;i<4;i++){
               for(j=0;j<4;j++){
                       mat[i][j]=i+j;
                       printf("\t%d",mat[i][j]);
               }
               printf("\n");
       }
       printf("Fin del programa...\n");
}