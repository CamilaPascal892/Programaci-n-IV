import java.util.*;

class Empleado {
    private int id;
    private String nombre;
    private String depto;

    public Empleado(int id, String nombre, String depto) {
        this.id = id;
        this.nombre = nombre;
        this.depto = depto;
    }

    public int getId() { return id; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado)) return false;
        Empleado e = (Empleado) o;
        return id == e.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return id + " - " + nombre;
    }
}

public class Ejercicio_1_EmpleadosSet {
    public static void main(String[] args) {
        Set<Empleado> empleados = new HashSet<>();

        empleados.add(new Empleado(1, "Juan", "IT"));
        empleados.add(new Empleado(1, "Juan cambiado", "HR")); // duplicado

        System.out.println("Cantidad: " + empleados.size());
    }
}