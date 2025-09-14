package clasecinco.ejercicio10;

import clasecinco.ejercicio1.Pasaporte;

public class Titular {
    private final String nombre;
    private final String dni;
    private Pasaporte pasaporte; // asociación bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

}
