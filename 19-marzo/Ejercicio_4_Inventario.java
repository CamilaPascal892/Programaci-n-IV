import java.util.*;

class Producto {
    private static int contador = 0;

    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        contador++;
    }

    public static int getTotalProductos() {
        return contador;
    }
}

public class Ejercicio_4_Inventario {
    public static void main(String[] args) {

        new Producto("1", "Mouse", 100);
        new Producto("2", "Teclado", 200);

        System.out.println(Producto.getTotalProductos());
    }
}