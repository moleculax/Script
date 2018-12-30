import java.util.*;

public class cast0 {
	//public static void main(String[] args) {
	public void texto() {
	System.out.println("Ejercicio simple, a*b/100");	
		}	
	public void ejecuta() {
	float byte1 ;
	float byte2 ;
	float byte3;
	Scanner datos = new Scanner(System.in);
	System.out.println("Intro primer valor: ");
	byte1 = datos.nextInt();
	System.out.println("Intro segundo valor: ");
	byte2 = datos.nextInt();
	
	byte3 = (float) (byte1*byte2/100);
	System.out.println("Resultado:\n"+byte3);	
	
	}

}
