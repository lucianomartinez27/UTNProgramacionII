# Entrega clase seis — Programación II- TP6 - Colecciones y Sistema de Stock

Trabajo Práctico: Colecciones (ArrayList), Enum y Relaciones 1 a N / Bidireccionales

Alumno: Martínez Luciano Joaquín

Consignas generales del TP6: implementar tres casos prácticos usando colecciones dinámicas, enumeraciones y relaciones entre clases.

Link al código:
https://github.com/lucianomartinez27/UTNProgramacionII/tree/master/src/claseseis

A continuación se listan los ejercicios del paquete `claseseis`. Cada sección incluye el código Java principal y cómo ejecutar el demo.

---

## Caso Práctico 1 — Sistema de Stock (ArrayList + enum)

Clases y enum:

```java
// src/claseseis/stock/CategoriaProducto.java
package claseseis.stock;

public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

    private final String descripcion;

    CategoriaProducto(String descripcion) { this.descripcion = descripcion; }
    public String getDescripcion() { return descripcion; }
    @Override public String toString() { return name() + " (" + descripcion + ")"; }
}
```

```java
// src/claseseis/stock/Producto.java
package claseseis.stock;

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public Producto(String id, String nombre, CategoriaProducto categoria) {
        this(id, nombre, 0.0, 0, categoria);
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
    public CategoriaProducto getCategoria() { return categoria; }

    public void setPrecio(double precio) { this.precio = precio; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public void setCategoria(CategoriaProducto categoria) { this.categoria = categoria; }

    public void mostrarInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", categoria=" + categoria +
                '}';
    }
}
```

```java
// src/claseseis/stock/Inventario.java
package claseseis.stock;

import java.util.*;

public class Inventario {
    private final List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        if (p == null) return;
        // Evitar duplicados por id
        if (buscarProductoPorId(p.getId()) == null) {
            productos.add(p);
        }
    }

    public void listarProductos() {
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        if (id == null) return null;
        for (Producto p : productos) {
            if (id.equalsIgnoreCase(p.getId())) {
                return p;
            }
        }
        return null;
    }

    public boolean eliminarProducto(String id) {
        return productos.removeIf(pr -> pr.getId().equals(id));
    }

    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }

    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        List<Producto> res = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                res.add(p);
            }
        }
        return res;
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        Producto max = null;
        for (Producto p : productos) {
            if (max == null || p.getCantidad() > max.getCantidad()) max = p;
        }
        return max;
    }

    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> res = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) res.add(p);
        }
        return res;
    }

    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c.name() + ": " + c.getDescripcion());
        }
    }
}
```

Demo:

```java
// src/claseseis/stock/StockDemo.java
package claseseis.stock;

import java.util.List;

public class StockDemo {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        Producto p1 = new Producto("P001", "Manzanas", 1200, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Televisor", 250000, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 8000, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Licuadora", 32000, 10, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Fideos", 900, 200, CategoriaProducto.ALIMENTOS);

        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        inv.agregarProducto(p4);
        inv.agregarProducto(p5);

        System.out.println("-- Listado de productos --");
        inv.listarProductos();

        System.out.println("\n-- Buscar producto P003 --");
        Producto buscado = inv.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("\n-- Productos ALIMENTOS --");
        for (Producto p : inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS)) p.mostrarInfo();

        System.out.println("\n-- Eliminar P002 y listar --");
        inv.eliminarProducto("P002");
        inv.listarProductos();

        System.out.println("\n-- Actualizar stock P001 a 70 --");
        inv.actualizarStock("P001", 70);
        inv.buscarProductoPorId("P001").mostrarInfo();

        System.out.println("\nTotal de stock: " + inv.obtenerTotalStock());
        System.out.println("Producto con mayor stock: " + inv.obtenerProductoConMayorStock());

        System.out.println("\n-- Productos entre $1000 y $3000 --");
        for (Producto p : inv.filtrarProductosPorPrecio(1000, 3000)) p.mostrarInfo();

        System.out.println("\n-- Categorías disponibles --");
        inv.mostrarCategoriasDisponibles();
    }
}
```

---

## Caso Práctico 2 — Biblioteca y Libros (Composición 1 a N)

Clases:

```java
// src/claseseis/biblioteca/Autor.java
package claseseis.biblioteca;

public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getNacionalidad() { return nacionalidad; }

    public void mostrarInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
```

```java
// src/claseseis/biblioteca/Libro.java
package claseseis.biblioteca;

public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public Autor getAutor() { return autor; }

    public void mostrarInfo() {
        System.out.println("Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", autor=" + (autor != null ? autor.getNombre() : "-") +
                '}');
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", autor=" + autor +
                '}';
    }
}
```

```java
// src/claseseis/biblioteca/Biblioteca.java
package claseseis.biblioteca;

import java.util.*;

public class Biblioteca {
    private String nombre;
    private final List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) { this.nombre = nombre; }

    public String getNombre() { return nombre; }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        if (buscarLibroPorIsbn(isbn) == null) libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    public void listarLibros() {
        for (Libro l : libros) l.mostrarInfo();
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) if (Objects.equals(l.getIsbn(), isbn)) return l;
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        return libros.removeIf(pr -> pr.getIsbn().equals(isbn));
    }

    public int obtenerCantidadLibros() { return libros.size(); }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> r = new ArrayList<>();
        for (Libro l : libros) if (l.getAnioPublicacion() == anio) r.add(l);
        return r;
    }

    public void mostrarAutoresDisponibles() {
        Set<String> autores = new HashSet<>();
        for (Libro l : libros) if (l.getAutor() != null) autores.add(l.getAutor().getNombre());
        for (String a : autores) System.out.println(a);
    }
}
```

Demo:

```java
// src/claseseis/biblioteca/BibliotecaDemo.java
package claseseis.biblioteca;

public class BibliotecaDemo {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca("Biblioteca Central");

        Autor a1 = new Autor("A1", "Julio Verne", "Francia");
        Autor a2 = new Autor("A2", "J. K. Rowling", "Reino Unido");
        Autor a3 = new Autor("A3", "Gabriel García Márquez", "Colombia");

        b.agregarLibro("ISBN1", "Viaje al centro de la Tierra", 1864, a1);
        b.agregarLibro("ISBN2", "La vuelta al mundo en 80 días", 1873, a1);
        b.agregarLibro("ISBN3", "Harry Potter y la piedra filosofal", 1997, a2);
        b.agregarLibro("ISBN4", "Cien años de soledad", 1967, a3);
        b.agregarLibro("ISBN5", "El amor en los tiempos del cólera", 1985, a3);

        System.out.println("-- Libros --");
        b.listarLibros();

        System.out.println("\n-- Buscar ISBN3 --");
        Libro l = b.buscarLibroPorIsbn("ISBN3");
        if (l != null) l.mostrarInfo();

        System.out.println("\n-- Libros de 1873 --");
        for (Libro libro : b.filtrarLibrosPorAnio(1873)) libro.mostrarInfo();

        System.out.println("\n-- Eliminar ISBN2 --");
        b.eliminarLibro("ISBN2");
        b.listarLibros();

        System.out.println("\nCantidad total de libros: " + b.obtenerCantidadLibros());

        System.out.println("\n-- Autores disponibles --");
        b.mostrarAutoresDisponibles();
    }
}
```

---

## Ejercicio — Universidad, Profesor y Curso (relación bidireccional 1 a N)

Clases:

```java
// src/claseseis/universidad/Profesor.java
package claseseis.universidad;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private final List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public List<Curso> getCursos() { return new ArrayList<>(cursos); }

    public void agregarCurso(Curso c) {
        if (c == null) return;
        if (!cursos.contains(c)) cursos.add(c);
        if (c.getProfesor() != this) {
            c.setProfesor(this);
        }
    }

    public void eliminarCurso(Curso c) {
        if (c == null) return;
        if (cursos.contains(c)) cursos.remove(c);
        if (c.getProfesor() == this) {
            c.setProfesor(null);
        }
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            System.out.println(c.getCodigo() + " - " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", cantidadCursos=" + cursos.size() +
                '}');
    }
}
```

```java
// src/claseseis/universidad/Curso.java
package claseseis.universidad;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor p) {
        if (this.profesor == p) return; // nada que hacer
        // Quitar de profesor actual si existe
        Profesor anterior = this.profesor;
        this.profesor = p;
        if (anterior != null) {
            anterior.eliminarCurso(this);
        }
        if (p != null) {
            p.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", profesor=" + (profesor != null ? profesor.getNombre() : "-") +
                '}');
    }
}
```

```java
// src/claseseis/universidad/Universidad.java
package claseseis.universidad;

import java.util.*;

public class Universidad {
    private String nombre;
    private final List<Profesor> profesores = new ArrayList<>();
    private final List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) { this.nombre = nombre; }

    public void agregarProfesor(Profesor p) {
        if (p == null) return;
        if (buscarProfesorPorId(p.getId()) == null) profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        if (c == null) return;
        if (buscarCursoPorCodigo(c.getCodigo()) == null) cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) if (Objects.equals(p.getId(), id)) return p;
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) if (Objects.equals(c.getCodigo(), codigo)) return c;
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c != null) {
            c.setProfesor(p);
        }
    }

    public void listarProfesores() {
        for (Profesor p : profesores) p.mostrarInfo();
    }

    public void listarCursos() {
        for (Curso c : cursos) c.mostrarInfo();
    }

    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            c.setProfesor(null);
            cursos.remove(c);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            for (Curso c : new ArrayList<>(p.getCursos())) {
                c.setProfesor(null);
            }
            profesores.remove(p);
        }

    }
}
```

Demo:

```java
// src/claseseis/universidad/UniversidadDemo.java
package claseseis.universidad;

public class UniversidadDemo {
    public static void main(String[] args) {
        Profesor p1 = new Profesor("PR1", "Ana López", "Matemática");
        Profesor p2 = new Profesor("PR2", "Juan Pérez", "Programación");
        Profesor p3 = new Profesor("PR3", "María Gómez", "Física");

        Curso c1 = new Curso("C001", "Álgebra");
        Curso c2 = new Curso("C002", "POO");
        Curso c3 = new Curso("C003", "Bases de Datos");
        Curso c4 = new Curso("C004", "Electromagnetismo");
        Curso c5 = new Curso("C005", "Cálculo");

        Universidad u = new Universidad("UTN");
        u.agregarProfesor(p1);
        u.agregarProfesor(p2);
        u.agregarProfesor(p3);
        u.agregarCurso(c1);
        u.agregarCurso(c2);
        u.agregarCurso(c3);
        u.agregarCurso(c4);
        u.agregarCurso(c5);

        u.asignarProfesorACurso("C001", "PR1");
        u.asignarProfesorACurso("C002", "PR2");
        u.asignarProfesorACurso("C003", "PR2");
        u.asignarProfesorACurso("C004", "PR3");

        System.out.println("-- Cursos --");
        u.listarCursos();
        System.out.println("\n-- Profesores --");
        u.listarProfesores();
        System.out.println("\nCursos por profesor PR2:");
        p2.listarCursos();

        System.out.println("\n-- Cambiar profesor de C003 a PR1 --");
        u.asignarProfesorACurso("C003", "PR1");
        System.out.println("Cursos PR1:");
        p1.listarCursos();
        System.out.println("Cursos PR2:");
        p2.listarCursos();

        System.out.println("\n-- Eliminar curso C004 --");
        u.eliminarCurso("C004");
        u.listarCursos();
        System.out.println("Cursos PR3:");
        p3.listarCursos();

        System.out.println("\n-- Eliminar profesor PR2 --");
        u.eliminarProfesor("PR2");
        u.listarCursos();

        System.out.println("\n-- Reporte: cantidad de cursos por profesor --");
        System.out.println(p1.getNombre() + ": " + p1.getCursos().size());
        System.out.println(p3.getNombre() + ": " + p3.getCursos().size());
    }
}
```

---
