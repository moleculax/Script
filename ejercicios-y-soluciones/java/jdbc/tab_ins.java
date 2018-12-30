// Insertar datos en una tabla Oracle.

import java.sql.*;
import oracle.jdbc.driver.*;

class tab_ins
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

// Inserta los datos a la tabla.
Statement stmt = conn.createStatement() ;
String insert = "INSERT INTO java_test ( col1, col2, col3 ) " +
                "VALUES ( 3, 'Third', sysdate ) " ;
stmt.executeUpdate(insert) ;
}
}
