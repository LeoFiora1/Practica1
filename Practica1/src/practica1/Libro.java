/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author user
 */
public abstract class Libro {
    private String titulo;
    private String autor;
    private String fecha;
    private String genero;
    private boolean disponibilidad;
    
    public Libro(String titulo, String autor, String fecha, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
        this.genero = genero;
        this.disponibilidad = true;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getFecha() {
        return fecha;
    }
    public String getGenero() {
        return genero;
    }
    public boolean getDisponibilidad() {
        return disponibilidad;
    }
        public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setfecha(String fecha){
        this.fecha = fecha;
    }
    public void setgenero(String genero){
        this.genero = genero;
    }
    public void setDisponibilidad(boolean disponibilidad){
        this.disponibilidad = disponibilidad;
    
    }
}
