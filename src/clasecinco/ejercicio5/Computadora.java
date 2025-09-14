package clasecinco.ejercicio5;

// Composición: Computadora -> PlacaMadre
// Asociación bidireccional: Computadora <-> Propietario
public class Computadora {
    private final String marca;
    private final String numeroSerie;
    private final PlacaMadre placaMadre; // composición
    private Propietario propietario; // bidireccional

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
