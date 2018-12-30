// ******************************************************************
// * File    : tab_preupdtran.java
// * Author  : Peter Crompton
// * Date    : 16th October 2000
// *
// * Purpose : Example of how to switch off autocommit.
// * Autocommit means commit after every statement.
// * We DON'T want this as it stops us from creating transactions,
// * ie With a trasaction all of the updates happen to none of them.
// *
// ******************************************************************

import java.sql.*;
import oracle.jdbc.driver.*;

class tab_preupdtran
{
public static void main (String args [])
throws SQLException
{

// Load the Oracle JDBC driver
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
String url = "jdbc:oracle:thin:pc/pc@127.0.0.1:1521:pc" ;
Connection conn = DriverManager.getConnection( url );

// Create Oracle DatabaseMetaData object
DatabaseMetaData meta = conn.getMetaData ();

// gets driver info:
System.out.println("JDBC driver version is " + meta.getDriverVersion());

// Switch off autocommit.
conn.setAutoCommit(false) ;

// Update one row in the table
Statement stmt = conn.createStatement() ;
String update_str = "UPDATE java_test " +
                    "SET    col2 = ? " +
                    "WHERE  col1 = ? " ;

PreparedStatement update = conn.prepareStatement( update_str ) ;
update.setString(1, "Third 3") ;
update.setInt(2, 3) ;
int n1 = update.executeUpdate() ;
System.out.println("The number of rows updated : " + n1 ) ;

// Update another row in the table
update.setString(1, "Forth 4") ;
update.setInt(2, 4) ;
int n2 = update.executeUpdate() ;
System.out.println("The number of rows updated : " + n2 ) ;

// Commit the transaction
conn.commit() ;
conn.setAutoCommit(true) ;

}
}
