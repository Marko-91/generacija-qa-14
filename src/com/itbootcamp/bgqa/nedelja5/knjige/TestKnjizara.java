package com.itbootcamp.bgqa.nedelja5.knjige;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestKnjizara {
    public static void main(String[] args) {
        ArrayList<Knjiga> listaKnjiga = new ArrayList<>();
        listaKnjiga.add(
                new Romantika("Hari poter", "Fantastika",
                        1991, "JK Rowlong", 10000));
        listaKnjiga.add(
                new HorrorKnjiga("Python 3", "IT",
                        2001, "Bob Dilan", 400));

        listaKnjiga.add(
                new HorrorKnjiga("Python 4", "IT",
                        2001, "Bob Dilan", 400));

        Triler triler = new Triler("Saw", "triller",
                2003, "Neppo", 100);

        listaKnjiga.add(triler);
        Knjizara knjizara = new Knjizara(listaKnjiga);
        System.out.println("Pre sortiranja: ");
        System.out.println(listaKnjiga);
        Collections.sort(listaKnjiga);
        System.out.println("Posle sortiranja: ");
        System.out.println(listaKnjiga);
    }
}
