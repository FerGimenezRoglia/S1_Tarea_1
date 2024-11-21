package Nivel_2.Ejercicio_1;

import Nivel_2.Ejercicio_1.Modulos.Smartphone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Smartphone smartphone = new Smartphone("Iphone", "16Pro");

        System.out.println("Inicializando el Smartphone...\n");

        System.out.println("Marcar el número de teléfono:");
        String numero = sc.nextLine();
        smartphone.llamar(numero);

        System.out.println("Abriendo la Cámara...");
        smartphone.fotografiando();
        System.out.println("Alarma:");
        smartphone.alarma();

    }
}
