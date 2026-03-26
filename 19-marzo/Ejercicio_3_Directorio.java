import java.util.*;

class Contacto {
    String nombre;
    String sede;

    public Contacto(String nombre, String sede) {
        this.nombre = nombre;
        this.sede = sede;
    }
}

public class Ejercicio_3_Directorio {
    public static void main(String[] args) {

        Map<String, Contacto> directorio = new HashMap<>();

        directorio.put("juan", new Contacto("Juan", "BA"));
        directorio.put("ana", new Contacto("Ana", "Córdoba"));

        System.out.println(directorio.get("juan").nombre);
    }
}