package clasetres;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        setCalificacion(calificacion);
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido + ", Curso: " + curso + ", Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        this.calificacion += puntos;
    }

    public void bajarCalificacion(double puntos) {
        this.calificacion -= puntos;

    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
