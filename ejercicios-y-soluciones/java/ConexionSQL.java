import java.sql.*;


public class ConexionSQL
{
    public static void main(String[] args)
    {
        try 
        {
            /*Crea una nueva instancia del Driver jdbc de mysql*/
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            /*Realiza la conexion de manera 'anonima' a la maquina 
             *local y accede a la base de datos: 'nombre de la BD'
             */
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bd_noticias");
            
            /*Damos la cadena con la consulta a la base de datos*/
            String query = "SELECT * FROM tbl_noticias";
            
            /*Creamos un nuevo Statement*/
            Statement stmt = conn.createStatement();
            
            /*Ejecutamos la consulta*/
            ResultSet rs = stmt.executeQuery(query);
            
            /*Nos movemos a traves de las filas*/
            while (rs.next()) 
            {
                System.out.println("Id: " + rs.getInt(1) + 
                             "\tTitulares: " + rs.getString("tit_not"));
            }
        } 
        catch (Exception e) 
        {
        	/*Imprimir la expcecion para tomar medidas*/
            e.printStackTrace();
        }
    }
}
