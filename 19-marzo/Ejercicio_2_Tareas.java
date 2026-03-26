import java.util.*;

enum Estado { PENDIENTE, EN_PROCESO, COMPLETADA }
enum Prioridad { BAJA, MEDIA, ALTA }

class Tarea {
    String nombre;
    Estado estado;
    Prioridad prioridad;

    public Tarea(String nombre, Prioridad prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.estado = Estado.PENDIENTE;
    }
}

public class Ejercicio_2_Tareas {
    public static void main(String[] args) {

        List<Tarea> tareas = new ArrayList<>();

        tareas.add(new Tarea("Bug urgente", Prioridad.ALTA));
        tareas.add(new Tarea("UI", Prioridad.MEDIA));

        // Filtrar por prioridad alta
        tareas.stream()
                .filter(t -> t.prioridad == Prioridad.ALTA)
                .forEach(t -> System.out.println(t.nombre));
    }
}