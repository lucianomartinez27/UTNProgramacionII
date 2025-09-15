package clasecinco.ejercicio14;

// Dependencia de creación: EditorVideo.exportar(String, Proyecto)
public class EditorVideo {

    public Render exportar(String formato, Proyecto proyecto) {
        // Crea un Render pero no lo conserva como atributo
        Render render = new Render(formato);
        render.setProyecto(proyecto);
        return render;
    }
}
