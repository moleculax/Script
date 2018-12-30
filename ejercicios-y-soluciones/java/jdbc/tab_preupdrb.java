// Ejemplo de como ejecutar un rollback.

import java.sql.*;
import oracle.jdbc.driver.*;

class tab_preupdrb
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

// Apaga opcion autocommit.
conn.setAutoCommit(false) ;

// Modifica una fila en la tabla
Statement stmt = conn.createStatement() ;
String update_str = "UPDATE java_test " +
                    "SET    col2 = ? " +
                    "WHERE  col1 = ? " ;

PreparedStatement update = conn.prepareStatement( update_str ) ;
update.setString(1, "First 1") ;
update.setInt(2, 1) ;
int n1 = update.executeUpdate() ;
System.out.println("The number of rows updated : " + n1 ) ;

//Rollback de la modificacion previa.
conn.rollback() ;

// Modifica otra fila en la tabla
update.setString(1, "Second 2") ;
update.setInt(2, 2) ;
int n2 = update.executeUpdate() ;
System.out.println("The number of rows updated : " + n2 ) ;

// Commit de la transaccion
conn.commit() ;
conn.setAutoCommit(true) ;

}
}
