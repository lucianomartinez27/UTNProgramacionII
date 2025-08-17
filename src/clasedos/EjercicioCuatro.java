package clasedos;

import java.util.Scanner;

public class EjercicioCuatro {

    public static void main(String[] args) {
        /**
         4. Calculadora de Descuento según categoría.
         Escribe un programa que solicite al usuario el precio de un producto y
         su categoría (A, B o C).
         Luego, aplique los siguientes descuentos:
         Categoría A: 10% de descuento
         Categoría B: 15% de descuento
         Categoría C: 20% de descuento
         El programa debe mostrar el precio original, el descuento aplicado y el
         precio final
         */

        var scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String category = scanner.nextLine().toUpperCase();
        double descuento;
        double precioFinal;
        switch (category) {
            case "A":
                descuento = 0.10;
                break;
            case "B":
                descuento = 0.15;
                break;
            case "C":
                descuento = 0.20;
                break;
            default:
                System.out.println("Categoría inválida.");
                return;
        }
        precioFinal = precio - (precio * descuento);
        System.out.println("Descuento aplicado: " + (int) (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
    
}
