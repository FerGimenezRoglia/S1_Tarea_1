package Nivel_3.Ejercicio_1;

import Nivel_3.Ejercicio_1.HerenciaNoticias.*;
import Nivel_3.Ejercicio_1.Modulos.AgenciaNoticias;
import Nivel_3.Ejercicio_1.Modulos.Redactor;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AgenciaNoticias agenciaNoticias = new AgenciaNoticias();
        System.out.println("\nInicializando la App... \n" + agenciaNoticias.toString());

        pruebasDeInstancias(agenciaNoticias); //instancio Redactores y Noticias de PRUEBA.

        int opcion = 0;
        Redactor redactorEncotrado = null;
        Noticia noticiaEncontrada = null;
        Noticia nuevaNoticia = null;

        do {
            opcion = menu();

            switch (opcion) {
                case 1:
                    redactorEncotrado = buscarRedactor(agenciaNoticias.getRedactores());
                    introducirRedactor(agenciaNoticias.getRedactores(), redactorEncotrado);
                    break;
                case 2:
                    eliminarRedactor(agenciaNoticias.getRedactores(), redactorEncotrado);
                    break;
                case 3:
                    noticiaEncontrada = buscarNoticia(agenciaNoticias.getNoticias());
                    if (noticiaEncontrada == null) {
                        nuevaNoticia = crearNoticia();
                    }
                    redactorEncotrado = buscarRedactor(agenciaNoticias.getRedactores());
                    introducirNoticiarRedactor(redactorEncotrado, noticiaEncontrada, nuevaNoticia);
                    break;
                case 4:
                    redactorEncotrado = buscarRedactor(agenciaNoticias.getRedactores());
                    eliminarNoticiaRedactor(redactorEncotrado);
                    break;
                case 5:
                    redactorEncotrado = buscarRedactor(agenciaNoticias.getRedactores());
                    mostrarNoticiasRedactor(redactorEncotrado);
                    break;
                case 6:
                    noticiaEncontrada = buscarNoticia(agenciaNoticias.getNoticias());
                    calcularPuntuacionNoticia(noticiaEncontrada);
                    break;
                case 7:
                    noticiaEncontrada = buscarNoticia(agenciaNoticias.getNoticias());
                    calcularPrecioNoticia(noticiaEncontrada);
                    break;
                case 0:
                    System.out.println("Saliendo de la App... ");
                    break;
                default:
                    System.out.println("Introduzca una opción válida.");
            }
        } while (opcion > 0 && opcion < 8);
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("____________________________________________________________________________");
        System.out.println("* Administracón de Noticias *");
        System.out.println("1_ Introducir redactor.");
        System.out.println("2_ Eliminar redactor.");
        System.out.println("3_ Introducir noticia a un redactor.");
        System.out.println("4_ Eliminar noticia.");
        System.out.println("5_ Mostrar todas las noticias por redactor.");
        System.out.println("6_ Calcular puntuación de la noticia.");
        System.out.println("7_ Calcular precio de la noticia.");
        System.out.println("0_ Salir de la App.");
        System.out.println("____________________________________________________________________________");
        System.out.println("Introduce una opción:");
        int opcion = sc.nextInt();
        return opcion;
    }

    public static Redactor buscarRedactor(ArrayList<Redactor> redactores) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        Redactor redactorEncontrado = null;
        int size = redactores.size();

        System.out.println("Introduzca el DNI del redactor: ");
        String dniBuscado = sc.nextLine();

        while (redactorEncontrado == null && i < size) {
            if (redactores.get(i).getDNI().equalsIgnoreCase(dniBuscado)) {
                redactorEncontrado = redactores.get(i);
            }
            i++;
        }

        return redactorEncontrado;
    }

    public static void introducirRedactor(ArrayList<Redactor> redactores, Redactor redactorEncontrado) {
        Scanner sc = new Scanner(System.in);

        if (redactorEncontrado == null) {

            System.out.println("Introduzca el nombre del redactor:");
            String nombre = sc.nextLine();
            System.out.println("Introduzca el DNI del redactor:");
            String dni = sc.nextLine();

            redactores.add(new Redactor(nombre, dni));
            System.out.println("El redactor " + nombre + " ha sido introducido correctamente.");
        } else {
            System.out.println("El redactor ya está en nuestra base de datos");
        }

    }

    public static void eliminarRedactor(ArrayList<Redactor> redactores, Redactor redactorEncontrado) {
        Scanner sc = new Scanner(System.in);

        boolean redactorEliminado = false;
        System.out.println("Introduzca el DNI del redactor a eliminar: ");
        String dniEliminar = sc.nextLine();

        ListIterator<Redactor> it = redactores.listIterator();
        while (it.hasNext()) {
            Redactor redactorActual = it.next();
            if (redactorActual.getDNI().equalsIgnoreCase(dniEliminar)) {
                it.remove();
                redactorEliminado = true;
                System.out.println("El redactor " + redactorActual.getNombre() + " se ha eliminado correctamente.");
            }
        }
        if (!redactorEliminado) {
            System.out.println("No se ha podido eliminar ningún redactor.");
        }
    }

    public static Noticia buscarNoticia(ArrayList<Noticia> noticias) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        Noticia noticiaEncontrada = null;
        int size = noticias.size();

        System.out.println("Introduzca el titular de la Noticia:");
        String titularBuscado = sc.nextLine();

        while (noticiaEncontrada == null && i < size) {
            if (titularBuscado.equalsIgnoreCase(noticias.get(i).getTitular())) {
                noticiaEncontrada = noticias.get(i);
            }
            i++;
        }

        return noticiaEncontrada;
    }

    public static Noticia crearNoticia() {
        Scanner sc = new Scanner(System.in);
        Noticia nuevaNoticia = null;
        int opcion;

        do {
            System.out.println("Seleccione el tipo de noticia que desea crear:");
            System.out.println("1. Noticia de Fútbol");
            System.out.println("2. Noticia de Baloncesto");
            System.out.println("3. Noticia de Tenis");
            System.out.println("4. Noticia de Fórmula 1");
            System.out.println("5. Noticia de Motociclismo");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el titular de la noticia:");
                    String titularFutbol = sc.nextLine();
                    System.out.println("Ingrese el texto de la noticia:");
                    String textoFutbol = sc.nextLine();
                    System.out.println("Ingrese la competición:");
                    String competicionFutbol = sc.nextLine();
                    System.out.println("Ingrese el club:");
                    String clubFutbol = sc.nextLine();
                    System.out.println("Ingrese el jugador):");
                    String jugadorFutbol = sc.nextLine();
                    nuevaNoticia = new NoticiaFutbol(titularFutbol, textoFutbol, competicionFutbol, clubFutbol, jugadorFutbol);
                    break;

                case 2:
                    System.out.println("Ingrese el titular de la noticia:");
                    String titularBaloncesto = sc.nextLine();
                    System.out.println("Ingrese el texto de la noticia:");
                    String textoBaloncesto = sc.nextLine();
                    System.out.println("Ingrese la competición:");
                    String competicionBaloncesto = sc.nextLine();
                    System.out.println("Ingrese el club:");
                    String clubBaloncesto = sc.nextLine();
                    nuevaNoticia = new NoticiaBaloncesto(titularBaloncesto, textoBaloncesto, competicionBaloncesto, clubBaloncesto);
                    break;

                case 3:
                    System.out.println("Ingrese el titular de la noticia:");
                    String titularTenis = sc.nextLine();
                    System.out.println("Ingrese el texto de la noticia:");
                    String textoTenis = sc.nextLine();
                    System.out.println("Ingrese la competición:");
                    String competicionTenis = sc.nextLine();
                    System.out.println("Ingrese el tenista:");
                    String tenista = sc.nextLine();
                    nuevaNoticia = new NoticiaTenis(titularTenis, textoTenis, competicionTenis, tenista);
                    break;

                case 4:
                    System.out.println("Ingrese el titular de la noticia:");
                    String titularF1 = sc.nextLine();
                    System.out.println("Ingrese el texto de la noticia:");
                    String textoF1 = sc.nextLine();
                    System.out.println("Ingrese la escudería:");
                    String escuderia = sc.nextLine();
                    nuevaNoticia = new NoticiaF1(titularF1, textoF1, escuderia);
                    break;

                case 5:
                    System.out.println("Ingrese el titular de la noticia:");
                    String titularMoto = sc.nextLine();
                    System.out.println("Ingrese el texto de la noticia:");
                    String textoMoto = sc.nextLine();
                    System.out.println("Ingrese el equipo:");
                    String equipoMoto = sc.nextLine();
                    nuevaNoticia = new NoticiaMotociclismo(titularMoto, textoMoto, equipoMoto);
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion < 1 || opcion > 5);

        if (nuevaNoticia != null) {
            System.out.println("La noticia se ha creado correctamente:\n" + nuevaNoticia);
        }

        return nuevaNoticia;
    }

    public static void introducirNoticiarRedactor(Redactor redactorEncotrado, Noticia noticiaEncontrada, Noticia nuevaNoticia) {

        if (nuevaNoticia != null) {
            if (redactorEncotrado != null) {
                redactorEncotrado.getNoticiasRedactor().add(nuevaNoticia);
                System.out.println("la noticia ha sido asignada correctamente.\n" + redactorEncotrado);

            } else {
                System.out.println("La noticia " + nuevaNoticia + " no se ha podido asignar a un redactor.");
            }
        }
        if (noticiaEncontrada != null) {
            if (redactorEncotrado != null) {
                redactorEncotrado.getNoticiasRedactor().add(noticiaEncontrada);
                System.out.println("la noticia ha sido asignada correctamente.\n" + redactorEncotrado);

            } else {
                System.out.println("La noticia " + noticiaEncontrada + " no se ha podido asignar a un redactor.");
            }
        }

    }

    public static void eliminarNoticiaRedactor(Redactor redactorEncontrado) {

        if (redactorEncontrado != null) {
            ArrayList<Noticia> noticiasRedactor = redactorEncontrado.getNoticiasRedactor();
            Noticia noticiaEliminar = buscarNoticia(noticiasRedactor);

            if (noticiasRedactor.contains(noticiaEliminar)) {
                noticiasRedactor.remove(noticiaEliminar);
                System.out.println("La noticia ya no está asignada al redactor " + redactorEncontrado.getNombre() + ".");
            } else {
                System.out.println("No se ha podido eliminar esta noticia.");
            }
        } else {
            System.out.println("No se ha podido eliminar noticia a ningún redactor.");
        }
    }

    public static void mostrarNoticiasRedactor(Redactor redactorEncontrado) {

        if (redactorEncontrado != null) {
            ArrayList<Noticia> noticiasRedactor = redactorEncontrado.getNoticiasRedactor();
            if (noticiasRedactor.isEmpty()) {
                System.out.println("El redactor no tiene noticias asignadas.");
            } else {
                for (Noticia noticia : noticiasRedactor) {
                    System.out.println(noticia.toString());
                }
            }
        } else {
            System.out.println("No se han podido visualizar las noticias de ningún redactor.");
        }

    }

    public static void calcularPuntuacionNoticia(Noticia noticiaEncontrada) {

        if (noticiaEncontrada != null) {
            int puntuacionAcual = noticiaEncontrada.calcularPuntuacion();
            System.out.println("Se ha calculado la puntuación correctamente.\nPuntuación Actual: " + puntuacionAcual + " puntos.");
            System.out.println(noticiaEncontrada.toString());
        } else {
            System.out.println("No se ha podido calcular puntuación.");
        }
    }

    public static void calcularPrecioNoticia(Noticia noticiaEncontrada) {

        if (noticiaEncontrada != null) {
            double precioAcual = noticiaEncontrada.calcularPrecioNoticia();
            System.out.println("Se ha calculado el precio correctamente.\nPrecio Actual: " + precioAcual + " €.");
            System.out.println(noticiaEncontrada.toString());
        } else {
            System.out.println("No se ha podido calcular precio.");
        }
    }

    public static void pruebasDeInstancias(AgenciaNoticias agenciaNoticias) {

        // -------> A continuación instancio objetos para verificar código.

        Redactor redactor1 = new Redactor("Pedro López", "76589473P");
        Redactor redactor2 = new Redactor("Joel Puig", "86742321J");
        agenciaNoticias.getRedactores().add(redactor1);
        agenciaNoticias.getRedactores().add(redactor2);

        NoticiaFutbol noticiaFutbol1 = new NoticiaFutbol(
                "Gran victoria del Barça",
                "El Barça ganó 3-1 en la Liga de Campeones.",
                "Liga de Campeones",
                "Barça",
                "Ferran Torres");
        NoticiaFutbol noticiaFutbol2 = new NoticiaFutbol(
                "Remontada histórica del Madrid",
                "El Real Madrid remontó un partido épico.",
                "Liga de Campeones",
                "Madrid",
                "Benzema");
        agenciaNoticias.getNoticias().add(noticiaFutbol1);
        agenciaNoticias.getNoticias().add(noticiaFutbol2);

        NoticiaBaloncesto noticiaBaloncesto1 = new NoticiaBaloncesto(
                "El Barça arrasa en la Euroliga",
                "El equipo de baloncesto del Barça domina en la Euroliga con una gran victoria.",
                "Euroliga",
                "Barça");
        NoticiaBaloncesto noticiaBaloncesto2 = new NoticiaBaloncesto(
                "Remontada épica del Real Madrid",
                "El Real Madrid logra una remontada histórica en el último cuarto.",
                "Liga ACB",
                "Madrid");
        agenciaNoticias.getNoticias().add(noticiaBaloncesto1);
        agenciaNoticias.getNoticias().add(noticiaBaloncesto2);

        NoticiaTenis noticiaTenis1 = new NoticiaTenis(
                "¿Dónde está la pelota de tenis?",
                "Una persona que estaba en el balcón de su casa le ha dado en la cabeza, una pelota de tenis.",
                "Liga ACB",
                "Federer");
        NoticiaTenis noticiaTenis2 = new NoticiaTenis(
                "Golpe espectacular de Nadal",
                "Rafael Nadal logra un golpe imposible en la final del Abierto de Australia.",
                "Abierto de Australia",
                "Djokovic");
        agenciaNoticias.getNoticias().add(noticiaTenis1);
        agenciaNoticias.getNoticias().add(noticiaTenis2);

        NoticiaF1 noticiaF1_1 = new NoticiaF1(
                "Victoria de Ferrari en el Gran Premio",
                "Ferrari logra una sorprendente victoria en el Gran Premio de Mónaco.",
                "Ferrari");
        NoticiaF1 noticiaF1_2 = new NoticiaF1(
                "Mercedez domina en la temporada",
                "El equipo Mercedez sigue liderando con Rodolfo Velóz y Curva Sanchéz como protagonistas.",
                "Mercedez");
        agenciaNoticias.getNoticias().add(noticiaF1_1);
        agenciaNoticias.getNoticias().add(noticiaF1_2);

        NoticiaMotociclismo noticiaMoto1 = new NoticiaMotociclismo(
                "Yamaha triunfa en MotoGP",
                "El equipo Yamaha arrasa en la última carrera del campeonato mundial de MotoGP.",
                "Yamaha");
        NoticiaMotociclismo noticiaMoto2 = new NoticiaMotociclismo(
                "Honda se lleva la mejor posición",
                "Honda domina la clasificación y asegura la mejor posición para la próxima carrera.",
                "Honda");
        agenciaNoticias.getNoticias().add(noticiaMoto1);
        agenciaNoticias.getNoticias().add(noticiaMoto2);

        // ------------------------------------------------------------------------------------------------------

    }

}
