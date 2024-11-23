package Nivel_3.Ejercicio_1.Modulos;

import Nivel_3.Ejercicio_1.HerenciaNoticias.Noticia;

import java.util.ArrayList;

public class AgenciaNoticias {

    private String nombre = "Redacción de Noticias Deportivas";
    private ArrayList <Redactor> redactores;
    public ArrayList <Noticia> noticias;

    public AgenciaNoticias() {
        this.redactores = new ArrayList<>();
        this.noticias = new ArrayList<>();
    }

    public ArrayList<Redactor> getRedactores() {
        return redactores;
    }

    public ArrayList<Noticia> getNoticias() {
        return noticias;
    }

    @Override
    public String toString() {
        return nombre +
                ":\nEn este momento tenemos asignados " + redactores.size() +
                " redactores y hemos redactado " + noticias.size() + " noticias.";
    }
}
