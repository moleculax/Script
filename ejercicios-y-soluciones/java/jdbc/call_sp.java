// * Ejemplo de como llamar procedimiento Oracle.
// *
// *  create procedure sp_1(
// *   v1 in   number,
// *   v2 out  number,
// *   v3 out  varchar2 )
// *  as
// *  begin
// *   v2 := v1 ;
// *   v3 := 'Hola mundo ' ;
// *  end ;

import java.sql.*;
import oracle.jdbc.driver.*;

class call_sp
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

// Obtiene la info del driver:
System.out.println("La version del driver JDBC es: " + meta.getDriverVersion());

// Llama a un procedimiento de Oracle
String call_sp_str = "{call SP_1(?,?,?) }" ;
CallableStatement stmt = conn.prepareCall(call_sp_str) ;

stmt.setInt(1,2) ;
stmt.registerOutParameter(2,Types.NUMERIC) ;
stmt.registerOutParameter(3,Types.CHAR) ;
stmt.executeUpdate() ;

int    v2 = stmt.getInt(2) ;
String v3 = stmt.getString(3) ;

System.out.println( "v2 = " + v2 + "  v3 = " + v3 ) ;

// Cierra la conexion
conn.close() ;
}
}
