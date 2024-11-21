package Nivel_2.Ejercicio_1.Modulos;

public abstract class Telefono {

    private String marca;
    private String modelo;

    public Telefono(String marca, String modelo) {
        this.marca  = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract void llamar(String numero);

    @Override
    public String toString() {
        return "Telefono: " +
                "\nMarca = " + marca +
                "\nModelo = " + modelo;
    }
}
