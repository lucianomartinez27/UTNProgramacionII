package clasecinco.ejercicio2;

public class Usuario {
    private final String nombre;
    private final String dni;
    private Celular celular; // bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
}
