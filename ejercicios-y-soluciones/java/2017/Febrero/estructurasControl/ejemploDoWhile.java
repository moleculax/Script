 /*
 * Programa que obliga al usuario a introducir un número menor que 100
 */
import java.util.*;

public class ejemploDoWhile {
	
    public static void main(String[] args) {
    	
        int valor;
        Scanner in = new Scanner( System.in );
        
        do {
            System.out.print("Escribe un entero < 100: ");
            valor = in.nextInt();
        }
        
        while (valor >= 100);
        
        System.out.println("Ha introducido: " + valor);
    }
}