package clasesiete.pagos;

public class TarjetaCredito implements Pagable {
    private String numero;

    public TarjetaCredito(String numero) {
        this.numero = numero;
    }

    @Override
    public void pagar(double monto) {
        System.out.printf("Pago de $%.2f con Tarjeta de Crédito (%s)%n", monto, numero);
    }
}
