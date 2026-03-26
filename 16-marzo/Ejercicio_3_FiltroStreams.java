import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio_3_FiltroStreams {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(
            1,2,3,4,5,6,7,8,9,10,
            11,12,13,14,15,16,17,18,19,20
        );

        List<Integer> resultado = numeros.stream()
                .filter(n -> n % 2 == 0)
                .filter(n -> n > 10)
                .collect(Collectors.toList());

        System.out.println("Pares > 10: " + resultado);

        List<Integer> resultado2 = numeros.stream()
                .filter(n -> n % 2 == 0 && n > 10)
                .collect(Collectors.toList());

        System.out.println("Alternativo: " + resultado2);
    }
}