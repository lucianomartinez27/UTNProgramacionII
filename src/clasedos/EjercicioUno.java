/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasedos;

import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {
        /**
         1. Verificación de Año Bisiesto.
         Escribe un programa en Java que solicite al usuario un año y determine si es
         bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
         divisible por 400.
         */

        var scanner = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();
        if ((anio % 4 == 0 && (anio % 100 != 0 || (anio % 400 == 0)))) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }
    
}
