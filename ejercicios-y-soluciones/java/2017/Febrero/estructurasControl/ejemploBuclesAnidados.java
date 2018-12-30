 /*
 * Programa que dibuja un rectángulo sólido de asteriscos.
 * El número de filas y columnas se pide por teclado
 */
import java.util.*;

public class ejemploBuclesAnidados {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        
        //leer número de filas hasta que sea un número > 0
        
        do{
           System.out.print("Introduce número de filas: ");
           filas = sc.nextInt();
           
        }while(filas<1);
        
        //leer número de columnas hasta que sea un número > 0
        do{
        	
           System.out.print("Introduce número de columnas: ");
           columnas = sc.nextInt();
           
        }while(columnas<1);
        
        for(int i = 1; i<=filas; i++){    //filas
        
            for(int j = 1; j<=columnas; j++){   //columnas
            
                 System.out.print(" * ");
                 
            }
            
            System.out.println();
        }
       
    }
}