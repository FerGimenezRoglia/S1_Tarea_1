package Nivel_1.Ejercicio_1.Herencia_Instrumentos;

public class Cuerda extends Instrumento {

    public Cuerda(String nombre, int precio) {
        super(nombre, precio);
    }

    static {
        System.out.println("Instancia de la clase Cuerda creada.");
    }

    @Override
    public void tocar() {
        System.out.println("Está sonando un instrumento de cuerda.");
    }
}