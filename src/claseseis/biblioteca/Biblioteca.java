package claseseis.biblioteca;

import java.util.*;

public class Biblioteca {
    private String nombre;
    private final List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        if (buscarLibroPorIsbn(isbn) == null) {
            libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
        }
    }

    public void listarLibros() {
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (Objects.equals(l.getIsbn(), isbn)) return l;
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        return libros.removeIf(pr -> pr.getIsbn().equals(isbn));
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> res = new ArrayList<>();
        for (Libro l : libros) if (l.getAnioPublicacion() == anio) res.add(l);
        return res;
    }

    public void mostrarAutoresDisponibles() {
        // Mostrar autores únicos presentes en la biblioteca
        Set<String> autores = new HashSet<>();
        for (Libro l : libros) {
            if (l.getAutor() != null) autores.add(l.getAutor().getNombre());
        }
        for (String a : autores) System.out.println(a);
    }
}
