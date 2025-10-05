package clasesiete.pagos;

public class Efectivo implements Pagable {
    @Override
    public void pagar(double monto) {
        System.out.printf("Pago de $%.2f en Efectivo%n", monto);
    }
}
