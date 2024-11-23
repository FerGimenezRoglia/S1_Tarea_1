package Nivel_3.Ejercicio_1.HerenciaNoticias;

public abstract class Noticia {

    protected String titular;
    protected String texto;
    protected int puntuacion;
    protected double precio;

    public Noticia(String titular, String texto) {
        this.titular    = titular;
        this.texto      = texto;
        this.puntuacion = 0;
        this.precio     = 0f;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public abstract double calcularPrecioNoticia();

    public abstract int calcularPuntuacion();

    @Override
    public String toString() {
        return "_Redacción de la Noticia:\n" + texto;
    }

}
