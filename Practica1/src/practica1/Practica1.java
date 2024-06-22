/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;
import java.util.Scanner;
/**
 *
 * @author user
 */

public class Practica1 {
    private static Administrador administrador = new Administrador();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            mostrarMenu();
            int opcion = Integer.parseInt(scanner.nextLine());

            if (opcion == 1) {
                registrarAutor(scanner);
            } else if (opcion == 2) {
                listarAutores();
            } else if (opcion == 3) {
                registrarLibro(scanner);
            } else if (opcion == 4) {
                listarLibros();
            } else if (opcion == 5) {
                registrarUsuario(scanner);
            } else if (opcion == 6) {
                listarUsuarios();
            } else if (opcion == 7) {
                running = false;
            } else {
                System.out.println("Opcion no valida. Intente de nuevo.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("Menu");
        System.out.println("1. Registrar Autor");
        System.out.println("2. Listar Autores");
        System.out.println("3. Registrar Libro");
        System.out.println("4. Listar Libros");
        System.out.println("5. Registrar Usuario");
        System.out.println("6. Listar Usuarios");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    private static void registrarLibro(Scanner scanner) {
        System.out.print("Ingrese el titulo del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese la fecha de publicacion del libro: ");
        String fecha = scanner.nextLine();
        System.out.print("Ingrese el genero del libro: ");
        String genero = scanner.nextLine();

        Libro libro = new Manga(titulo, autor, fecha, genero); 
        administrador.agregarLibro(libro);
        System.out.println("Libro registrado con exito: " + titulo);
    }

    private static void listarLibros() {
        System.out.println("Listado de libros:");
        administrador.listarLibros();
    }

    private static void registrarAutor(Scanner scanner) {
        System.out.print("Ingrese el nombre del autor: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del autor: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese la nacionalidad del autor: ");
        String nacionalidad = scanner.nextLine();
        System.out.print("Ingrese la fecha de nacimiento del autor: ");
        String nacimiento = scanner.nextLine();

        Autor autor = new Autor(nombre, apellido, nacionalidad, nacimiento);
        System.out.println("Autor registrado con exito: " + nombre + " " + apellido);
    }

    private static void listarAutores() {
        System.out.println("Listado de autores:");
    }

    private static void registrarUsuario(Scanner scanner) {
        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del usuario: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese la direccion del usuario: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese el telefono del usuario: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese el numero de identificacion del usuario: ");
        String identificacion = scanner.nextLine();

        Usuario usuario = new Usuario(nombre, apellido, direccion, telefono, identificacion);
        System.out.println("Usuario registrado con exito: " + nombre + " " + apellido);
    }

    private static void listarUsuarios() {
        System.out.println("Listado de usuarios:");
    }
}

