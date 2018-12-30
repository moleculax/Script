 #define N 10
     main()
     {
         /*genera n termilnos*/

         int i,pn,ul,pr,n;
         i=1;
         pn=0;
         ul=1;
         pr=0;

         while (i<=N) {
         printf("%d \n",pr);
         pn=ul;
         ul=pr;
         pr=pn+ul;
         i++;

         }
       }
