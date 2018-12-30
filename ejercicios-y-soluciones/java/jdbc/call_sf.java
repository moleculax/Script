// Ejemplo de como llamar una funcion de Oracle.
// 
// *  create or replace function sf_1( v1 number)
// *  return number
// *  as
// *  begin
// *    return( v1 )  ;
// *  end ;

import java.sql.*;
import oracle.jdbc.driver.*;

class call_sf
{
public static void main (String args [])
throws SQLException
{

// Carga el driver JDBC Oracle
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
String url = "jdbc:oracle:thin:pc/pc@127.0.0.1:1521:pc" ;
Connection conn = DriverManager.getConnection( url );

// Crea objeto DatabaseMetaData de Oracle 
DatabaseMetaData meta = conn.getMetaData ();

// Crea objeto DatabaseMetaData de Oracle 
System.out.println("La version del driver JDBC es: " + meta.getDriverVersion());

// Llama a una funcion de Oracle
String call_sf_str = "{? = call SF_1(?) }" ;
CallableStatement stmt = conn.prepareCall(call_sf_str) ;

stmt.setInt(2,2) ;
stmt.registerOutParameter(1,Types.NUMERIC) ;
stmt.executeUpdate() ;

int v1 = stmt.getInt(1) ;

System.out.println( "v1 = " + v1 ) ;

// Cierra la sentencia ejecutable.
stmt.close() ;

// Cierra la conexion.
conn.close() ;
}
}
