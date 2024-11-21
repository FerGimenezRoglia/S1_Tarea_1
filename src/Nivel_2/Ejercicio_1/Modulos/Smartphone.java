package Nivel_2.Ejercicio_1.Modulos;

public class Smartphone extends Telefono implements Camara, Reloj {

    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    public void llamar(String numero) {
        System.out.println("Llamando al número: " + numero + "...\n");
    }

    public void fotografiando() {
        System.out.println("Se está haciendo una foto\n");
    }

    public void alarma() {
        System.out.println("Está sonando la alarma\n");
    }

    @Override
    public String toString() {
        return "Smartphone: " +
                "\nMarca = " + super.getMarca() +
                "\nModelo = " + super.getModelo();
    }
}
