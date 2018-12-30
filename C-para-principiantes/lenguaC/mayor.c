 #include<stdio.h>

      main()

      {

      int m,i,n[50],z;
      int men;
      printf("INTRODUZCA CANTIDAD DE Nros\n");

      scanf("%d",&z);

      printf("INTRODUZCA LOS  N(i), ENTEROS:\n");

      for (i=0;i<z;++i)

      {

          printf("n[%d",i);

          printf("] =");
          
           scanf("%d",&n[i]);

      }

      printf("MAYOR:\n");


      m=n[0];

      for (i=0;i<z;++i)
	

      if (n[i]>m){

          m=n[i];
      }

      printf("%d\n",m);

      printf("MENOR:\n");

      men=n[0];
		for (i=0;i<z;++i)

      if (n[i]<men){

           men=n[i];
            
      }
       printf("%d \n",men);
     }