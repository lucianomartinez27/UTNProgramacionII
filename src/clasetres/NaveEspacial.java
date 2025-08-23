package clasetres;

public class NaveEspacial {
    private final String nombre;
    private double combustible; // combustible actual
    private final int capacidadMaxima = 100;

    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = combustibleInicial;
    }

    public void despegar() {
        if (combustible <= 0) {
            System.out.println("No hay combustible para despegar.");
            return;
        }
        System.out.println("Despegue exitoso de la nave " + nombre + ".");
    }

    public void avanzar(int distanciaEnKilometros) {
        if (distanciaEnKilometros < 1) {
            System.out.println("No hay distancia para avanzar.");
            return;
        }
        double consumo = distanciaEnKilometros * 0.25; // gasta 1/4 litro por km
        if (combustible < consumo) {
            System.out.println("Combustible insuficiente para avanzar " + distanciaEnKilometros + " litros.");
            System.out.println("Combustible disponible: " + combustible + "| Combustible necesario: " + consumo);
            return;
        }
        combustible -= consumo;
        System.out.println("La nave avanzó " + distanciaEnKilometros + " kilometros. Combustible restante: " + combustible);
    }

    public void recargarCombustible(int cantidadARecarcar) {
        if (combustible + cantidadARecarcar > capacidadMaxima) {
            var excedente = combustible + cantidadARecarcar - capacidadMaxima;
            System.out.println("No se pudo cargar " + cantidadARecarcar + " litros por superar la capacidad máxima.");
            System.out.println("Te estás excediendo en" + excedente + " litros");
            return;
        }
        combustible += cantidadARecarcar;
        System.out.println("Se recargaron " + cantidadARecarcar + " litros de combustible.");
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + ", Combustible: " + combustible + "/" + capacidadMaxima);
    }

}
