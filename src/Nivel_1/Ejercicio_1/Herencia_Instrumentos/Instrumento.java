package Nivel_1.Ejercicio_1.Herencia_Instrumentos;

public abstract class Instrumento {

    private String nombre;
    private int precio;

    public Instrumento(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract void tocar();

    static {
        System.out.println("Instancia de la superclase Instrumento creada.");
    }

    @Override
    public String toString() {
        return "Instrumento --> " +
                "nombre = " + nombre +
                ", precio = " + precio + " euros.";
    }
}

