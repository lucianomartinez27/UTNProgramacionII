package clasecinco.ejercicio11;

// Asociación unidireccional: Cancion -> Artista
public class Cancion {
    private final String titulo;
    private Artista artista;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getTitulo() { return titulo; }
    public Artista getArtista() { return artista; }
}
