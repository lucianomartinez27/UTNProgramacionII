package clasetres;

public class Gallina {
    private int idGallina;
    private int edad; // en años
    private int huevosPuestos;

    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = Math.max(0, edad);
        this.huevosPuestos = Math.max(0, huevosPuestos);
    }

    public void ponerHuevo() {
        this.huevosPuestos += 1;
    }

    public void envejecer() {

        this.edad+=1;
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " - Edad: " + edad + " año(s), Huevos puestos: " + huevosPuestos);
    }
}
