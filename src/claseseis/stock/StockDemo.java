package claseseis.stock;

import java.util.List;

public class StockDemo {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
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

        // 2. Listar todos los productos
        System.out.println("-- Listado de productos --");
        inv.listarProductos();

        // 3. Buscar un producto por ID
        System.out.println("\n-- Buscar producto P003 --");
        Producto buscado = inv.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        // 4. Filtrar por categoría
        System.out.println("\n-- Productos ALIMENTOS --");
        List<Producto> alimentos = inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        for (Producto p : alimentos) p.mostrarInfo();

        // 5. Eliminar un producto y listar
        System.out.println("\n-- Eliminar P002 y listar --");
        inv.eliminarProducto("P002");
        inv.listarProductos();

        // 6. Actualizar stock
        System.out.println("\n-- Actualizar stock P001 a 70 --");
        inv.actualizarStock("P001", 70);
        inv.buscarProductoPorId("P001").mostrarInfo();

        // 7. Total stock
        System.out.println("\nTotal de stock: " + inv.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("Producto con mayor stock: " + inv.obtenerProductoConMayorStock());

        // 9. Filtrar por precio entre 1000 y 3000
        System.out.println("\n-- Productos entre $1000 y $3000 --");
        for (Producto p : inv.filtrarProductosPorPrecio(1000, 3000)) p.mostrarInfo();

        // 10. Mostrar categorías disponibles
        System.out.println("\n-- Categorías disponibles --");
        inv.mostrarCategoriasDisponibles();
    }
}
