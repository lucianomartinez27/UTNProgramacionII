package clasecinco.ejercicio8;

// Composición: Documento -> FirmaDigital
// Agregación: FirmaDigital -> Usuario
public class Documento {
    private final String titulo;
    private final String contenido;
    private final FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
    }

}
