package claseseis.universidad;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private final List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public List<Curso> getCursos() { return new ArrayList<>(cursos); }

    public void agregarCurso(Curso c) {
        if (c == null) return;
        if (!cursos.contains(c)) cursos.add(c);
        if (c.getProfesor() != this) {
            c.setProfesor(this);
        }
    }

    public void eliminarCurso(Curso c) {
        if (c == null) return;
        if (cursos.contains(c)) cursos.remove(c);
        if (c.getProfesor() == this) {
            c.setProfesor(null);
        }
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            System.out.println(c.getCodigo() + " - " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", cantidadCursos=" + cursos.size() +
                '}');
    }
}
