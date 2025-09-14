package clasecinco.ejercicio4;

public class Cliente {
    private final String nombre;
    private final String dni;
    private TarjetaDeCredito tarjeta; // bidireccional

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }
}
