import java.util.*;

class Usuario {
    String username;
    Set<Usuario> amigos = new HashSet<>();

    public Usuario(String username) {
        this.username = username;
    }

    public void agregarAmigo(Usuario u) {
        amigos.add(u);
    }
}

public class Ejercicio_5_RedSocial {
    public static void main(String[] args) {

        Map<String, Usuario> red = new HashMap<>();

        Usuario u1 = new Usuario("juan");
        Usuario u2 = new Usuario("ana");

        red.put("juan", u1);
        red.put("ana", u2);

        u1.agregarAmigo(u2);

        System.out.println("Amigos de juan: " + u1.amigos.size());
    }
}