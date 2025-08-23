package clasetres;

import java.time.Year;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    // Setter con validación para año de publicación
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > Year.now().getValue()) {
            System.out.println("Valor inválido. Año de publicación no puede ser mayor al añó actual.");
            return;  // no modifica si es inválido
        }
        this.anioPublicacion = anioPublicacion;
    }
}
