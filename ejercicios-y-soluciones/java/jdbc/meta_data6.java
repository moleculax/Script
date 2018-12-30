// ******************************************************************
// * File    : meta_data5.java
// * Author  : Peter Crompton
// * Date    : 16th October 2000
// *
// * Purpose : Example of handling meta data for the database.
// *
// ******************************************************************

import java.sql.*;
import oracle.jdbc.driver.*;

class meta_data6
{
public static void main (String args [])
throws SQLException
{

try {

  // Load the Oracle JDBC driver
  DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
  String url = "jdbc:oracle:thin:pc/pc@127.0.0.1:1521:pc" ;

  // Open a database connection
  Connection conn = DriverManager.getConnection( url );

  // Create Oracle DatabaseMetaData object
  DatabaseMetaData meta = conn.getMetaData ();

  String dbmsName = meta.getDatabaseProductName();
  ResultSet rs = meta.getTableTypes();
  System.out.print("The following types of tables are ");
  System.out.println("available in " + dbmsName + ": \n ");

  while (rs.next()) {
	String tableType = rs.getString("TABLE_TYPE");
	System.out.println("    " + tableType);
                    }

  rs.close();
  // Close the database connection
  conn.close();

  } catch(SQLException ex) {
	  System.err.print("SQLException: ");
	  System.err.println(ex.getMessage());
  }
}
}
