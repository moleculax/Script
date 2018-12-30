import java.io.*;

public class entrada {
   public static void main( String args[] ) throws IOException {
      int c;
      int contador = 0;
      while( (c = System.in.read() ) != '\n' ) {
         contador++;
         System.out.print( (char)c );
      }
      System.out.println();    // Línea en blanco
      System.err.println( "Contados "+ contador +" bytes en total." );
   }
}
