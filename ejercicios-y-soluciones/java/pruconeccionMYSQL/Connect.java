import java.sql.*;
	/**
	Este script conecta con unas Bd en Mysql selecciona algun campo y muestra en pantalla su contenido
	modificado por Emilio J. Gomez
	moleculax@gmail.com
	 **/

   public class Connect
   {
       public static void main (String[] args)
       {
           Connection conn = null;

           try
           {
               String userName = "root";
               String password = "";
               String url = "jdbc:mysql://localhost/bd_noticias";
               Class.forName ("com.mysql.jdbc.Driver").newInstance ();
               conn = DriverManager.getConnection (url, userName, password);
               System.out.println ("Database CONECCION ESTABLECIDA");
		
		//TROZOS NUEVOS
		if (conn !=null){ 
           	 Statement stmt = conn.createStatement(); 
            	 ResultSet res  = stmt.executeQuery("SELECT tit_not,fecha FROM tbl_noticias   "); 

           	 System.out.println("\nTITULAR \t \t\t\t \t \t\t\t  \t  FECHA \n"); 


            	while(res.next()) 
           	 { 
              	 String tit_not  = res.getString("tit_not"); 
              	 //String resumen   = res.getString("resumen"); 
              	 String fecha= res.getString("fecha"); 

		/**MUESTRA EN PANTALLA TITULAR Y FECHA DE LAS NOTICIAS **/

              	 System.out.print(""+tit_not); 
		 //System.out.print(" \t "+resumen);
		 System.out.println("\t  "+fecha);
           	 } 

           	 res.close(); 
            	 stmt.close(); 
           	 conn.close(); 
         	}
		
		//FIN TROZOS NUEVOS.


           }
           catch (Exception e)
           {
               System.err.println ("NO PUEDE CONECTAR CON EL  database server");
           }
           finally
           
	{
              
		 if (conn != null)
               {
                   try
                   {
                       conn.close ();
                       //System.out.println ("\nCONECCION CON LA BD TERMINADA");
		       //System.out.println ("Esta es una primera prueba de conexion Java-Mysql\n");

                   }
                   catch (Exception e) { /* ignora el error de cerrado */ }
               }
		
		
           }
       }
   }
