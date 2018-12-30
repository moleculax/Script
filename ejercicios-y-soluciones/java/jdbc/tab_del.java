// Borrar datos de una tabla Oracle.

import java.sql.*;
import oracle.jdbc.driver.*;

class tab_del
{
public static void main (String args [])
throws SQLException
{
// Carga el driver JDBC Oracle

DriverManager.registerDriver
(new oracle.jdbc.driver.OracleDriver());
String url = "jdbc:oracle:thin:pc/pc@127.0.0.1:1521:pc" ;
Connection conn = DriverManager.getConnection( url );

// Crea objeto DatabaseMetaData de Oracle 
DatabaseMetaData meta = conn.getMetaData ();

// Obtiene la info del driver:
System.out.println("La version del driver JDBC es: " + meta.getDriverVersion());

// Borra los datos de la tabla.
Statement stmt = conn.createStatement() ;
String delete = "DELETE FROM java_test WHERE col1 = 3 " ;
stmt.executeUpdate(delete) ;
}
}
