package clasecinco.ejercicio1;

// Composición: Pasaporte -> Foto
// Asociación bidireccional: Pasaporte <-> Titular
public class Pasaporte {
    private final String numero;
    private final String fechaEmision;
    private Foto foto; // composición: creada y destruida con Pasaporte
    private Titular titular; // asociación bidireccional

    public Pasaporte(String numero, String fechaEmision, Titular titular, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
        this.titular = titular;
    }
}
