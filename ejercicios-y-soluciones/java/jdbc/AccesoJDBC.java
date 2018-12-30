package org.javahispano.jdbc;

import java.sql.*;
import java.util.*;
import java.lang.reflect.*;

import javax.sql.*;

/**
* <p>Título: Acceso JDBC concreto </p>
* Clase que implementa el acceso a base de datos, aislando la capa de datos
( Connection, ResultSet...)
* de la cada de negocio ( Object[], HashMap[] ).
* De esta manera, podemos delegar el acceso a datos a esta clase, trabajando
en nuestra aplicación con
* los objetos, que son los que interesan.
* @author Fernando Medina
* @email fernando.medina@agoranet.es
* @version 1.0
*/

public class AccesoJDBC implements ItfAccesoJDBC {

  //Origen de datos
  private DataSource ds = null;
  //Driver de la base de datos
  private String driverBD = null;
  //URL de conexión a la base de datos
  private String url = null;

/**
* Constructor al que se la pasa la clase driver de base de datos y la url de
conexión para configurar
* el acceso a datos.Crea un acceso JDBC a la base de datos a partir del
driver y la url de conexion.
* @param driverBD Clase driver de acceso a la base de datos
* @param url URL de conexión a la base de datos ( origen de datos, usuario,
contraseña ... )
* @return Devuelve un objeto de acceso JDBC a la base de datos especificada.
*/
  public AccesoJDBC(String driverBD, String url ){
    this.driverBD = driverBD;
    this.url = url;
  }
/**
* Constructor al que se la pasa un origen de datos para configurar
* el acceso a datos.Crea un acceso JDBC a la base de datos a partir de un
datasource especificado.
* @param ds Origen de datos a la base de datos
* @return Devuelve un objeto de acceso JDBC a la base de datos especificada.
*/
  public AccesoJDBC(DataSource ds){
    this.ds = ds;
  }
/**
* Método que obtiene una conexión a la base de datos
* @return Devuelve un objeto de conexión( Connection ) a la base de datos
especificada.
*/
  private Connection getConnection() throws java.sql.SQLException,
AccesoJDBCException {
    if( (driverBD != null) && (url != null) ){
      try{
        Class.forName(driverBD);
        return DriverManager.getConnection(url);
      }catch(java.lang.ClassNotFoundException e){
        throw new AccesoJDBCException(e,1,e.getMessage());
      }
    }
    if( ds != null ) return ds.getConnection();
    return null;
  }

/** Método que convierte un ResultSet de registros de la base de datos en un
HashMap[]
* donde las claves son los nombres de los campos y los valores los valores
* de los campos en la base de datos
* @param rs ResultSet registros resultado de una consulta SQL a la base de
datos
* @return Devuelve un HashMap[] con todas las filas obtenidas, almacenando
el resultado en
* un HashMap como clave, el nombre de cada columna, y como valor, el valor.
*/
  private HashMap[] obtenerHashMaps( ResultSet rs ) throws
java.sql.SQLException {
    HashMap[] resultado = null;
    Vector listado = new Vector();
    ResultSetMetaData rsm = rs.getMetaData();

    //Almacenamos la tabla con las propiedades obtenidas y su resultado
    while( rs.next() ){
      HashMap ht = new HashMap();
      for( int i=1; i<=rsm.getColumnCount(); i++ ){
        ht.put( rsm.getColumnName(i), rs.getObject(i) );
      }
      listado.add(ht);
    }

    //Preparamos el resultado
    resultado = new HashMap[listado.size()];
    resultado = (HashMap[])listado.toArray(resultado);

    return resultado;
  }

/** Convierte un ResultSet de registros de la base de datos en un Object[]
* creando objetos del tipos especificado y poblándolos con los valores
* de los campos de la base de datos
* @param rs ResultSet registros resultado de una consulta SQL a la base de
datos
* @param clase Class del objeto que contendrá cada una de las filas de la
base de datos
* @return Devuelve un Object[](Clase[]) con todas las filas obtenidas,
almacenando el resultado en
* un Object del tipo especificado, poblado con los datos obtenidos de la
consulta.
*/
  private Object[] obtenerObjects( ResultSet rs, Class clase ) throws
java.sql.SQLException, AccesoJDBCException{

    HashMap[] resultado = null;
    Vector listado = new Vector();
    ResultSetMetaData rsm = rs.getMetaData();
    Hashtable equivalencia = new Hashtable();

    try{
      //Almacenamos la tabla con las propiedades obtenidas y su resultado
      while( rs.next() ){
        Object objeto = clase.newInstance();
        Object[] argsCampo = new Object[1];
        Class[] clasesArgs = new Class[1];
        Field []atts = clase.getDeclaredFields();

        //Para el primer registro, obtenemos la equivalencia entre columna y propiedad de la clase
        for( int i=1; i<=rsm.getColumnCount(); i++ ){
          argsCampo[0] = rs.getObject( i ); //Obtenemos el valor de cada campo de la tabla
          if( argsCampo[0] != null ){

            if( equivalencia.get( rsm.getColumnName(i) ) == null ){
              //Buscamos el atributo de la clase donde almacenar el valor de la columna
              for( int j=0; j<atts.length; j++ ){
                String nombreCampo = atts[j].getName();
                if( nombreCampo.toLowerCase().equals(rsm.getColumnName(i))
){
                  equivalencia.put( rsm.getColumnName(i), nombreCampo );
                  break;
                }
              }
            }

            String nombreCampo = ((String)equivalencia.get(
rsm.getColumnName(i) ));
            clasesArgs[0] = argsCampo[0].getClass();  //Obtenemos la clase de cada campo de la tabla
            clase.getMethod("set" + nombreCampo.substring(0,
1).toUpperCase() + nombreCampo.substring(1), clasesArgs).invoke(objeto,
argsCampo ); //Llamamos al método setProp(valorCampo)

          }
        }
        listado.add(objeto);
      }
    }catch(IllegalAccessException e){
      throw new AccesoJDBCException(e,2,e.getMessage());
    }catch(InstantiationException e){
      throw new AccesoJDBCException(e,3,e.getMessage());
    }catch(NoSuchMethodException e){
      throw new AccesoJDBCException(e,4,e.getMessage());
    }catch(InvocationTargetException e){
      throw new AccesoJDBCException(e,5,e.getMessage());
    }
    return listado.toArray( (Object
[])java.lang.reflect.Array.newInstance(clase,listado.size()) );
  }

/** Lanzamos una consulta SQL contra una conexión de la base de datos
seleccionada.
* @param sql Sentencia SQL de consulta que va a ser lanzada contra la base
de datos
* @return Devuelve un HashMap[] con todas las filas obtenidas, almacenando
el resultado en
* un HashMap como clave, el nombre de cada columna, y como valor, el valor.
*/
  public HashMap[] executeQuery(String sql) throws AccesoJDBCException {
    HashMap[] resultado = null;
    Connection c = null;
    ResultSet rs = null;
    Statement st = null;
    try{
       c = getConnection();
       st = c.createStatement();
       rs = st.executeQuery( sql );

       resultado = obtenerHashMaps(rs);

       rs.close();
       st.close();
       c.close();
    }catch(SQLException e){
      try{
        rs.close();
        st.close();
        c.close();
      }catch(SQLException se){
        try{
          c.close();
        }catch(SQLException te){}
      }finally{
        rs = null;
        st = null;
        c = null;
        throw new AccesoJDBCException(e,6,e.getMessage());
      }
    }catch(Exception e){
      try{
        rs.close();
        st.close();
        c.close();
      }catch(SQLException se){
        try{
          c.close();
        }catch(SQLException te){}
      }finally{
        rs = null;
        st = null;
        c = null;
        throw new AccesoJDBCException(e,0,e.getMessage());
      }
    }
    return resultado;
  }

/** Lanzamos una consulta SQL contra una conexión de la base de datos
seleccionada.
* @param sql Sentencia SQL de consulta que va a ser lanzada contra la base
de datos
* @param clase Class del objeto que contendrá cada una de las filas de la
base de datos
* @return Devuelve un Object[](Clase[]) con todas las filas obtenidas,
almacenando el resultado en
* un Object del tipo especificado, poblado con los datos obtenidos de la
consulta.
*/
  public Object[] executeQuery(String sql, Class clase) throws
AccesoJDBCException {
    Object[] resultado = null;
    Connection c = null;
    ResultSet rs = null;
    Statement st = null;
    try{
       c = getConnection();
       st = c.createStatement();
       rs = st.executeQuery( sql );

       resultado = obtenerObjects( rs, clase );

       rs.close();
       st.close();
       c.close();
    }catch(SQLException e){
      try{
        rs.close();
        st.close();
        c.close();
      }catch(SQLException se){
        try{
          c.close();
        }catch(SQLException te){}
      }finally{
        rs = null;
        st = null;
        c = null;
        throw new AccesoJDBCException(e,7,e.getMessage());
      }
    }catch(Exception e){
      try{
        rs.close();
        st.close();
        c.close();
      }catch(SQLException se){
        try{
          c.close();
        }catch(SQLException te){}
      }finally{
        rs = null;
        st = null;
        c = null;
        throw new AccesoJDBCException(e,0,e.getMessage());
      }
    }
    return resultado;
  }


/** Lanzamos una actualización SQL contra una conexión de la base de datos
seleccionada.
* @param sql Sentencia SQL de actualización que va a ser lanzada contra la
base de datos
*/
  public void executeUpdate(String sql) throws AccesoJDBCException  {
    Connection c = null;
    ResultSet rs = null;
    Statement st = null;
    ResultSetMetaData rsm = null;
    try{
       c = ds.getConnection();
       st = c.createStatement();
       st.executeUpdate( sql );
       st.close();
       //c.commit(); //Para transacciones
       c.close();
    }catch(SQLException e){
      try{
        st.close();
        //c.rollback();
        c.close();
      }catch(SQLException se){
        try{
          //c.rollback();
          c.close();
        }catch(SQLException te){}
      }finally{
        st = null;
        c = null;
        throw new AccesoJDBCException(e,8,e.getMessage());
      }
    }catch(Exception e){
      try{
        st.close();
        //c.rollback();
        c.close();
      }catch(SQLException se){
        try{
          //c.rollback();
          c.close();
        }catch(SQLException te){}
      }finally{
        st = null;
        c = null;
        throw new AccesoJDBCException(e,0,e.getMessage());
      }
    }
  }

  //Demostración de la creación de un acceso a base de datos y la invocación de los dos métodos
  public static void main(String args[]) throws Exception{
    AccesoJDBC acceso = new
AccesoJDBC("sun.jdbc.odbc.JdbcOdbcDriver","jdbc:odbc:bdatos");
    //Tabla persclin ( codpers, nombre, edad )
    HashMap[] resultado = acceso.executeQuery("select * from persclin");
    System.out.println( resultado );
    Personal[] resultado2 = (Personal[])acceso.executeQuery("select * from persclin", new Personal().getClass());
    System.out.println( resultado2 );
  }



}
