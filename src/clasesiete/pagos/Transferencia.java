package clasesiete.pagos;

public class Transferencia implements Pagable {
    private String cbuDestino;

    public Transferencia(String cbuDestino) {
        this.cbuDestino = cbuDestino;
    }

    @Override
    public void pagar(double monto) {
        System.out.printf("Pago de $%.2f por Transferencia a CBU %s%n", monto, cbuDestino);
    }
}
