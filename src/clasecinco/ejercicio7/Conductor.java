package clasecinco.ejercicio7;

public class Conductor {
    private final String nombre;
    private final String licencia;
    private Vehiculo vehiculo; // bidireccional

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

}
