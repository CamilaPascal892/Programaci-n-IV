class Usuario {
    private static int contador = 0;

    private int id;
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.id = ++contador;
    }

    public static int totalUsuarios() {
        return contador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Usuario ID: " + id + " | Nombre: " + nombre;
    }
}

public class Ejercicio_8_UsuariosStatic {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("Juan");
        Usuario u2 = new Usuario("Ana");

        System.out.println(u1);
        System.out.println(u2);

        System.out.println("Total usuarios: " + Usuario.totalUsuarios());
    }
}
