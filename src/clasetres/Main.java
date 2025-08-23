package clasetres;

public class Main {
    public static void main(String[] args) {
        // 1. Registro de Estudiantes
        System.out.println("--- Registro de Estudiantes ---");
        Estudiante est = new Estudiante("Ana", "García", "Programación II", 7.5);
        est.mostrarInfo();
        est.subirCalificacion(2.0);
        est.mostrarInfo();
        est.bajarCalificacion(5.0);
        est.mostrarInfo();

        // 2. Registro de Mascotas
        System.out.println("\n--- Registro de Mascotas ---");
        Mascota mascota = new Mascota("Firulais", "Perro", 3);
        mascota.mostrarInfo();
        mascota.cumplirAnios();
        mascota.mostrarInfo();

        // 3. Encapsulamiento con Libro
        System.out.println("\n--- Encapsulamiento con Libro ---");
        Libro libro = new Libro("El Martín Fierro", "José Hernández", 1872);
        System.out.println("Libro: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", Año: " + libro.getAnioPublicacion());
        libro.setAnioPublicacion(2200); // inválido
        System.out.println("Año tras intento inválido: " + libro.getAnioPublicacion());
        libro.setAnioPublicacion(2005); // válido
        System.out.println("Año tras actualización válida: " + libro.getAnioPublicacion());

        // 4. Gestión de Gallinas
        System.out.println("\n--- Gestión de Gallinas ---");
        Gallina gallinaVieja = new Gallina(1, 5, 6);
        Gallina gallinaNueva = new Gallina(2, 1, 2);
        gallinaVieja.mostrarEstado();
        gallinaNueva.mostrarEstado();
        gallinaVieja.envejecer();
        gallinaVieja.ponerHuevo();
        gallinaNueva.envejecer();
        gallinaNueva.ponerHuevo();
        gallinaNueva.ponerHuevo();
        gallinaVieja.mostrarEstado();
        gallinaNueva.mostrarEstado();

        // 5. Simulación de Nave Espacial
        System.out.println("\n--- Simulación de Nave Espacial ---");
        NaveEspacial nave = new NaveEspacial("Gláctico", 50);
        nave.mostrarEstado();
        nave.avanzar(500); // debe fallar por combustible insuficiente
        nave.recargarCombustible(40); // hasta capacidad 100
        nave.despegar();
        nave.avanzar(60); // ahora debe poder
        nave.mostrarEstado();
    }

}
