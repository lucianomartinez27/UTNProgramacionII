package clasecinco.ejercicio7;

// Agregación: Vehiculo -> Motor
// Asociación bidireccional: Vehiculo <-> Conductor
public class Vehiculo {
    private final String patente;
    private final String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }

}
