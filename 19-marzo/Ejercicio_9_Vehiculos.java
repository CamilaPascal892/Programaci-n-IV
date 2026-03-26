abstract class Vehiculo {
    String marca;
    String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract double calcularConsumo();
}

class Auto extends Vehiculo {
    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }

    public double calcularConsumo() {
        return 8.5;
    }
}

class Moto extends Vehiculo {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    public double calcularConsumo() {
        return 4.0;
    }
}

public class Ejercicio_9_Vehiculos {
    public static void main(String[] args) {

        Vehiculo v1 = new Auto("Ford", "Fiesta");
        Vehiculo v2 = new Moto("Honda", "XR");

        System.out.println(v1.calcularConsumo());
        System.out.println(v2.calcularConsumo());
    }
}