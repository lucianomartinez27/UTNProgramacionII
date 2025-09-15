package clasecinco.ejercicio14;

// Asociación unidireccional: Render -> Proyecto
public class Render {
    private String formato;
    private Proyecto proyecto;

    public Render(String formato) {
        this.formato = formato;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

}
