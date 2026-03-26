import java.util.*;

interface Autenticador {
    boolean autenticar(String usuario);
}


class AuthPassword implements Autenticador {
    public boolean autenticar(String usuario) {
        System.out.println("Auth por contraseña");
        return true;
    }
}

class AuthOAuth implements Autenticador {
    public boolean autenticar(String usuario) {
        System.out.println("Auth OAuth");
        return true;
    }
}

class AuthBiometrico implements Autenticador {
    public boolean autenticar(String usuario) {
        System.out.println("Auth biométrico");
        return true;
    }
}

class SistemaAutenticacion {

    private List<Autenticador> metodos = new ArrayList<>();

    public void agregarMetodo(Autenticador a) {
        metodos.add(a);
    }

    public boolean autenticarTodo(String usuario) {
        for (Autenticador a : metodos) {
            if (!a.autenticar(usuario)) {
                return false;
            }
        }
        return true;
    }
}

public class Ejercicio_3_Autenticacion {
    public static void main(String[] args) {

        SistemaAutenticacion sistema = new SistemaAutenticacion();

        sistema.agregarMetodo(new AuthPassword());
        sistema.agregarMetodo(new AuthOAuth());

        boolean resultado = sistema.autenticarTodo("admin");

        System.out.println("Acceso: " + resultado);
    }
}