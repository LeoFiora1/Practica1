/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author user
 */
public class Autor {
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String nacimiento;
    
    public Autor(String titulo, String autor, String fecha, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.nacimiento = nacimiento;

    }
    
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public String getNacimiento() {
        return nacimiento;
    }

        public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
    public void setNacimiento(String nacimiento){
        this.nacimiento = nacimiento;
    }
}
