package clasecinco.ejercicio8;

public class FirmaDigital {
    private final String codigoHash;
    private final String fecha;
    private final Usuario usuario; // agregación

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

}
