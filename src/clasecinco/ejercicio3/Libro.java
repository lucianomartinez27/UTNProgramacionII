package clasecinco.ejercicio3;

// Asociación unidireccional: Libro -> Autor
// Agregación: Libro -> Editorial
public class Libro {
    private final String titulo;
    private final String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

}
