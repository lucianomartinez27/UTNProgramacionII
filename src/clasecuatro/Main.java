package clasecuatro;

public class Main {
    public static void main(String[] args) {
        // Instancias usando ambos constructores
        Empleado e1 = new Empleado(1001, "Luciano Martínez", "Desarrollador", 1350.0);
        Empleado e2 = new Empleado("Luis Pérez", "Analista"); // salario por defecto 0.0, id auto
        Empleado e3 = new Empleado(1002, "María López", "QA", 280000.0);
        Empleado e4 = new Empleado("Carlos Ruiz", "Soporte");

        // Aplicar métodos sobrecargados actualizarSalario
        e1.actualizarSalario(10.0);   // 10% aumento
        e2.actualizarSalario(50000);  // aumento fijo
        e3.actualizarSalario(7.5);    // 7.5% aumento
        e4.actualizarSalario(30000);  // aumento fijo

        // Imprimir información de cada empleado
        // No es necesario llamar a toString porque println internamente lo hace
        // pero lo dejamos como ejemplo
        System.out.println();
        System.out.println(e1.toString());
        System.out.println();
        System.out.println(e2.toString());
        System.out.println();
        System.out.println(e3.toString());
        System.out.println();
        System.out.println(e4.toString());
        System.out.println();

        // Mostrar total de empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
