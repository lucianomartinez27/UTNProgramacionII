package claseseis.stock;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
