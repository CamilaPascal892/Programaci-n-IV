interface Empleado {
    String getNombre();
    double calcularSalario();
}

interface Bonificable {
    double calcularBonificacion();
}

interface Imponible {
    double calcularImpuesto();
}

//aca con esto estoy haciendo la clase completa
class EmpleadoFull implements Empleado, Bonificable, Imponible {

    private String nombre;
    private double salario;

    public EmpleadoFull(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularSalario() {
        return salario;
    }

    public double calcularBonificacion() {
        return salario * 0.10;
    }

    public double calcularImpuesto() {
        return salario * 0.15;
    }
}

class Reporte {

    public static void mostrar(Empleado e) {

        double salario = e.calcularSalario();
        double bono = 0;
        double impuesto = 0;

        if (e instanceof Bonificable) {
            bono = ((Bonificable) e).calcularBonificacion();
        }

        if (e instanceof Imponible) {
            impuesto = ((Imponible) e).calcularImpuesto();
        }

        double total = salario + bono - impuesto;

        System.out.println(e.getNombre() + " -> Total: " + total);
    }
}

public class Ejercicio_4_EmpleadosAvanzado {
    public static void main(String[] args) {

        Empleado e = new EmpleadoFull("Juan", 1000);

        Reporte.mostrar(e);
    }
}