package claseuno;

import java.util.Scanner;

public class EjercicioNueve {
    
    public static void main(String[] args) {
        /**
         * Corrige el siguiente código para que funcione correctamente.
         * Explica qué error tenía y cómo lo solucionaste.
         */

        // Corregí el error cambiando el método nextInt por nextLine,
        //  ya que la variable se llamaba nombre y el tipo era String,
        //  lo que hacía suponer sería el método correcto.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        // String nombre = scanner.nextInt(); // ERROR
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);
    }
}
