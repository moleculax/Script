	import java.io.*; //importa la mayoria de las clases.
	public  class suma {

   	 public static void main(String arg[ ]) throws IOException
    	{
       		 int x,y,z;
		 //BufferedReader nos provee el comportamiento
		 // base para modelar la entrada de datos
        	BufferedReader in = new BufferedReader(new 
           	InputStreamReader(System.in));

       		 System.out.print("Ingrese un numero : ");
		//permite la entrada desde el teclado del primer dato numerico
        	 x = Integer.parseInt(in.readLine( ));
    
       		 System.out.print("Ingrese un numero : ");
        	 y = Integer.parseInt(in.readLine( ));

		 System.out.print("Ingrese un numero :");
		 z = Integer.parseInt(in.readLine( ));
    
       		 int s = suma(x,y,z);
        
       		 System.out.println("La suma es : " + s);
    	}    
    
     public static int suma(int a,int b,int c)
    	{
        return a + b + c;    
    	}
  
	}
