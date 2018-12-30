import java.io.*;
	public class lecturaTeclado 
	{
		public static void main(String Arg[ ]) throws IOException
		{
	   
			BufferedReader in = new BufferedReader(new 
        		InputStreamReader(System.in));

			int num;

			System.out.print("Ingrese numero : ");
			num = Integer.parseInt(in.readLine( ));
			System.out.println("Ud ingreso el numero : " + num );
		}
	} 
