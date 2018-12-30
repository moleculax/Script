package org.javahispano.jdbc;

/**
* <p>Título: Bean </p>
* @author Fernando Medina
* @email fernando.medina@agoranet.es
* @version 1.0
*/

public class Personal {

  private Integer codpers;
  private String nombre;
  private Integer edad;
  public Personal() {
  }
  public Integer getCodpers() {
    return codpers;
  }
  public void setCodpers(Integer codpers) {
    this.codpers = codpers;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getNombre() {
    return nombre;
  }
  public void setEdad(Integer edad) {
    this.edad = edad;
  }
  public Integer getEdad() {
    return edad;
  }
}
