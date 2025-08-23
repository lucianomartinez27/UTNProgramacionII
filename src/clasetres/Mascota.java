package clasetres;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad; // en años

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre + " (" + especie + "), Edad: " + edad + " año(s)");
    }

    public void cumplirAnios() {
        this.edad += 1;
    }

}
