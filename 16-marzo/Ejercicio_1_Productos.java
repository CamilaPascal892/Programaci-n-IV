import java.util.*;

class Producto {
    private String nombre;
    private double precio;
    private String categoria;

    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public String getCategoria() { return categoria; }

    @Override
    public String toString() {
        return nombre + " - $" + precio + " (" + categoria + ")";
    }
}

public class Ejercicio_1_Productos {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Laptop", 1200, "Tecnología"));
        productos.add(new Producto("Mouse", 50, "Tecnología"));
        productos.add(new Producto("Silla", 300, "Hogar"));

        // Ordenar por precio
        productos.sort(Comparator.comparingDouble(Producto::getPrecio));

        System.out.println("Ordenado por precio:");
        productos.forEach(System.out::println);

        // Ordenar por nombre
        productos.sort(Comparator.comparing(Producto::getNombre));

        System.out.println("\nOrdenado por nombre:");
        productos.forEach(System.out::println);
    }
}