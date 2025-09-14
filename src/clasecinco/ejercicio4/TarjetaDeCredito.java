package clasecinco.ejercicio4;

// Asociación bidireccional: TarjetaDeCredito <-> Cliente
// Agregación: TarjetaDeCredito -> Banco
public class TarjetaDeCredito {
    private final String numero;
    private final String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(String numero, String fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
