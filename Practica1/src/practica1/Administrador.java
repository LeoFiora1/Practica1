package practica1;

import java.util.ArrayList;

public class Administrador {
    private ArrayList<Libro> libros;
    private ArrayList<Autor> autores;

    public Administrador() {
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
    }

 
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void listarLibros() {
        for (Libro libro : libros) {
            System.out.println("Titulo: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", Disponible: " + libro.getDisponibilidad());
        }
    }
}


