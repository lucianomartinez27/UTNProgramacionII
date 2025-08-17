package clasedos;

public class EjercicioDoce {

    public static void main(String[] args) {
        /**
         12. Modificación de un array de precios y visualización de resultados.
         Crea un programa que:
         a. Declare e inicialice un array con los precios de algunos productos.
         b. Muestre los valores originales de los precios.
         c. Modifique el precio de un producto específico.
         d. Muestre los valores modificados.
         */

        double[] precios = {99.99, 300.5, 150.75, 400, 19.99};
        System.out.println("Precios originales:");
        for (double precioOriginal : precios) {
            System.out.println("Precio: $" + precioOriginal);
        }
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        for (double precioModificado : precios) {
            System.out.println("Precio: $" + precioModificado);
        }
    }


}
