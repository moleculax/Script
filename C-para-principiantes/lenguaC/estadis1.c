 #include<stdio.h>

    main()
    {
     int a[20],b[20],i,sx,sy,n,px,py;
     float mx,my,pend;

     printf("INTRODUZCA NUMERO DE MEDIDAS:\n");
     scanf("%d",&n);
     printf("INTRODUZCA LOS a(i):\n");

     for (i=0;i<n;++i){
         printf("a[%d",i);
         printf("]=");
         scanf("%d",&a[i]);
         }

     sx=0;
     px=1;

     for (i=0;i<n;++i){
         sx=sx+a[i];
              px=px*a[i];
         mx=sx/n;
        }
     printf("************************************************\n");
     printf("SUMATORIA DE LOS a(i):%d\n",sx);
     printf("PRODUCTO DE LOS a(i):%d\n",px);
     printf("MEDIA DE LOS a(i):%f\n",mx);
     printf("************************************************\n");
     printf("INTRODUZCA LOS b(i):\n");

     for (i=0;i<n;++i){
         printf("b[%d",i);
         printf("]=");
         scanf("%d",&b[i]);
         }

     py=1;
     sy=0;

     for (i=0;i<n;++i){
         sy=sy+b[i];
         py=py*b[i];
         my=sy/n;
          }
     printf("************************************************\n");
     printf("SUMATORIA DE LOS b(i):%d\n",sy);
     printf("PRODUCTO DE LOS b(i):%d\n",py);
     printf("MEDIA DE LOS b(i):%f\n",my);
     printf("************************************************\n");
     }