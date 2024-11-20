package Nivel_1.Ejercicio_2;

import static Nivel_1.Ejercicio_2.Coche.MARCA;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nCargando Programa de Coches " + MARCA + " ...\n");

        Coche coche1 = new Coche(1200);
        Coche coche2 = new Coche(800);

        System.out.println("Mostrando Producción de Coches_1:");
        Coche.frenar();
        coche1.setModelo("Uno");

        System.out.println(coche1.toString());
        coche1.acelerar();

        System.out.println("Mostrando Producción de Coches_2:");
        Coche.frenar();
        coche1.setModelo("Panda");

        System.out.println(coche2.toString());
        coche2.acelerar();
    }
}
