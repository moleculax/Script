import java.sql.*; 

public class TestConnection 
{ 
   static String bd = "bd_noticias"; 
   static String login = "root"; 
   static String password = ""; 
   static String url = "jdbc:mysql://localhost/"+bd; 


   public static void main(String[] args) throws Exception 
   { 
      Connection conn = null; 

      try 
      { 
         Class.forName("com.mysql.jdbc.Driver").newInstance(); 

         conn = DriverManager.getConnection(url,login,password); 

         if (conn != null) 
         { 
            System.out.println("Conexión a base de datos "+url+" ... Ok"); 
            conn.close(); 
         } 
      } 
      catch(SQLException ex) 
      { 
         System.out.println(ex); 
      } 
      catch(ClassNotFoundException ex) 
      { 
         System.out.println(ex); 
      } 

   } 
}
