package Nivel_1.Ejercicio_2;

public class Coche {

    public static final String MARCA = "Fiat";
    private static String modelo;
    private final int potencia;

    public Coche(int potencia) {
        this.potencia = potencia;
    }

    public static String getModelo() {
        return modelo;
    }

    public static void setModelo(String modelo) {
        Coche.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public static void frenar() {
        System.out.println("El vehículo está frenando.");
    }

    public void acelerar() {
        System.out.println("El vehículo está acelerando...\n");
    }

    @Override
    public String toString() {
        return "Coche: \n_" + MARCA + " \n_Modelo: " + modelo + "\n_Potencia: " + potencia + " caballos de fuerza";
    }
}
