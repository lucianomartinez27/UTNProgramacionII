package clasecinco.ejercicio10;

// Composición: CuentaBancaria -> ClaveSeguridad
// Asociación bidireccional: CuentaBancaria <-> Titular
public class CuentaBancaria {
    private final String cbu;
    private double saldo;
    private final ClaveSeguridad claveSeguridad;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }

}
