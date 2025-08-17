package clasedos;

import java.util.Scanner;

public class EjercicioCinco {

    public static void main(String[] args) {
       /**
        5. Suma de Números Pares (while).
        Escribe un programa que solicite números al usuario y sume solo los
        números pares. El ciclo debe continuar hasta que el usuario ingrese el número
        0, momento en el que se debe mostrar la suma total de los pares ingresados.

        */
        var scanner = new Scanner(System.in);
        int sumaDePares = 0;
        int numero;
        System.out.print("Ingrese un número (0 para terminar): ");
        numero = scanner.nextInt();
        while (numero != 0) {
            if (numero % 2 == 0) {
                sumaDePares += numero;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
        }
        System.out.println("La suma de los números pares es: " + sumaDePares);
        
    }
    
}
