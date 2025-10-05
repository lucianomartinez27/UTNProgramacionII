package clasesiete.animales;

public class Animal {
    private final String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void hacerSonido() {
        System.out.println("(sonido genérico)");
    }

    public final void describirAnimal() {
        // final: no se permite sobrescribir, ejemplo de método final
        System.out.println("Este es un animal llamado: " + nombre);
    }
}
