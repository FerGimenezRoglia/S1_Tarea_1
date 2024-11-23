package Nivel_3.Ejercicio_1.Modulos;

import Nivel_3.Ejercicio_1.HerenciaNoticias.Noticia;

import java.util.ArrayList;

public class Redactor {

    private String nombre;
    private final String DNI;
    private static float sueldo = 1500;
    private ArrayList<Noticia> noticiasRedactor;

    public Redactor(String nombre, String DNI) {
        this.nombre           = nombre;
        this.DNI              = DNI;
        this.noticiasRedactor = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public static float getSueldo() {
        return sueldo;
    }

    public static void setSueldo(float sueldo) {
        Redactor.sueldo = sueldo;
    }

    public ArrayList<Noticia> getNoticiasRedactor() {
        return noticiasRedactor;
    }

    @Override
    public String toString() {
        return "Redactor: --> Nombre = " + nombre + " --> DNI = '" + DNI + '\'' +
                "\nNoticias asignadas del redactor: " + noticiasRedactor.size();
    }
}
