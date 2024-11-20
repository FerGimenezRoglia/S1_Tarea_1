package Nivel_1.Ejercicio_1;

import Nivel_1.Ejercicio_1.Herencia_Instrumentos.Cuerda;
import Nivel_1.Ejercicio_1.Herencia_Instrumentos.Percusion;
import Nivel_1.Ejercicio_1.Herencia_Instrumentos.Viento;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nSe está cargando el programa Instrumentos...\n");

        System.out.println("Se está cargando el instrumento de Viento.");
        Viento instrumentoViento = new Viento("Flauta", 90);
        System.out.println("Se ha cargado el instrumento de viento correctamente.\n");
        instrumentoViento.tocar();
        System.out.println(instrumentoViento.toString() + "\n");

        System.out.println("Se está cargando el instrumento de Cuerda.");
        Cuerda instrumentoCuerda = new Cuerda("Guitarra", 220);
        System.out.println("Se ha cargado el instrumento de Cuerda correctamente.\n");
        instrumentoCuerda.tocar();
        System.out.println(instrumentoCuerda.toString() + "\n");

        System.out.println("Se está cargando el instrumento de Percusion.");
        Percusion instrumentoPercusion = new Percusion("Batería", 500);
        System.out.println("Se ha cargado el instrumento de Percusion correctamente.\n");
        instrumentoPercusion.tocar();
        System.out.println(instrumentoCuerda.toString() + "\n");

    }
}