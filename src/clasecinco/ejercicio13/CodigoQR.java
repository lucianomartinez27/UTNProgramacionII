package clasecinco.ejercicio13;

// Asociación unidireccional: CodigoQR -> Usuario
public class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
