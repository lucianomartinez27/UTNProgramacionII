package clasedos;

import java.util.Scanner;

public class EjercicioSiete {

    public static void main(String[] args) {
        /**
         Validación de Nota entre 0 y 10 (do-while).
         Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
         usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
         hasta que ingrese un valor válido.

         */
        var scanner = new Scanner(System.in);
        int nota;
        var invalida = true;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = scanner.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            } else {
                invalida = false;
            }
        } while (invalida);
        System.out.println("Nota guardada correctamente.");
    }
    
}
