package Nivel_1.Ejercicio_1.Herencia_Instrumentos;

public class Percusion extends Instrumento {

    public Percusion(String nombre, int precio) {
        super(nombre, precio);
    }

    static {
        System.out.println("Instancia de la clase Percusión Percusion.");
    }

    @Override
    public void tocar() {
        System.out.println("Está sonando un instrumento de percusión.");
    }
}