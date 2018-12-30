public class Secuence {

       
	final int cantidad = 10;
      	int Fibo=1;
        int an = 1;
        int secuencia=0;
     
        public void displaySequence() {
        
        while (secuencia < cantidad) {
        		
        	secuencia =Fibo+an;
        	Fibo=an;
        	an=secuencia;   	
        	System.out.println("Secuencia: "+Fibo+an+secuencia);
        	
        	
        	
        		   }
        		   		}
        		   		
        		}
        		
       	