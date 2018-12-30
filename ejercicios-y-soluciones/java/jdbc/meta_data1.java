// Ejemplo de manejo de meta-datos para un cursor

import java.sql.*;
import oracle.jdbc.driver.*;

class meta_data1
{
public static void main (String args [])
throws SQLException
{

// Carga el driver JDBC Oracle
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
String url = "jdbc:oracle:thin:pc/pc@127.0.0.1:1521:pc" ;

// Abre una conexion con la BD
Connection conn = DriverManager.getConnection( url );

// Crea objeto DatabaseMetaData de Oracle 
DatabaseMetaData meta = conn.getMetaData ();

// Obtiene la info del driver:
System.out.println("La version del driver JDBC es: " + meta.getDriverVersion());

String query_str = "select * from java_test" ;

Statement stmt = conn.createStatement() ;
ResultSet rs = stmt.executeQuery(query_str) ;
ResultSetMetaData rsmd = rs.getMetaData() ;

//Despliega el numero de columnas que posee la tabla.
int i = rsmd.getColumnCount() ;
System.out.println("La tabla tiene " + i + " columnas " ) ;

// Cierra la conexion con la BD
conn.close() ;
}
}
