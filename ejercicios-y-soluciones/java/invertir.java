public class invertir {
  public static void main (String[] args) {
   
	 String cadenaTexto = "Emilio Jose Gomez";
    
    	 String inversion= ""; // El resultado invertido

    for (int i=0; i<cadenaTexto.length(); i++)

      inversion= cadenaTexto.substring(i,i+1) + inversion;

    System.out.println(inversion);

    					 }
			}
