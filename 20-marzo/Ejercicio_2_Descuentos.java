enum TipoDescuento {
    PORCENTAJE,
    TOPE_MAXIMO,
    PROGRESIVO
}

interface DescuentoStrategy {
    double aplicarDescuento(double total, int cantidad);
}


class DescuentoPorcentaje implements DescuentoStrategy {
    public double aplicarDescuento(double total, int cantidad) {
        return total * 0.10;
    }
}


class DescuentoTope implements DescuentoStrategy {
    public double aplicarDescuento(double total, int cantidad) {
        double descuento = total * 0.20;
        return Math.min(descuento, 500);
    }
}


class DescuentoProgresivo implements DescuentoStrategy {
    public double aplicarDescuento(double total, int cantidad) {
        if (cantidad > 10) return total * 0.25;
        if (cantidad > 5) return total * 0.15;
        return total * 0.05;
    }
}

class Carrito {
    private double total;
    private int cantidad;

    public Carrito(double total, int cantidad) {
        this.total = total;
        this.cantidad = cantidad;
    }

    public double calcularTotal(DescuentoStrategy estrategia) {
        double descuento = estrategia.aplicarDescuento(total, cantidad);
        return total - descuento;
    }
}

public class Ejercicio_2_Descuentos {
    public static void main(String[] args) {

        Carrito carrito = new Carrito(2000, 8);

        DescuentoStrategy estrategia = new DescuentoProgresivo();

        double totalFinal = carrito.calcularTotal(estrategia);

        System.out.println("Total final: " + totalFinal);
    }
}