//calcula Numeros aleatorios

public class aleatorio {
  public static void main(String[] args) {
    	byte   max = 100;
	int i;
	double peso;
	double prod;
	double costo;
	int k;
	k=10;
	double alfa;
	alfa = 0.75;
	double C;
	double peso1;
	 
	
	System.out.println("CALCULO DE 100 NUMERO ALEATORIO ");
   	
	peso1 =0;
	for(i=1;i<=max;i++){
      	peso = Math.random();
	System.out.print("A["+i);
      	System.out.println("]="+peso);
	costo=peso+k;
	System.out.print("Vector costo =[ "+i);
	System.out.println("]="+costo);
	peso1 = peso1+peso;

	}
	System.out.println("Peso1 ="+peso1);
	C=alfa*peso1;
	System.out.println("Capacidad = "+C);
    

	  }
	} 
