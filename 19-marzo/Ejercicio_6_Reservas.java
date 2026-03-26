import java.util.*;

class Reserva {
    int inicio;
    int fin;

    public Reserva(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
}

class Sala {
    List<Reserva> reservas = new ArrayList<>();

    public boolean reservar(int inicio, int fin) {
        for (Reserva r : reservas) {
            if (!(fin <= r.inicio || inicio >= r.fin)) {
                return false; 
            }
        }
        reservas.add(new Reserva(inicio, fin));
        return true;
    }
}

public class Ejercicio_6_Reservas {
    public static void main(String[] args) {

        Sala sala = new Sala();

        System.out.println(sala.reservar(10, 12)); // este caso que sea verdadero
        System.out.println(sala.reservar(11, 13)); // este caso para que me dé falso
    }
}