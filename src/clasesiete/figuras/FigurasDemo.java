package clasesiete.figuras;

public class FigurasDemo {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[]{
                new Circulo(2.5),
                new Rectangulo(3, 4),
                new Circulo(1.2),
                new Rectangulo(5, 2)
        };

        for (Figura f : figuras) {
            System.out.printf("%s -> área: %.2f%n", f.getNombre(), f.calcularArea());
        }
    }
}
