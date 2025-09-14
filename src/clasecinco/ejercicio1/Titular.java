package clasecinco.ejercicio1;

public class Titular {
    private final String nombre;
    private final String dni;
    private Pasaporte pasaporte; // asociación bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }
}
