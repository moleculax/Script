package org.javahispano;


import java.sql.*;

/**
 * Objetivo:  Facilitar la conexion a BD's Microsoft Access y MySQL.
 * Descripcion:  Esta clase permite conectarse a una BD Microsoft Access o a una BD MySQL de una forma muy facil.
 * Para que tengas una idea de como usar esta clase e aqui un ejemplo:
 * <pre>
 * 	ConexionBD con = new ConexionBD();
  con.conectarMySQL("localhost","nombre_bd","root","");
  Integer num = new Integer("1");
  con.iniciarBloque("nombre_tabla");
   con.insertarCampo("nombre_columna1",num);
   con.insertarCampo("nombre_columna2","campo_nuevo1");
   con.insertarCampo("nombre_columna3","campo_nuevo2");
  con.cerrarBloque();
  con.eliminarCampo("nombre_tabla","columna_llave","campo_a_eliminar");
  Integer objeto = new Integer("3");
  con.eliminarCampo("nombre_tabla","columna_llave",objeto);
 * </pre>
 * Los parametros que puedes insertar, eliminar, buscar, actualizar de la BD no tienen que ser
 * necesariamente cadenas de caracteres; pueden ser cualquier tipo de objeto, por eso recuerda pasarlo
 * como un objeto.
 * Si tienes alguna pregunta o duda acerca del uso de la clase o de cualquier otra cosa, solo tienes que mandar
 * un correo en ESPAÑOL y con gusto sera contestado.
 * @author Rubén Mario Figueroa Villa.  e-mail1: villa1a@hotmail.com  e-mail2:hola-jeje@colombia.com
 * @since Creado el 09-oct-2003 en Cali-Colombia con la version 1.4.2 del SDK
 * @version SDK 1.4.2
 */

public class ConexionBD{
  private Connection conexion = null;
  private Statement sentencia = null;
  private ResultSet rs = null;

  /**
   * Crea un objeto ConexionBD necesario para realizar la conexion y otras tareas sencillas.
   */
  public ConexionBD() {
    super();
  }

  /**
   * Realiza la coenxion a una BD Microsoft Access. Debe recordar configurar el origen
   * de datos en Windows. PanelDeControl->OrigenDeDatos(ODBC)->DSNdeSistema.
   * @param nombreBD  Nombre de la BD.
   * @param usuario  Nombre de usuario si lo tiene.
   * @param clave  Clave de la BD Access, en caso de que la tenga.
   */
  public void conectarAccess(String nombreBD, String usuario, String clave) {
    try {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    }
    catch (ClassNotFoundException e) {
      System.err.println("'conectarAccess()' Error al intentar cargar Driver. " +
                         e.getMessage());
      e.printStackTrace();
    }
    try {
      String url = "jdbc:odbc:" + nombreBD;
      conexion = DriverManager.getConnection(url, usuario, clave);
    }
    catch (SQLException e) {
      System.err.println("'conectarAccess()' Error al intentar conectarse. " +
                         e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Realiza la coenxion a una BD MySQL.  Debe recordar añadir al proyecto el archivo '.jar' de MySQL.
   * @param maquina  Nombre o direccion de la maquina donde se encuentra la BD MySQL.
   * @param nombreBD  Nombre de la BD.
   * @param usuario  Nombre de usuario.
   * @param clave  Clave de la BD MySQL.
   */
  public void conectarMySQL(String maquina, String nombreBD, String usuario,
                            String clave) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    }
    catch (ClassNotFoundException e) {
      System.err.println("'conectarMySQL()' Error al intentar cargar Driver. " +
                         e.getMessage());
      e.printStackTrace();
    }
    try {
      String url = "jdbc:mysql://" + maquina + ":3306/" + nombreBD;
      conexion = DriverManager.getConnection(url, usuario, clave);
    }
    catch (SQLException e) {
      System.err.println("'conectarMySQL()' Error al intentar conectarse. " +
                         e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Da informacion basica acerca de la conexion.  La informacion la arroja por consola.
   */
  public void informacionConexion() {
    try {
      System.out.println("Modo auto-commit:" + conexion.getAutoCommit());
      System.out.println("Catalogo:" + conexion.getCatalog());
      System.out.println("Conexion cerrada:" + conexion.isClosed());
      System.out.println("Conexion de solo lectura:" + conexion.isReadOnly());
    }
    catch (SQLException e) {
      System.err.println("'informacionConexion()' Error al intentar dar informacion basica acerca de la conexion. " +
                         e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * libera la memoria usada por el objeto.  Ademas libera cualquier otro recurso de la BD que se este utilizando.
   */
  public void cerrarConexion() {
    try {
      conexion.close();
    }
    catch (Exception e) {
      System.err.println(
          "'cerrarConexion()' Error al intentar cerrar conexion. " +
          e.getMessage());
      e.printStackTrace();
    }
  }

  /**
       * Necesario para poder insertar datos a la tabla.  Este metodo debe de ir antes
       * de utilizar el metodo insertarCampo(String nombreColumna,Object valorColumna).
   * Al terminar de insertar todos los datos deseados a la Tabla 'nombreTabla' se debe
   * terminar con el metodo cerrarBloque().
   * @param nombreTabla  Nombre de la tabla en la cual se va a introducir el registro.
   */
  public void iniciarBloque(String nombreTabla) {
    try {
      sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                           ResultSet.CONCUR_UPDATABLE);
      rs = sentencia.executeQuery("SELECT * FROM " + nombreTabla);
      rs.moveToInsertRow();
    }
    catch (SQLException e) {
      System.err.println("'iniciarBloque()' Error en iniciar bloque. " +
                         e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Permite insertar campos a la BD.  Este/os metodo/s debe/n ir entre los metodos
   * iniciarBloque(String nombreTabla) y cerrarBloque().
   * @param nombreColumna  Nombre de la columna en la cual se desea insertar el dato.
   * @param valorColumna  valor que se desea insertar.
   */
  public void insertarCampo(String nombreColumna, Object valorColumna) {
    try {
      rs.updateObject(nombreColumna, valorColumna);
    }
    catch (SQLException e) {
      System.err.println(
          "'insertarCampo()' Error al intentar insertar campo a la BD. " +
          e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Necesario para poder guardar el registro a la BD.  Este metodo debe ir despues
   * del/os metodo/s insertarCampo(String nombreColumna,Object valorColumna).
   */
  public void cerrarBloque() {
    try {
      if (rs != null) {
        rs.insertRow();
        rs.close();
        sentencia.close();
      }
    }
    catch (SQLException e) {
      System.err.println("'cerrarBloque()' eRROR al guardar en la BD. " +
                         e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Realiza una busqueda en una tabla de la BD, en caso de haber encontrado el campo
   * requerido devuelve true, en caso contrario devolvera false.
   * @param nombreTabla  Nombre de la tabla donde se busca.
   * @param nombreColumna  Nombre de la columna donde se lleva a cabo la busqueda, dentro de la tabla 'nombreTabla'.
   * @param nombreCampoBuscado  Campo que se quiere buscar dentro de la tabla especificada.
   * @return  true en caso de que se encuentre el campo buscado, de lo contrario devuelve false.
   */
  public boolean existeCampo(String nombreTabla, String nombreColumna,
                             Object nombreCampoBuscado) {
    try {
      sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                           ResultSet.CONCUR_READ_ONLY);
      rs = sentencia.executeQuery("SELECT " + nombreColumna + " FROM " +
                                  nombreTabla);
      while (rs.next()) {
        if (rs.getObject(1).equals(nombreCampoBuscado))
          return true;
      }
    }
    catch (SQLException e) {
      System.err.println("'buscarCampo()' Error al bucar campo. " +
                         e.getMessage());
      e.printStackTrace();
    }
    return false;
  }

  /**
   * Realiza una busqueda en una tabla de la BD; por cada campo que coincida con el campo que se esta
   * buscando, se incrementa una variable de tipo long, al final devuelve el numero de ampos iguales que encontro.
   * @param nombreTabla  Nombre de la tabla donde se busca.
   * @param nombreColumna  Nombre de la columna donde se lleva a cabo la busqueda, dentro de la tabla 'nombreTabla'.
   * @param nombreCampoBuscado  Campo que se quiere buscar dentro de la tabla especificada.
   * @return El numero de coincidencias que se encontro.
   */
  public long buscarCampo(String nombreTabla, String nombreColumna,
                          Object nombreCampoBuscado) {
    long cantidad = 0;
    try {
      sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                           ResultSet.CONCUR_READ_ONLY);
      rs = sentencia.executeQuery("SELECT " + nombreColumna + " FROM " +
                                  nombreTabla);
      while (rs.next()) {
        if (rs.getObject(1).equals(nombreCampoBuscado))
          cantidad++;
      }
    }
    catch (SQLException e) {
      System.err.println("'buscarCampo()' Error al bucar campo. " +
                         e.getMessage());
      e.printStackTrace();
    }
    return cantidad;
  }

  /**
   * Actualiza un solo campo de la tabla especificada.
       * @param nombreTabla  Nombre de la tabla donde se realizara la actualizacion.
   * @param nombreColumna   Nombre de la columna donde se lleva a cabo la actualizacion, dentro de la tabla 'nombreTabla'.
   * @param nombreCampoActual  Nombre del campo que se quiere remplazar.
   * @param nombreCampoNuevo  Campo nuevo que reemplazará al campo actual.
   */
  public void actualizarCampo(String nombreTabla, String nombreColumna,
                              Object nombreCampoActual, Object nombreCampoNuevo) {
    try {
      sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                           ResultSet.CONCUR_UPDATABLE);
      rs = sentencia.executeQuery("SELECT * FROM " + nombreTabla);
      while (rs.next()) {
        if (rs.getObject(nombreColumna).equals(nombreCampoActual)) {
          rs.updateObject(nombreColumna, nombreCampoNuevo);
          rs.updateRow();
        }
      }
    }
    catch (SQLException e) {
      System.err.println("'actualizarCampo()' Error al actualizar campo. " +
                         e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Elimina un registro dentro la tabla especificada.  El campo que se desea eliminar debe ser la llave de la tabla
   * @param nombreTabla  Nombre de la tabla dentro de la cual se llevara a cabo la eliminacion.
   * @param nombreColumnaLLave  Nombre de la columna llave donde se buscara el campo a eliminar.
   * @param nombreCampo  campo que se desea eliminar
   */
  public void eliminarCampo(String nombreTabla, String nombreColumnaLLave,
                            Object nombreCampo) {
    try {
      sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                           ResultSet.CONCUR_UPDATABLE);
      rs = sentencia.executeQuery("SELECT " + nombreColumnaLLave + " FROM " +
                                  nombreTabla);
      while (rs.next()) {
        if (rs.getObject(1).toString().equals(nombreCampo.toString()))
          rs.deleteRow();
      }
    }
    catch (SQLException e) {
      System.err.println("'eliminarCampo()' Error al eliminar campo. " +
                         e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Este metodo permite al programador realizar una consulta sql a la BD. La sentencia SELECT que se pase
   * debe ir sin punto y coma(;).  Luego el programador sabra que hacer con la variable ResultSet que retorna este metodo.
   * En el caso de que ocurra un error al intentar de realizar la consulta el metodo retornara null.
   * @return una variable ResultSet
   */
  public ResultSet Select(String select) {
    try {
      sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                           ResultSet.CONCUR_READ_ONLY);
      rs = sentencia.executeQuery(select);
      return rs;
    }
    catch (SQLException e) {
      System.err.println("'Select()' Error al intentar ejecutar select. " +
                         e.getMessage());
      e.printStackTrace();
    }
    return null;
  }

  /**
   * Permite al programador poder usar la conexion que ya se ha abierto.  Esto le evita
   * al programador tener que abrir una nueva conexion.  Esto podria ser necesaria
   * en caso de que sea necesario por parte del programador realizar algunas tareas
   * que no son posibles llevar a cabo con esta clase.
   * @return la conexion
   */
  public Connection getConexion() {
    return this.conexion;
  }

  /**
   * Dá acceso al ResultSet.
   * @return la variable ResultSet
   */
  public ResultSet getRs() {
    return this.rs;
  }

  /**
   * Permite al programador poder usar transacciones con la base de datos, es decir,
   * que hasta que no confirmemos los cambios realizados en las tablas, dichos cambios
   * no seran guardados en la tabla.
   * Si no se confirma la transaccion, los cambios seran descartados.
   */
  public void IniciarTransaccion() throws SQLException{
    conexion.setAutoCommit(true);
  }

  /**
   * Permite al programador poder descartar los cambios realizados hasta el momento por
   * cualquier razon.
   */
  public void CancelarTransaccion() throws SQLException{
    conexion.rollback();
  }

  /**
   * Permite al programador aceptar los cambios realizados hasta el momento en
   * las tablas de la base de datos.
   */
  public void ConfirmarTransaccion() throws SQLException{
    conexion.commit();
  }

  /**
   * Permite al programador ejecutar sentencias SQL INSERT, UPDATE, o DELETE
   * directamente, solo ha de pasar la sentencia SQL correctamente formada.
   * Este metodo no devolvera nada.
   */
  void ejecutaConsulta(String sql) throws SQLException{
    // Creamos una sentencia SQL
    sentencia = conexion.createStatement();

    // Ejecutamos la consulta
    sentencia.executeUpdate(sql);

    sentencia.close();
  }

  /**
   * Permite al programador ejecutar sentencias SQL SELECT directamente,
   * solo ha de pasar la sentencia SQL correctamente formada.
   * Este metodo devolvera un objeto ResultSet sin posicionar, para posicionarse
   * usar el metodo next().
   */
  ResultSet getConsulta(String sql) throws SQLException{
    sentencia = conexion.createStatement();

    // Ejecutamos la consulta
    rs = sentencia.executeQuery(sql);

    return rs;
  }
}
