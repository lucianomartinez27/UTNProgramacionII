package claseuno;

import java.util.Scanner;

public class EjercicioCuatro {

    public static void main(String[] args) {
        /**
         *  Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego los
         * muestre en pantalla. Usa Scanner para capturar los datos.
         */

        var scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        var nombre = scanner.nextLine();
        System.out.println("Ingrese su edad: ");
        var edad = Integer.parseInt(scanner.nextLine());
        System.out.println(nombre + " tiene " + edad + " años");
    }
    
}
