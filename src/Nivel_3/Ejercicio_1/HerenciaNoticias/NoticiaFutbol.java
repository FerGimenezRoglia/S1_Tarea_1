package Nivel_3.Ejercicio_1.HerenciaNoticias;

public class NoticiaFutbol extends Noticia {

    private String competicionFutbol;
    private String clubFutbol;
    private String jugadorFutbol;

    public NoticiaFutbol(String titular, String texto, String competiciónFutbol, String clubFutbol, String jugadorFutbol) {

        super(titular, texto);
        this.competicionFutbol = competiciónFutbol;
        this.clubFutbol = clubFutbol;
        this.jugadorFutbol = jugadorFutbol;
    }

    public String getCompeticiónFutbol() {
        return competicionFutbol;
    }

    public void setCompeticiónFutbol(String competiciónFutbol) {
        this.competicionFutbol = competiciónFutbol;
    }

    public String getClubFutbol() {
        return clubFutbol;
    }

    public void setClubFutbol(String clubFutbol) {
        this.clubFutbol = clubFutbol;
    }

    public String getJugadorFutbol() {
        return jugadorFutbol;
    }

    public void setJugadorFutbol(String jugadorFutbol) {
        this.jugadorFutbol = jugadorFutbol;
    }

    @Override
    public double calcularPrecioNoticia() {
        precio = 300;
        if ("Liga de Campeones".equalsIgnoreCase(competicionFutbol)) {
            precio += 100;
        }
        if ("Barça".equalsIgnoreCase(clubFutbol) || "Madrid".equalsIgnoreCase(clubFutbol)) {
            precio += 100;
        }
        if ("Ferran Torres".equalsIgnoreCase(jugadorFutbol) || "Benzema".equalsIgnoreCase(jugadorFutbol)) {
            precio += 50;
        }
        return precio;
    }

    @Override
    public int calcularPuntuacion() {
        puntuacion = 5;
        if ("Liga de Campeones".equalsIgnoreCase(competicionFutbol)) {
            puntuacion += 3;
        }
        if ("Liga".equalsIgnoreCase(competicionFutbol)) {
            puntuacion += 2;
        }
        if ("Barça".equalsIgnoreCase(clubFutbol) || "Madrid".equalsIgnoreCase(clubFutbol)) {
            puntuacion += 1;
        }
        if ("Ferran Torres".equalsIgnoreCase(jugadorFutbol) || "Benzema".equalsIgnoreCase(jugadorFutbol)) {
           puntuacion += 1;
        }
        return puntuacion;
    }

    @Override
    public String toString() {
        return "\n_Noticia de Fútbol: \n\"" +super.titular+
                "\"\nEl informe de la competición " + competicionFutbol +
                " en el club " + clubFutbol +
                " y con el jugador " + jugadorFutbol +
                " tiene un precio de " + precio +" €, con una puntuación de "+ puntuacion + " puntos." +
                "\n" +super.toString();
    }
}
