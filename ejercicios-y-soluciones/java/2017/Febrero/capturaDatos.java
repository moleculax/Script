import java.util.*;

public class  capturaDatos {


public void datosPersonales(){

		String nombre;
		String apellido;
		Scanner inputN = new Scanner(System.in);
		Scanner inputA = new Scanner(System.in);
		
		System.out.print("Introduzca Nombre:  ");
		nombre = inputN.next();
		
		System.out.print("Introduzca Apellido:  ");
		apellido = inputA.next();	
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		
}

public void printerDat() {

	System.out.println("//////////////////////////////////");

}


}