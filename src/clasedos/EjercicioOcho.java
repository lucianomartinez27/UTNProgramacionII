package clasedos;

import java.util.Scanner;

public class EjercicioOcho {

    public static void main(String[] args) {
        /**
         Cálculo del Precio Final con impuesto y descuento.
         Crea un método calcularPrecioFinal(double impuesto, double
         descuento) que calcule el precio final de un producto en un e-commerce.
         La fórmula es:
         PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
         PrecioFinal = PrecioBase + (PrecioBase * Impuesto) - (PrecioBase *
         Descuento)
         Desde main(), solicita el precio base del producto, el porcentaje de
         impuesto y el porcentaje de descuento, llama al método y muestra el precio
         final.

         */
        var scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double tasaImpuesto = scanner.nextDouble() / 100;
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double tasaDescuento = scanner.nextDouble() / 100;
        double precioFinal = calcularPrecioFinal(precioBase, tasaImpuesto, tasaDescuento);
        System.out.println("El precio final del producto es: " + precioFinal);
    }

    public static double calcularPrecioFinal(double precioBase, double tasaImpuesto, double tasaDescuento) {
        return precioBase + (precioBase * tasaImpuesto) - (precioBase * tasaDescuento);
    }
    
}
