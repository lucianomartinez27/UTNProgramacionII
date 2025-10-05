package claseseis.biblioteca;

import java.util.List;

public class BibliotecaDemo {
    public static void main(String[] args) {
        // 1. Creamos una biblioteca.
        Biblioteca b = new Biblioteca("Biblioteca Central");

        // 2. Crear al menos tres autores
        Autor a1 = new Autor("A1", "Julio Verne", "Francia");
        Autor a2 = new Autor("A2", "J. K. Rowling", "Reino Unido");
        Autor a3 = new Autor("A3", "Gabriel García Márquez", "Colombia");

        // 3. Agregar 5 libros
        b.agregarLibro("ISBN1", "Viaje al centro de la Tierra", 1864, a1);
        b.agregarLibro("ISBN2", "La vuelta al mundo en 80 días", 1873, a1);
        b.agregarLibro("ISBN3", "Harry Potter y la piedra filosofal", 1997, a2);
        b.agregarLibro("ISBN4", "Cien años de soledad", 1967, a3);
        b.agregarLibro("ISBN5", "El amor en los tiempos del cólera", 1985, a3);

        // 4. Listar todos los libros
        System.out.println("-- Libros --");
        b.listarLibros();

        // 5. Buscar un libro por su ISBN y mostrar su información.
        System.out.println("\n-- Buscar ISBN3 --");
        Libro l = b.buscarLibroPorIsbn("ISBN3");
        if (l != null) l.mostrarInfo();

        // 6. Filtrar y mostrar los libros publicados en un año específico.
        System.out.println("\n-- Libros de 1873 --");
        for (Libro libro : b.filtrarLibrosPorAnio(1873)) libro.mostrarInfo();

        // 7. Eliminar un libro por su ISBN y listar los libros restantes.
        System.out.println("\n-- Eliminar ISBN2 --");
        b.eliminarLibro("ISBN2");
        b.listarLibros();

        // 8. Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("\nCantidad total de libros: " + b.obtenerCantidadLibros());

        // 9. Listar todos los autores de los libros disponibles en la biblioteca.
        System.out.println("\n-- Autores disponibles --");
        b.mostrarAutoresDisponibles();
    }
}
