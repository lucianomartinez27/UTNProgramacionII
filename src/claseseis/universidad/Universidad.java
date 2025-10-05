package claseseis.universidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Universidad {
    private String nombre;
    private final List<Profesor> profesores = new ArrayList<>();
    private final List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProfesor(Profesor p) {
        if (p == null) return;
        if (buscarProfesorPorId(p.getId()) == null) profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        if (c == null) return;
        if (buscarCursoPorCodigo(c.getCodigo()) == null) cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) if (Objects.equals(p.getId(), id)) return p;
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) if (Objects.equals(c.getCodigo(), codigo)) return c;
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c != null) {
            c.setProfesor(p); // sincroniza ambos lados
        }
    }

    public void listarProfesores() {
        for (Profesor p : profesores) p.mostrarInfo();
    }

    public void listarCursos() {
        for (Curso c : cursos) c.mostrarInfo();
    }

    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            c.setProfesor(null);
            cursos.remove(c);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            for (Curso c : new ArrayList<>(p.getCursos())) {
                c.setProfesor(null);
            }
            profesores.remove(p);
        }

    }
}
