 #include<stdio.h>
        main()

      {

        int m,n,i,j,a[10][10],b[10][10],c[10][10],p[10][10];
        printf("PARA PODER SUMAR LAS MATRICES INTRODUZCA  M = N:\n");
        printf("INTRODUZCA VALOR DE M\n");
        scanf("%d",&m);
        printf("INTRODUZCA VALOR DE N\n");
        scanf("%d",&n);
        printf("INTRODUZCA LOS A(I,J):\n");

      for (i=0;i<m;++i)
      for (j=0;j<n;++j)

      {

        printf("a[%d",i);
        printf("][%d",j);
        printf("]=");
        scanf("%d",&a[i][j]);
        
       }

         printf("INTRODUZCA LOS B(I.J):\n");

       for (i=0;i<m;++i)
       for (j=0;j<n;++j)

       {

         printf("b[%d",i);
         printf("][%d",j);
         printf("]=");
         scanf("%d",&b[i][j]);

        }

         printf("SUMATRIZ (suma de las dos matrices):\n");

        c[i][j]=0;
        for (i=0;i<m;++i)
        for (j=0;j<n;++j)
        
        {
          c[i][j]=c[i][j]+a[i][j]+b[i][j];

        }

        for (i=0;i<m;++i)
        for (j=0;j<n;++j)

        {
          printf("c[%d",i);
          printf("][%d",j);
          printf("]=");
          printf("%d\n",c[i][j]);

       }

      }