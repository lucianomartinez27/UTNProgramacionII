package clasedos;

import java.util.Scanner;

public class EjercicioDiez {

    public static void main(String[] args) {
        /**
         Actualización de stock a partir de venta y recepción de productos.
         Crea un método actualizarStock(int stockActual, int cantidadVendida,
         int cantidadRecibida), que calcule el nuevo stock después de una venta y
         recepción
         de productos:
         NuevoStock = StockActual − CantidadVendida + CantidadRecibida
         NuevoStock = CantidadVendida + CantidadRecibida
         Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
         cantidad recibida, y muestra el stock actualizado.

         */

        var scanner = new Scanner(System.in);
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scanner.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = scanner.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scanner.nextInt();
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
}
