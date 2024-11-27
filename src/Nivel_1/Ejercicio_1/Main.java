package Nivel_1.Ejercicio_1;

import Nivel_1.Ejercicio_1.Herencia_Instrumentos.Cuerda;
import Nivel_1.Ejercicio_1.Herencia_Instrumentos.Instrumento;
import Nivel_1.Ejercicio_1.Herencia_Instrumentos.Percusion;
import Nivel_1.Ejercicio_1.Herencia_Instrumentos.Viento;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nSe está cargando el programa Instrumentos...");
        System.out.println(Instrumento.inicio());

        Viento instrumentoViento = new Viento("Flauta", 90);
        instrumentoViento.tocar();
        System.out.println(instrumentoViento.toString() + "\n");

        Cuerda instrumentoCuerda = new Cuerda("Guitarra", 220);
        instrumentoCuerda.tocar();
        System.out.println(instrumentoCuerda.toString() + "\n");

        Percusion instrumentoPercusion = new Percusion("Batería", 500);
        instrumentoPercusion.tocar();
        System.out.println(instrumentoCuerda.toString() + "\n");

    }
}