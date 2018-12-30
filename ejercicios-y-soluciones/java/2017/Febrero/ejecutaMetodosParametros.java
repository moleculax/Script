import java.util.*;

public class ejecutaMetodosParametros { 

public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Intro nombre: ");
	
	String nombre;
	
	nombre = input.next();
	
	metodosParametros sal = new metodosParametros();
	sal.mensaje(nombre);
	

}

}