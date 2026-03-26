import java.util.*;

class Usuario {
    private String dni;
    private String nombre;
    private String email;
    private String telefono;

    public Usuario(String dni, String nombre, String email, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public String getTelefono() { return telefono; }

    @Override
    public String toString() {
        return "DNI: " + dni +
               " | Nombre: " + nombre +
               " | Email: " + email +
               " | Tel: " + telefono;
    }
}

public class Ejercicio_2_UsuariosHashMap {
    public static void main(String[] args) {

        Map<String, Usuario> usuarios = new HashMap<>();

        usuarios.put("123", new Usuario("123", "Juan", "juan@mail.com", "111"));
        usuarios.put("456", new Usuario("456", "Ana", "ana@mail.com", "222"));

        String dniBuscado = "123";

        Usuario u = usuarios.get(dniBuscado);

        if (u != null) {
            System.out.println("Encontrado: " + u);
        } else {
            System.out.println("No existe");
        }
    }
}