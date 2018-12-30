package org.javahispano.jdbc;

/**
* <p>Título: Excepción acceso JDBC </p>
* @author Fernando Medina
* @email fernando.medina@agoranet.es
* @version 1.0
*/

/** Excepción producida al acceder a JDBC con la clase AccesoJDBC
* Es buena idea, almacenar la excepción de la cual procede, un codigo de
error
* y el mensaje descriptivo del error.
* */
public class AccesoJDBCException extends Exception {
  //Código de error
  private int codigo;

  public int getCodigo(){
    return codigo;
  }

  public AccesoJDBCException(Throwable e) {
    super(e);
  }

  public AccesoJDBCException(Throwable e, int codigo ) {
    super(e);
    this.codigo = codigo;
  }

  //Método recomendado
  public AccesoJDBCException(Throwable e, int codigo, String mensaje ) {
    super(mensaje,e);
    this.codigo = codigo;
  }
}
