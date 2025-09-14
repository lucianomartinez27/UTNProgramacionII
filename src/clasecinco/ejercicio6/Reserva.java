package clasecinco.ejercicio6;

// Asociación unidireccional: Reserva -> Cliente
// Agregación: Reserva -> Mesa
public class Reserva {
    private final String fecha;
    private final String hora;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
