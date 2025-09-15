package clasecinco.ejercicio12;

public class Contribuyente {
    private final String nombre;
    private final String cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String getNombre() { return nombre; }
    public String getCuil() { return cuil; }
}
