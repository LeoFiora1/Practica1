/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author user
 */
public class Prestamos {
    private Libro libro;
    private Usuario usuario;
    private String prestamo;
    private String devolucion;

    public Prestamos(Libro libro, Usuario usuario, String prestamo, String devolucion) {
        this.libro = libro;
        this.usuario = usuario;
        this.prestamo = prestamo;
        this.devolucion = devolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getPrestamo() {
        return prestamo;
    }

    public String getDevolucion() {
        return devolucion;
    }
}