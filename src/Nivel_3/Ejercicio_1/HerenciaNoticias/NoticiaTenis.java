package Nivel_3.Ejercicio_1.HerenciaNoticias;

public class NoticiaTenis extends Noticia {

    private String competicionTenis;
    private String tenista;

    public NoticiaTenis(String titular, String texto, String competicionTenis, String tenista) {
        super(titular, texto);
        this.competicionTenis = competicionTenis;
        this.tenista = tenista;
    }

    public String getCompeticionTenis() {
        return competicionTenis;
    }

    public void setCompeticionTenis(String competicionTenis) {
        this.competicionTenis = competicionTenis;
    }

    public String getTenista() {
        return tenista;
    }

    public void setTenista(String tenista) {
        this.tenista = tenista;
    }

    @Override
    public double calcularPrecioNoticia() {
        precio = 150;
        if ("Federer".equalsIgnoreCase(tenista) || "Navidad".equalsIgnoreCase(tenista) || "Djokovic".equalsIgnoreCase(tenista)) {
            precio += 100;
        }
        return precio;
    }

    @Override
    public int calcularPuntuacion() {
        puntuacion = 4;
        if ("Federer".equalsIgnoreCase(tenista) || "Navidad".equalsIgnoreCase(tenista) || "Djokovic".equalsIgnoreCase(tenista)) {
            puntuacion += 3;
        }
        return puntuacion;
    }

    @Override
    public String toString() {
        return "\n_Noticia de Tennis: \n\"" +super.titular+
                "\"\nEl informe de la competición " + competicionTenis +
                " y el tenista " + tenista +
                " tiene un precio de " + precio +" €, con una puntuación de "+ puntuacion + " puntos." +
                "\n" +super.toString();
    }
}
