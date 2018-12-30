//importamos la clase Scanner que se encuentra en el paquete java.util
//import java.util.Scanner;
import java.util.*;
public class introDatos {

    public static void main(String args[]){
        //creamos el objeto Scanner que nos va a permitir utilizar los metodos de captura
        Scanner entrada = new Scanner(System.in);
        //declaramos las variables en las que vamos a meter los valores
        String nombre;
        int edad;
        double estatura;

        //Mandamos por pantalla los mensajes correspondientes al usuario
        System.out.println("Introduce nombre: ");
        //utilizamos el objeto entrada de tipo Scanner que previamente creamos e invocamos al metodo next()
        //esto nos permitira capturar una cadena. Luego asignamos esa cadena a la variable nombre
        nombre=entrada.next();
        System.out.println("Introduce edad: ");
        //el metodo nextInt() se invoca cuando se requiere capturar un entero
        edad=entrada.nextInt();
        System.out.println("Introduce estatura: ");
        //y por ultimo el metodo nextDouble nos permite capturar un valor de tipo double
        estatura=entrada.nextDouble();

        //Luego vamos a imprimir los valores capturados
        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Tu edad es: "+edad);
        System.out.println("Tu estatura es: "+estatura);

    }
}
 
//fin programa