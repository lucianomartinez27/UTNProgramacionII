package clasedos;

import java.util.Scanner;

public class EjercicioTres {
  
    public static void main(String[] args) {
        /**
         Clasificación de Edad.
         Escribe un programa en Java que solicite al usuario su edad y clasifique su
         etapa de vida según la siguiente tabla:
         Menor de 12 años: "Niño"
         Entre 12 y 17 años: "Adolescente"
         Entre 18 y 59 años: "Adulto"
         60 años o más: "Adulto mayor"
         */

        var scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        if (edad < 12) {
            System.out.println("Niño.");
        } else if (edad <= 17) {
            System.out.println("Adolescente.");
        } else if (edad <= 59) {
            System.out.println("Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }
        
    }
    
}
