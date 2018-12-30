// Modifica los datos en una tabla Oracle

import java.sql.*;
import oracle.jdbc.driver.*;

class tab_upd
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

// Modifica los datos en una tabla
Statement stmt = conn.createStatement() ;
String update = "update java_test set col2 = 'second 1' WHERE col1  = 2 " ;
stmt.executeUpdate(update) ;
}
}
