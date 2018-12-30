// ******************************************************************
// * File    : excep_1.java
// * Author  : Peter Crompton
// * Date    : 16th October 2000
// *
// * Purpose : Exception processing.
// *
// ******************************************************************

import java.sql.*;
import oracle.jdbc.driver.*;

class excep_1
{
public static void main (String args [])
throws SQLException
{

// Load the Oracle JDBC driver
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
String url =  "jdbc:oracle:thin:pc/pc@127.0.0.1:1521:pc" ;
Connection conn = DriverManager.getConnection( url );

// Create Oracle DatabaseMetaData object
DatabaseMetaData meta = conn.getMetaData ();

// gets driver info:
System.out.println("JDBC driver version is " + meta.getDriverVersion());

// Call an Oracle function
String call_sf_str = "{? = call SF_12(?) }" ;

try {
  CallableStatement stmt = conn.prepareCall(call_sf_str) ;
  stmt.setInt(2,2) ;
  stmt.registerOutParameter(1,Types.NUMERIC) ;
  stmt.executeUpdate() ;

  int    v1 = stmt.getInt(1) ;

  System.out.println( "v1 = " + v1 ) ;

    } catch( SQLException ex ) {
		System.err.println("SQLException: " + ex.getMessage());
						   }

// Close the connection
conn.close() ;
}
}
