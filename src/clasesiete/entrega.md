# Entrega clase siete — Programación II - TP7 - Herencia y Polimorfismo

Trabajo Práctico: Herencia, clases abstractas, interfaces y polimorfismo

Alumno: Martínez Luciano Joaquín

Consignas del TP7: Comprender y aplicar los conceptos de herencia y polimorfismo en la Programación
Orientada a Objetos, reconociendo su importancia para la reutilización de código, la
creación de jerarquías de clases y el diseño flexible de soluciones en Java.

Link al código:
https://github.com/lucianomartinez27/UTNProgramacionII/tree/master/src/clasesiete

A continuación se listan los ejercicios del paquete `clasesiete`. Cada sección incluye el código Java principal y cómo ejecutar el demo.

---

## 1) Vehículos — Herencia básica (extends)

Clases y demo:

```java
// src/clasesiete/vehiculos/Vehiculo.java
package clasesiete.vehiculos;

public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    protected String getMarca() {
        return marca;
    }

    protected String getModelo() {
        return modelo;
    }

    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo);
    }
}
```

```java
// src/clasesiete/vehiculos/Auto.java
package clasesiete.vehiculos;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Auto: " + getMarca() + " " + getModelo() + ", Puertas: " + cantidadPuertas);
    }
}
```

```java
// src/clasesiete/vehiculos/VehiculoDemo.java
package clasesiete.vehiculos;

public class VehiculoDemo {
    public static void main(String[] args) {
        // Upcasting: Auto como Vehiculo
        Vehiculo v = new Auto("Toyota", "Corolla", 4);
        v.mostrarInfo(); // Polimorfismo: ejecuta la versión de Auto

        // Downcasting seguro con instanceof
        if (v instanceof Auto) {
            Auto a = (Auto) v;
            System.out.println("Cantidad de puertas: " + a.getCantidadPuertas());
        }
    }
}
```

---

## 2) Figuras geométricas — Clase abstracta y métodos abstractos

Clases y demo:

```java
// src/clasesiete/figuras/Figura.java
package clasesiete.figuras;

public abstract class Figura {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularArea();
}
```

```java
// src/clasesiete/figuras/Circulo.java
package clasesiete.figuras;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
```

```java
// src/clasesiete/figuras/Rectangulo.java
package clasesiete.figuras;

public class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        super("Rectángulo");
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
```

```java
// src/clasesiete/figuras/FigurasDemo.java
package clasesiete.figuras;

public class FigurasDemo {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[]{
                new Circulo(2.5),
                new Rectangulo(3, 4),
                new Circulo(1.2),
                new Rectangulo(5, 2)
        };

        for (Figura f : figuras) {
            System.out.printf("%s -> área: %.2f%n", f.getNombre(), f.calcularArea());
        }
    }
}
```

---

## 3) Empleados — Polimorfismo

Clases y demo:

```java
// src/clasesiete/empleados/Empleado.java
package clasesiete.empleados;

public abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularSueldo();
}
```

```java
// src/clasesiete/empleados/EmpleadoPlanta.java
package clasesiete.empleados;

public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;

    public EmpleadoPlanta(String nombre, double sueldoBase) {
        super(nombre);
        this.sueldoBase = sueldoBase;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase;
    }
}
```

```java
// src/clasesiete/empleados/EmpleadoTemporal.java
package clasesiete.empleados;

public class EmpleadoTemporal extends Empleado {
    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoTemporal(String nombre, int horasTrabajadas, double valorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
}
```

```java
// src/clasesiete/empleados/EmpleadosDemo.java
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
```

---

## 4) Animales — Sobrescritura de comportamiento

Clases y demo:

```java
// src/clasesiete/animales/Animal.java
package clasesiete.animales;

public class Animal {
    private final String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void hacerSonido() {
        System.out.println("(sonido genérico)");
    }

    public final void describirAnimal() {
        // final: no se permite sobrescribir, ejemplo de método final
        System.out.println("Este es un animal llamado: " + nombre);
    }
}
```

```java
// src/clasesiete/animales/Perro.java
package clasesiete.animales;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau!");
    }
}
```

```java
// src/clasesiete/animales/Gato.java
package clasesiete.animales;

public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau!");
    }
}
```

```java
// src/clasesiete/animales/Vaca.java
package clasesiete.animales;

public class Vaca extends Animal {
    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Muuu!");
    }
}
```

```java
// src/clasesiete/animales/AnimalesDemo.java
package clasesiete.animales;

import java.util.Arrays;
import java.util.List;

public class AnimalesDemo {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
                new Perro("Firulais"),
                new Gato("Mishi"),
                new Vaca("Lola")
        );

        for (Animal a : animals) {
            a.describirAnimal();
            a.hacerSonido(); // polimorfismo
        }
    }
}
```

---

## 5) Sistema de pagos — Interfaz y método genérico

Interfaces, clases y demo:

```java
// src/clasesiete/pagos/Pagable.java
package clasesiete.pagos;

public interface Pagable {
    void pagar(double monto);
}
```

```java
// src/clasesiete/pagos/TarjetaCredito.java
package clasesiete.pagos;

public class TarjetaCredito implements Pagable {
    private String numero;

    public TarjetaCredito(String numero) {
        this.numero = numero;
    }

    @Override
    public void pagar(double monto) {
        System.out.printf("Pago de $%.2f con Tarjeta de Crédito (%s)%n", monto, numero);
    }
}
```

```java
// src/clasesiete/pagos/Transferencia.java
package clasesiete.pagos;

public class Transferencia implements Pagable {
    private String cbuDestino;

    public Transferencia(String cbuDestino) {
        this.cbuDestino = cbuDestino;
    }

    @Override
    public void pagar(double monto) {
        System.out.printf("Pago de $%.2f por Transferencia a CBU %s%n", monto, cbuDestino);
    }
}
```

```java
// src/clasesiete/pagos/Efectivo.java
package clasesiete.pagos;

public class Efectivo implements Pagable {
    @Override
    public void pagar(double monto) {
        System.out.printf("Pago de $%.2f en Efectivo%n", monto);
    }
}
```

```java
// src/clasesiete/pagos/PagosDemo.java
package clasesiete.pagos;

import java.util.Arrays;
import java.util.List;

public class PagosDemo {
 

    public static void main(String[] args) {
        List<Pagable> medios = Arrays.asList(
                new TarjetaCredito("4111-1111-1111-1111"),
                new Transferencia("0000003100098765432100"),
                new Efectivo()
        );

        double monto = 12500.75;
        for (Pagable p : medios) {
            p.pagar(monto);
        }
    }
}
```

Cómo ejecutar: correr la clase con main `clasesiete.pagos.PagosDemo`.
