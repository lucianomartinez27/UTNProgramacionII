package clasecinco.ejercicio2;

// Agregación: Celular -> Bateria
// Asociación bidireccional: Celular <-> Usuario
public class Celular {
    private final String imei;
    private final String marca;
    private final String modelo;
    private Bateria bateria; // agregación (inyectada)
    private Usuario usuario; // bidireccional

    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }
}
