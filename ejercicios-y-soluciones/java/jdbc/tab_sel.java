// Obtener datos desde una sentencia sql de Oracle y imprimirla.


import java.sql.*;
import oracle.jdbc.driver.*;

class tab_sel
{
public static void main (String args [])
throws SQLException
{

// Carga el driver JDBC Oracle
DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());

String url = "jdbc:oracle:thin:pc/pc@127.0.0.1:1521:pc" ;
Connection conn = DriverManager.getConnection( url );

// Crea objeto DatabaseMetaData de Oracle 
DatabaseMetaData meta = conn.getMetaData ();

// Obtiene la info del driver:
System.out.println("La version del driver JDBC es: " + meta.getDriverVersion());

// Obtiene los datos de la tabla
Statement stmt = conn.createStatement() ;
String query = "SELECT col1, col2 FROM java_test" ;
ResultSet rs = stmt.executeQuery(query) ;
while ( rs.next()) {

  int    i1 = rs.getInt("col1") ;
  String s2 = rs.getString("col2") ;

  System.out.println( i1 + "    " + s2 ) ;

}
}
}
