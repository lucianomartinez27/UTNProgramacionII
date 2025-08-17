package clasedos;

import java.util.Scanner;

public class EjercicioNueve {
    
    public static void main(String[] args) {
        /**
         Composición de funciones para calcular costo de envío y total de compra.
         a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
         envío basado en la zona de envío (Nacional o Internacional) y el peso del
         paquete.
         Nacional: $5 por kg
         Internacional: $10 por kg
         b. calcularTotalCompra(double precioProducto, double
         costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
         el costo de envío.
         Desde main(), solicita el peso del paquete, la zona de envío y el precio
         del producto. Luego, muestra el total a pagar.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double pesoPaquete = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zonaEnvio = scanner.nextLine();
        double costoEnvio = calcularCostoEnvio(pesoPaquete, zonaEnvio);
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            return 0;
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
