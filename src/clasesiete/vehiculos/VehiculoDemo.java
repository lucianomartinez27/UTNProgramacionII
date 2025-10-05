package clasesiete.vehiculos;

public class VehiculoDemo {
    public static void main(String[] args) {
        // Upcasting: Auto como Vehiculo
        Vehiculo v = new Auto("Toyota", "Corolla", 4);
        v.mostrarInfo(); // Polimorfismo: ejecuta la versión de Auto

        // Downcasting seguro con instanceof
        if (v instanceof Auto) {
            Auto a = (Auto) v;
            System.out.println("Cantidad de puertas: " + a.getCantidadPuertas());
        }
    }
}
