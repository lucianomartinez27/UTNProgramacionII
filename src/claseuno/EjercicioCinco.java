package claseuno;

import java.util.Scanner;

public class EjercicioCinco {

    public static void main(String[] args) {
       /** Escribe un programa que solicite dos números enteros y realice las siguientes operaciones:
        Suma
        Resta
        Multiplicación
        División
        Muestra los resultados en la consola.
        */
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        var primerNumero = scanner.nextFloat();
        System.out.println("Ingrese el segundo número: ");
        var segundoNumero = scanner.nextFloat();

        System.out.println("Suma: " + (primerNumero + segundoNumero));
        System.out.println("Resta: " + (primerNumero - segundoNumero));
        System.out.println("Multiplicación: " + (primerNumero * segundoNumero));
        System.out.println("División: " + (primerNumero / segundoNumero));
        
    }
    
}
