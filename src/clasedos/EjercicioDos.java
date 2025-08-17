/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasedos;

import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {
        /**
         2. Determinar el Mayor de Tres Números.
         Escribe un programa en Java que pida al usuario tres números enteros y
         determine cuál es el mayor.
         */

        var scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        System.out.println("El mayor es: " + mayor);
    }
    
}
