package clasecinco.ejercicio11;

// Dependencia de uso: Reproductor.reproducir(Cancion)
public class Reproductor {

    public void reproducir(Cancion cancion) {
        // No se guarda como atributo: solo se usa
        // Simulación reproducción
        System.out.println("Reproduciendo: " + cancion.getTitulo());
    }
}
