 #include<stdio.h>

             main()

             {

               int i,j,n[500],k,aux;

               printf("program coyote2\n");
               printf("INTRODUZCA CANTIDAD DE NUMEROS\n");
               scanf("%d",&k);
               printf("INTRODUZCALOS\n");

               for (i=0;i<k;++i){

               printf("N[%d",i);
               printf("]=");
               scanf("%d",&n[i]);

               }

               for (i=0;i<k-1;++i)
for (j=i+1;j<k;++j)
               if (n[i]<n[j]){

               aux=n[i];
               n[i]=n[j];
               n[j]=aux;

               }

               printf("ORDEN DECRECIENTE:\n");

               for (i=0;i<k;++i){

               printf("%d\n",n[i]);

               }

              } 