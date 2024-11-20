package Nivel_1.Ejercicio_1.Herencia_Instrumentos;

public class Viento extends Instrumento {

    public Viento(String nombre, int precio) {
        super(nombre, precio);
    }

    static {
        System.out.println("Instancia de la clase Viento creada.");
    }

    @Override
    public void tocar() {
        System.out.println("Está sonando un instrumento de viento.");
    }
}