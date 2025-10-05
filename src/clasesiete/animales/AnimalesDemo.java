package clasesiete.animales;

import java.util.Arrays;
import java.util.List;

public class AnimalesDemo {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
                new Perro("Firulais"),
                new Gato("Mishi"),
                new Vaca("Lola")
        );

        for (Animal a : animals) {
            a.describirAnimal();
            a.hacerSonido(); // polimorfismo
        }
    }
}
