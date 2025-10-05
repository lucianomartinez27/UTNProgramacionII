package clasesiete.empleados;

import java.util.ArrayList;
import java.util.List;

public class EmpleadosDemo {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 300000));
        empleados.add(new EmpleadoTemporal("Luis", 120, 1800));
        empleados.add(new EmpleadoPlanta("Marta", 420000));
        empleados.add(new EmpleadoTemporal("Carlos", 80, 2000));

        for (Empleado e : empleados) {
            String tipo;
            if (e instanceof EmpleadoPlanta) {
                tipo = "Planta";
            } else if (e instanceof EmpleadoTemporal) {
                tipo = "Temporal";
            } else {
                tipo = "Desconocido";
            }
            System.out.printf("%s (%s) -> Sueldo: $%.2f%n", e.getNombre(), tipo, e.calcularSueldo());
        }
    }
}
