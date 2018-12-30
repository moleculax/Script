/* cumana, 02/08/07...
Integrantes: rosanny mendoza c.i: 17539073
	     yuselis vital c.i: 17761853
objetivo: 2.- algoritmo de ordenamiento y busqueda*/



/* # include <conio.h> */
# include <stdio.h>
# include <string.h>

  struct vector{
       int dia;
       int mes;
       int anio;
  };
  int n=3;
  struct vector fecha[3], buscado, valorcentral;

  void cargar_vector();
  void orde_burbuja();
  int buscar_fec();
//  void insertar_fec();

   int dia;
   int mes;
   int anio;

 // void
	 main(){
      int opc, num;

      do{
	/* clrscr(); */
	printf("\n *** Menu Principal ***\n");
	printf("\n1._ Cargar los datos en el arreglo:");
	printf("\n2._ Ordenar de forma decreciente por metodo de burbuja:");
	printf("\n3._ Buscar una determinada fecha:");
	printf("\n4._ Insertar una nueva fecha:");
	printf("\n5._ Salir.\n\n\n");
	printf("Seleccione su opcion.\n");
	scanf("%d",&opc);
	switch(opc){

	      case 1:
		cargar_vector();
	      break;
	      case 2:
		   orde_burbuja();
		   break;
	      case 3:
		   buscar_fec(/*bus_fec*/);
		   break;
	      case 4:
//		   insertar_fec();
		   break;
	      case 5:
		   printf("\n Usted a seleccionado la opcion Salir.\n");
		   break;
	}
	/* getch(); */
      }while(opc!=5);
  }

  //desarrollo de funciones

  void cargar_vector(){
       int i;

       printf("\n Introduzca los elementos del arreglo:\n\n");
       for(i=0;i<3;i++){
	  printf("\n Dia:");
	  scanf("%d",&fecha[i].dia);
	  printf("\n Mes:");
	  scanf("%d",&fecha[i].mes);
	  printf("\n A¤o:");
	  scanf("%d",&fecha[i].anio);

	  printf("\n\n La fecha es: %d/%d/%d\n\n",fecha[i].dia,fecha[i].mes,fecha[i].anio);
       }
  }


  void orde_burbuja(){
       int i,j,aux;
       for(i=0;i<n-1;i++){
	  for(j=0;j<n-i-1;j++){
	     if (fecha[j].anio>fecha[j+1].anio){
		aux=fecha[j].dia;
		fecha[j].dia=fecha[j+1].dia;
		fecha[j+1].dia=aux;

		aux=fecha[j].mes;
		fecha[j].mes=fecha[j+1].mes;
		fecha[j+1].mes=aux;

		aux=fecha[j].anio;
		fecha[j].anio=fecha[j+1].anio;
		fecha[j+1].anio=aux;
	     }
	     else if (fecha[j].mes>fecha[j+1].mes){
		aux=fecha[j].dia;
		fecha[j].dia=fecha[j+1].dia;
		fecha[j+1].dia=aux;

		aux=fecha[j].mes;
		fecha[j].mes=fecha[j+1].mes;
		fecha[j+1].mes=aux;

		aux=fecha[j].anio;
		fecha[j].anio=fecha[j+1].anio;
		fecha[j+1].anio=aux;
	      }
	     /* if ((fecha[j].dia)>(fecha[j+1].dia)){
		       aux=fecha[j].dia;
		       fecha[j].dia=fecha[j+1].dia;
		       fecha[j+1].dia=aux;

		       aux=fecha[j].mes;
		       fecha[j].mes=fecha[j+1].mes;
		       fecha[j+1].mes=aux;

		       aux=fecha[j].anio;
		       fecha[j].anio=fecha[j+1].anio;
		       fecha[j+1].anio=aux;
		     }   */
	   }
       }
       for (i=0;i<3;i++){
	  printf("\n La fecha es:%d/ %d/ %d",fecha[i].dia,fecha[i].mes,fecha[i].anio);
       }
  }

 int buscar_fec(){

     int bajo, alto, central, pos;
     int r=0;
     int j=-1;

     /* clrscr(); */
     printf("\n\n   Dia: ");
     scanf("%d",&buscado.dia);
     printf("\n\n   Mes: ");
     scanf("%d",&buscado.mes);
     printf("\n\n   A¤o: ");
     scanf("%d",&buscado.anio);

     bajo=0;
     alto=n-1; 
	

     while(bajo<=alto){
	/* clrscr(); */
	j++;
	central=(bajo+alto)/2;
	valorcentral.dia=fecha[central].dia;
	valorcentral.mes=fecha[central].mes;
	valorcentral.anio=fecha[central].anio;

	if(((buscado.dia==valorcentral.dia)&&(buscado.mes==valorcentral.mes)&&(buscado.anio==valorcentral.anio)) && (j<=n)){
	    if (r==0)
	      pos=central;
	      r++;
			

	    break;
	}
	else if((buscado.dia>valorcentral.dia)&&(buscado.mes>valorcentral.mes)&&(buscado.anio>valorcentral.anio)){
	     printf("La fecha no se encontro");
	     alto=central-1;
     }
	else
	   bajo=central+1;
  }
	
	printf("\nLa fecha esta en la posicion: %d", pos);
	printf("\n esta repetida: %d",r);  
	/* getch(); */
}
