package com.itbootcamp.bgqa.nedelja5.knjige;

import java.util.ArrayList;
import java.util.Collections;

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
        ArrayList<Knjiga> autorove = knjizara.autoroveKnige("Bob Dilan");
        //System.out.println(autorove);
        ArrayList<Knjiga> bestSeller = knjizara.bestSeller();
        //System.out.println(bestSeller);
        //System.out.println(listaKnjiga);
        ArrayList<Integer> listaInt = new ArrayList<>();
        listaInt.add(400);
        listaInt.add(10000);
        listaInt.add(3);
        System.out.println(listaInt);

        Collections.sort(listaInt);
        System.out.println(listaInt);
    }
}
