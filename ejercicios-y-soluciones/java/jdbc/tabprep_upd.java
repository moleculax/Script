// Obtener datos de una sentencia SQL e imprimirlos a pantalla.

import java.sql.*;
import oracle.jdbc.driver.*;

class tabprep_upd
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

// Obtiene datos desde una tabla
Statement stmt = conn.createStatement() ;
String update_str = "UPDATE java_test " +
                    "SET    col2 = ? " +
                    "WHERE  col1 = ? " ;

PreparedStatement update = conn.prepareStatement( update_str ) ;

update.setString(1, "Sixth 1") ;
update.setInt(2, 6) ;
int n = update.executeUpdate() ;
System.out.println("The number of rows updated : " + n ) ;

}
}
