//calcula Numeros aleatorios

public class mochilaC {
  public static void main(String[] args) {
    	int   max = 100;
	int i,j;
	int peso;
	float div;
	int prod;
	int costo;
	int k;
	k=10;
	
	double alfa = 0.75;
	double C;
	float peso1;
	float  costoiz, costoder;
	 
	
	System.out.println("CALCULO DE VALORES INICIALES  ");
   	
	peso1 =0;
	for(i=1;i<=max;i++){
      	peso = (int)(Math.random())*1000;
	System.out.print("A["+i);
      	System.out.println("]="+peso);
	costo=peso+k;
	div = costo/peso;
	System.out.println("DIV: "+div);
	if (div>=(costo/peso)){
	System.out.print("PESO["+i);
      	System.out.println("]="+peso);
	}
	
	System.out.print("Vector costo =[ "+i);
	System.out.println("]="+costo);
	peso1 = peso1+peso;
	costoiz =(costo/peso);
	
		}
	
	
	System.out.println("Peso1 ="+peso1);
	C=alfa*peso1;
	System.out.println("Capacidad = "+C);
    

	  }
	} 
