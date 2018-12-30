import java.sql.*;

public class TestMysql
{
  public static void main(String args[]) {
    try {
      /* Test loading driver */

      String driver = "com.mysql.jdbc.Driver";

      System.out.println( "=> loading driver:" );
      Class.forName( driver );
      System.out.println( "OK" );

      /* Test the connection */

      String url = "jdbc:mysql://localhost/test";

      System.out.println( "=> connecting:" );
      DriverManager.getConnection( url, "", "" );
      System.out.println( "OK" );
    }
    catch( Exception x ) {
      x.printStackTrace();
    }
  }
}
