package clasecinco.ejercicio13;

// Dependencia de creación: GeneradorQR.generar(String, Usuario)
public class GeneradorQR {

    public CodigoQR generar(String valor, Usuario usuario) {
        // Crea un CodigoQR pero no lo conserva como atributo
        CodigoQR qr = new CodigoQR(valor);
        qr.setUsuario(usuario);
        return qr;
    }
}
