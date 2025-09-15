package clasecinco.ejercicio12;

// Dependencia de uso: Calculadora.calcular(Impuesto)
public class Calculadora {

    public void calcular(Impuesto impuesto) {
        // Uso sin guardar como atributo
        double monto = impuesto.getMonto() + 0.1;
        // Simulación de cálculo
        System.out.println("Calculando impuesto sobre monto: " + monto);
    }
}
