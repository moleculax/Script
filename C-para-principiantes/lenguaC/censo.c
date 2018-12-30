/*Programa censo estadistico*/
/*Lenguaje C */
/*Probado y ejecutado en GNU/Linux*/
/*Junio 2014 */

#include<stdio.h>

	int cod_cda,cod_v,cant_personas;
	int nino1,nino6,adultos,casos,t_ninos,i;
	
	codigo() {
		printf("TABLA INFORMATIVA CODIGO CIUDAD \n");
		printf("###############################\n");
		printf("Codigo ---------- Ciudad \n");
		printf("    1 ---------- Sata Fe \n");
		printf("    2 ---------- Casanay \n");
		printf("    3 ---------- Cariaco \n");
		printf("    4 ---------- Araya  \n");
		printf("    5 ---------- Guiria \n");
		printf("###############################\n");
	}
	vivienda() {
		printf("TABLA INFORMATIVA CODIGO TIPO VIVIENDA \n");
		printf("#################################\n");
		printf("Codigo ---------- Tipo vivienda \n");
		printf("    1 ---------- Extrema pobreza\n");
		printf("    2 ---------- Humilde \n");
		printf("    3 ---------- Normal\n");
		printf("    4 ---------- Acomodada \n");
		printf("    5 ---------- Lujosa\n");
		printf("###############################\n");
	}
	
	lecturaCodigo() {
		
		printf("INTRODUZCA CODIGO CORRESPONDIENTE A LA CIUDAD: \n");
		scanf("%d",&cod_cda);
		if (cod_cda>5 || cod_cda<1 )
		printf("ERROR EN EL CODIGO INTRODUCIDO");
		
	}
	
	lecturaVivienda() {
		
		printf("INTRODUZCA CODIGO CORRESPONDIENTE A LA VIVIENDA: \n");
		scanf("%d",&cod_v);
		if (cod_v>5 || cod_v<1 )
		printf("ERROR EN EL CODIGO INTRODUCIDO");
		
		}
	
	personas() {
		printf("CANTIDAD DE ADULTOS QUE HABITAN EN LA VIVIENDA: \n");
		scanf("%d",&adultos);
		printf("CANTIDAD DE NINOS DE 1 A 6 ANOS: \n");
		scanf("%d",&nino1);
		printf("CANTIDAD DE NINOS DE 6 A 12 ANOS: \n");
		scanf("%d",&nino6);
		
		}
		inquilinos(){
		cant_personas=nino1+nino6+adultos;
		t_ninos=nino1+nino6;
			}
		
		clas_familia(){
		if(cod_v==1 && t_ninos>6) 
		printf("\nFAMILIA EN POBRESA EXTREMA ");
		if(cod_v!=1 && t_ninos<=7 && cant_personas<=9) 
		printf("\nLA FAMILIA NO ESTA EN POBRESA EXTREMA\n");
		
		
		}
	resul() {
		printf("CANTIDAD DE ADULTOS: %d \nNINOS MENORES DE 6 ANOS: %d \nNINOS MAYORES DE 6 ANOS: %d \n",adultos,nino1,nino6);
		printf("TOTAL NINOS: %d",t_ninos);		
		printf("\nCANTIDAD DE PERSONAS QUE HABITAN EN LA VIVIENDA: %d \n",cant_personas);
		
	
		
		}

	ubicacion(){
		if(cod_cda==1)
		printf("\nUBICACION: SANTA FE");
		if(cod_cda==2)
		printf("\nUBICACION: CASANAY");
		if(cod_cda==3)
		printf("\nUBICACION: CARIACO");
		if(cod_cda==4)
		printf("\nUBICACION: ARAYA");
		if(cod_cda==5)
		printf("\nUBICACION: GUIRIA");
		}
	separador(){
	for(i=0;i<=35;i++) 
	printf("/");
		}
	

		
	
main() {
	
		codigo();
		lecturaCodigo();
		vivienda();
		lecturaVivienda();
		personas();
		
		separador();
		printf("\nRESULTADOS:\n");
		inquilinos();
		resul();
		clas_familia();
		ubicacion();
		printf("\n");
		separador();
		printf("\n");
		
		}
		
		
		

		


	




