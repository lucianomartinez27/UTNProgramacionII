package clasecinco.ejercicio12;

// Asociación unidireccional: Impuesto -> Contribuyente
public class Impuesto {
    private final double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto) {
        this.monto = monto;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    public double getMonto() { return monto; }
    public Contribuyente getContribuyente() { return contribuyente; }
}
