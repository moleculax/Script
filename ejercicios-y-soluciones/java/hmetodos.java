public class hmetodos {
public int  hmetodos=50;
public int numO=100;
public int Xf;
public static void main(String argv[]){
                hmetodos s = new hmetodos(); // se instancio hmetodos
                s.metodoImpresion();
        }//fin de main
        public void metodoImpresion(){
		//Al descomentar hmetodos=100 toma el valor 100 
		//ya que muere el metodo anterios
                // int  hmetodos=100;
		Xf=hmetodos+numO;
		
                System.out.println(Xf);
        }//fin del metodo 
}

