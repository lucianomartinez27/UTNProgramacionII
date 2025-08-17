package clasedos;

public class EjercicioTrece {
    
    public static void main(String[] args) {
        /**
         Impresión recursiva de arrays antes y después de modificar un elemento.
         Crea un programa que:
         a. Declare e inicialice un array con los precios de algunos productos.
         b. Use una función recursiva para mostrar los precios originales.
         c. Modifique el precio de un producto específico.
         d. Use otra función recursiva para mostrar los valores modificados.
         */

        double[] precios = {200, 399, 150.75, 399, 99.99};
        System.out.println("Precios originales:");
        imprimirRecursivo(precios, 0);
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        imprimirRecursivo(precios, 0);
    }

    public static void imprimirRecursivo(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            imprimirRecursivo(precios, indice + 1);
        }
    }


}
