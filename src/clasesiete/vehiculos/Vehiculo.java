package clasesiete.vehiculos;

public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    protected String getMarca() {
        return marca;
    }

    protected String getModelo() {
        return modelo;
    }

    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo);
    }
}
