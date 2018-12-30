package org.javahispano.jdbc;

/**
* <p>Título: Interfaz acceso JDBC </p>
* @author Fernando Medina
* @email fernando.medina@agoranet.es
* @version 1.0
*/


public interface ItfAccesoJDBC {
  public java.util.HashMap[] executeQuery(String sql) throws
AccesoJDBCException;
  public Object[] executeQuery(String sql, Class clase) throws
AccesoJDBCException;
  public void executeUpdate(String sql) throws AccesoJDBCException;
}
