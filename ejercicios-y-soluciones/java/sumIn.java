	import java.io.*; //importa la mayoria de las clases.
	public  class sumIn {

   	 public static void main(String arg[ ]) throws IOException
    	{
       		 int x,y,z;
		 int i,n;
		 int s_U;
		 //BufferedReader nos provee el comportamiento base para modelar la entrada de datos

		 BufferedReader in = new BufferedReader(new  InputStreamReader(System.in));


       		 System.out.print("Ingrese cantidad de  numeros : ");
		//permite la entrada desde el teclado del primer dato numerico
        	 n = Integer.parseInt(in.readLine( ));
    		
		s_U=0;
		for (i=1;i<=n;++i) {
       		 System.out.print("n["+i);
		 System.out.print("]=");
        	 x = Integer.parseInt(in.readLine( ));
		s_U=s_U+x;
		}
    
       		 System.out.print("SUM["+n);       
       		 System.out.println("]=" + s_U);
    	}    
    
  
	}
