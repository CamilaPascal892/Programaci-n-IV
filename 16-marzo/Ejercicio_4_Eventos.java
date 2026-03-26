import java.util.*;
import java.util.stream.Collectors;

class Evento {
    private String nombre;
    private String categoria;
    private Set<String> participantes;

    public Evento(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.participantes = new HashSet<>();
    }

    public void agregarParticipante(String dni) {
        participantes.add(dni); 
    }

    public int getCantidadParticipantes() {
        return participantes.size();
    }

    public String getCategoria() {
        return categoria;
    }

    public Set<String> getParticipantes() {
        return participantes;
    }

    public String getNombre() {
        return nombre;
    }
}

public class Ejercicio_4_Eventos {
    public static void main(String[] args) {

        List<Evento> eventos = new ArrayList<>();

        Evento e1 = new Evento("Conferencia Java", "Tecnología");
        Evento e2 = new Evento("Workshop UX", "Diseño");

        e1.agregarParticipante("123");
        e1.agregarParticipante("456");

        e2.agregarParticipante("123"); 
        e2.agregarParticipante("789");

        eventos.add(e1);
        eventos.add(e2);

        long totalUnicos = eventos.stream()
                .flatMap(e -> e.getParticipantes().stream())
                .distinct()
                .count();

        System.out.println("Total participantes únicos: " + totalUnicos);

        Map<String, Long> porCategoria = eventos.stream()
                .collect(Collectors.groupingBy(
                        Evento::getCategoria,
                        Collectors.counting()
                ));

        System.out.println("Eventos por categoría: " + porCategoria);

        Evento max = eventos.stream()
                .max(Comparator.comparingInt(Evento::getCantidadParticipantes))
                .orElse(null);

        System.out.println("Evento con más participantes: " + max.getNombre());
    }
}