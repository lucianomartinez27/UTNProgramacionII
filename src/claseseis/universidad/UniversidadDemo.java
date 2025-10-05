package claseseis.universidad;

public class UniversidadDemo {
    public static void main(String[] args) {
        // 1. Crear al menos 3 profesores y 5 cursos.
        Profesor p1 = new Profesor("PR1", "Ana López", "Matemática");
        Profesor p2 = new Profesor("PR2", "Juan Pérez", "Programación");
        Profesor p3 = new Profesor("PR3", "María Gómez", "Estadística");

        Curso c1 = new Curso("C001", "Álgebra");
        Curso c2 = new Curso("C002", "POO");
        Curso c3 = new Curso("C003", "Bases de Datos");
        Curso c4 = new Curso("C004", "Probabilidad y Estadística");
        Curso c5 = new Curso("C005", "Cálculo");

        // 2. Agregar profesores y cursos a la universidad.
        Universidad u = new Universidad("UTN");
        u.agregarProfesor(p1);
        u.agregarProfesor(p2);
        u.agregarProfesor(p3);
        u.agregarCurso(c1);
        u.agregarCurso(c2);
        u.agregarCurso(c3);
        u.agregarCurso(c4);
        u.agregarCurso(c5);

        // 3. Asignar profesores a cursos
        u.asignarProfesorACurso("C001", "PR1");
        u.asignarProfesorACurso("C002", "PR2");
        u.asignarProfesorACurso("C003", "PR2");
        u.asignarProfesorACurso("C004", "PR3");

        // 4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("-- Cursos --");
        u.listarCursos();
        System.out.println("\n-- Profesores --");
        u.listarProfesores();
        System.out.println("\nCursos por profesor PR2:");
        p2.listarCursos();

        // 5. Cambiar el profesor de un curso y verificar sincronización
        System.out.println("\n-- Cambiar profesor de C003 a PR1 --");
        u.asignarProfesorACurso("C003", "PR1");
        System.out.println("Cursos PR1:");
        p1.listarCursos();
        System.out.println("Cursos PR2:");
        p2.listarCursos();

        // 6. Remover un curso y confirmar
        System.out.println("\n-- Eliminar curso C004 --");
        u.eliminarCurso("C004");
        u.listarCursos();
        System.out.println("Cursos PR3:");
        p3.listarCursos();

        // 7. Remover un profesor y dejar profesor = null
        System.out.println("\n-- Eliminar profesor PR2 --");
        u.eliminarProfesor("PR2");
        u.listarCursos();

        // 8. Reporte simple: cantidad de cursos por profesor
        System.out.println("\n-- Reporte: cantidad de cursos por profesor --");
        System.out.println(p1.getNombre() + ": " + p1.getCursos().size());
        System.out.println(p3.getNombre() + ": " + p3.getCursos().size());
    }
}
