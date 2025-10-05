package clasesiete.pagos;

import java.util.Arrays;
import java.util.List;

public class PagosDemo {
    // Método genérico que procesa cualquier Pagable

    public static void main(String[] args) {
        List<Pagable> medios = Arrays.asList(
                new TarjetaCredito("4111-1111-1111-1111"),
                new Transferencia("0000003100098765432100"),
                new Efectivo()
        );

        double monto = 12500.75;
        for (Pagable p : medios) {
            p.pagar(monto);
        }
    }
}
