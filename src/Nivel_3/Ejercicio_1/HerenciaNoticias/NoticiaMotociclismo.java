package Nivel_3.Ejercicio_1.HerenciaNoticias;

public class NoticiaMotociclismo extends Noticia{

    private String equipo;

    public NoticiaMotociclismo(String titular, String texto, String equipo) {
        super(titular, texto);
        this.equipo = equipo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public double calcularPrecioNoticia() {
        precio = 100;
        if ("Honda".equalsIgnoreCase(equipo) || "Yamaha".equalsIgnoreCase(equipo)){
            precio += 50;
        }
        return precio;
    }

    @Override
    public int calcularPuntuacion() {
        puntuacion = 3;
        if ("Honda".equalsIgnoreCase(equipo) || "Yamaha".equalsIgnoreCase(equipo)){
            puntuacion += 3;
        }
        return puntuacion;
    }

    @Override
    public String toString() {
        return "\n_Noticia de Motociclismo: \n\"" +super.titular+
                "\"\nEl informe del equipo " + equipo +
                " tiene un precio de " + precio +" €, con una puntuación de "+ puntuacion + " puntos." +
                "\n" +super.toString();
    }
}
