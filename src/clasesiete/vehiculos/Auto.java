package clasesiete.vehiculos;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Auto: " + getMarca() + " " + getModelo() + ", Puertas: " + cantidadPuertas);
    }
}
