//calcula Numeros aleatorios

public class mochilaCm {
  public static void main(String[] args) {
    	byte   max = 100;
	int i,j;
	double peso,div;
	double prod;
	double costo;
	int k;
	k=10;
	double alfa;
	alfa = 0.75;
	double C;
	double peso1;
	double costoiz, costoder;
		
	 
	
	System.out.println("MOCHILITA ");
   	
	peso1 =0;
	for(i=1;i<=max;i++){
      	peso = Math.random();
	//System.out.print("A["+i);
      	//System.out.println("]="+peso);
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
