 #include<stdio.h>

           main()

           {
             /* use solo valores enteros de M,N,C */

             int aux,i,Cons,j,A[10][10],M,N,B[10][10],S[20][20],R[10][10];

             printf("Program const for matriz and A[i,j]*b[i,j]\n");

             printf("INT. VALOR DE M:\n");

             scanf("%d",&N);

             printf("INT. VALOR DE N:\n");

             scanf("%d",&M);

             printf("INT. VALOR DE LA CONSTANTE:\n");

             scanf("%d",&Cons);
              printf("INT. LOS A[i,j]:\n");

             for (i=0;i<M;++i)
             for (j=0;j<N;++j)

             {

              printf("A[%d",i);
              printf("][%d",j);
              printf("]=");
              scanf("%d",&A[i][j]);

              }

             printf("LA CONSTANTE POR A[i,j] ES:\n");


             for (i=0;i<M;++i)
             for (j=0;j<N;++j)

             {
              
               R[i][j]=Cons*A[i][j];
               printf("%d\n ",R[i][j]);

              }

              }