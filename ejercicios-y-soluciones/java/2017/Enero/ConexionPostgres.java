package prueba;    
       import java.sql.*;
       
      
      public class ConexionPostgres {
      
          public void consultar() {
               String cc = "jdbc:postgresql://127.0.0.1/bd_electoral?" +
                  "user=admin&password=admin*-";
              try {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(cc);
                  Statement comando = conexion.createStatement();
                 String sql =
                     "SELECT cedula,primer_nombre FROM tbl_sucre ORDER BY cedula";
                  ResultSet resultado = comando.executeQuery(sql);
                  while(resultado.next()) {
                      String n = resultado.getString("cedula");
                      String a = resultado.getString("primer_nombre");
                      System.out.println(n + " " + a);
                  }
                  resultado.close();
                  comando.close();
                  conexion.close();
              } catch(Exception e) {
                 System.out.println(e.getMessage());
             }
         }
    
          public static void main(String[] args) {
            ConexionPostgres cp = new ConexionPostgres();
              cp.consultar();
         }
     }