enum Canal {
    EMAIL, SMS, PUSH
}

enum Severidad {
    BAJA, MEDIA, ALTA
}

interface Notificacion {
    void enviar(String mensaje);
}

class EmailNotificacion implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("EMAIL: " + mensaje);
    }
}

class SMSNotificacion implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("SMS: " + mensaje);
    }
}

class PushNotificacion implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("PUSH: " + mensaje);
    }
}

class GestorNotificaciones {

    public void enviar(Notificacion[] canales, String mensaje, Severidad nivel) {

    
        if (nivel == Severidad.BAJA) {
            System.out.println("Notificación leve");
        }

        for (Notificacion n : canales) {
            n.enviar(mensaje);
        }
    }
}

public class Ejercicio_1_Notificaciones {
    public static void main(String[] args) {

        Notificacion[] canales = {
            new EmailNotificacion(),
            new SMSNotificacion()
        };

        GestorNotificaciones gestor = new GestorNotificaciones();

        gestor.enviar(canales, "Sistema caído", Severidad.ALTA);
    }
}