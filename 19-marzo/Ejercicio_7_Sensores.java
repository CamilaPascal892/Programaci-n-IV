import java.util.*;
import java.util.stream.*;

class Lectura {
    String sensor;
    double valor;

    public Lectura(String sensor, double valor) {
        this.sensor = sensor;
        this.valor = valor;
    }
}

public class Ejercicio_7_Sensores {
    public static void main(String[] args) {

        List<Lectura> datos = Arrays.asList(
                new Lectura("S1", 10),
                new Lectura("S1", 20),
                new Lectura("S2", 30)
        );

        Map<String, Double> promedios = datos.stream()
                .collect(Collectors.groupingBy(
                        l -> l.sensor,
                        Collectors.averagingDouble(l -> l.valor)
                ));

        System.out.println(promedios);
    }
}