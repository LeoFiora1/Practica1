/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author user
 */

public class Usuario {
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String identificacion;

    public Usuario(String nombre, String apellido, String direccion, String telefono, String identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
}

    public String getApellido() {
        return apellido;
}

    public String getDireccion() {
        return direccion;
}

    public String getTelefono() {
      return telefono;
}

    public String getIdentificacion() {
     return identificacion;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
}

    public void setApellido(String apellido) {
     this.apellido = apellido;
}

    public void setDireccion(String direccion) {
        this.direccion = direccion;
}

    public void setTelefono(String telefono) {
        this.telefono = telefono;
}

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
}
}