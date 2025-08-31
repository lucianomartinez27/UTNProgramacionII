package clasecuatro;

public class Empleado {
    private int id;
    private String nombre; // nombre completo
    private String puesto;
    private double salario;

    // Atributo estático: contador global de empleados creados
    private static int totalEmpleados = 0;

    // Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        // Uso de this para distinguir parámetros de atributos
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // Incrementar contador estático

    }

    // Constructor sobrecargado que recibe solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        // Generación de id automático basada en la cantidad creada + 1
        this.id = totalEmpleados + 1;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 0.0; // salario por defecto
        totalEmpleados++;
    }

    // Métodos sobrecargados actualizarSalario
    public void actualizarSalario(double porcentajeAumento) {
        if (porcentajeAumento < 0) {
            return;
        }
        double incremento = this.salario * (porcentajeAumento / 100.0);
        this.salario += incremento;
    }

    // Recibe una cantidad fija a aumentar
    public void actualizarSalario(int montoFijo) {
        if (montoFijo < 0) {
            return;
        }
        this.salario += montoFijo;
    }

    // Método estático para mostrar el total de empleados creados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    @Override
    public String toString() {
        return "Empleado[" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                ']';
    }

}
