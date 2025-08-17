package clasedos;

import java.util.Scanner;

public class EjercicioSeis {

    public static void main(String[] args) {
        /**
         Contador de Positivos, Negativos y Ceros (for).
         Escribe un programa que pida al usuario ingresar 10 números enteros y
         cuente cuántos son positivos, negativos y cuántos son ceros.
         */
        var scanner = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();
            if (numero > 0) {
                positivos += 1;
            } else if (numero < 0) {
                negativos +=1;
            } else {
                ceros +=1;
            }
        }
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
    
}
