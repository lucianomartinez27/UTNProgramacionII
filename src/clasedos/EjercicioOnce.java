package clasedos;

import java.util.Scanner;

public class EjercicioOnce {

    public static double tasaDescuentoEspecial = 0.10;

    public static void main(String[] args) {
        /**
         Cálculo de descuento especial usando variable global.
         Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
         método calcularDescuentoEspecial(double precio) que use la variable global para
         calcular el descuento especial del 10%.
         Dentro del método, declara una variable local descuentoAplicado, almacena
         el valor del descuento y muestra el precio final con descuento.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        var descuentoAplicado = calcularDescuentoEspecial(precio);
        var precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static double calcularDescuentoEspecial(double precio) {
        return precio * tasaDescuentoEspecial;
    }
    
}
