package clasecinco.ejercicio9;

// Asociación unidireccional: CitaMedica -> Paciente, CitaMedica -> Profesional
public class CitaMedica {
    private final String fecha;
    private final String hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

}
