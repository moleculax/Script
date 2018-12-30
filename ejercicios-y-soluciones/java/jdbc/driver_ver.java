// Obtener el número de versión del driver JDBC.

import java.sql.*;
import oracle.jdbc.driver.*;

class driver_ver
{
public static void main (String args [])
throws SQLException
{
// Carga el driver JDBC Oracle

DriverManager.registerDriver
(new oracle.jdbc.driver.OracleDriver());
Connection conn = DriverManager.getConnection("jdbc:oracle:thin:pc/pc@127.0.0.1:1521:pc");

// Crea objeto DatabaseMetaData de Oracle 
DatabaseMetaData meta = conn.getMetaData ();

// Obtiene la info del driver:
System.out.println("La version del driver JDBC es: " + meta.getDriverVersion());
}
}
