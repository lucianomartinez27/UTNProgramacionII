package clasecinco.ejercicio2;

// Agregación: Celular -> Bateria
// Asociación bidireccional: Celular <-> Usuario
public class Celular {
    private final String imei;
    private final String marca;
    private final String modelo;
    private Bateria bateria; // agregación (inyectada por setter)
    private Usuario usuario; // bidireccional

    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
}
