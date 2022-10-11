package com.itbootcamp.bgqa.nedelja7.bonus.datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapeVezba {
    public static void main(String [] arg) {

        Map<Integer, String> mapa = new HashMap<>();

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Jelena");
        lista.add("Zorana");
        lista.add("Milica");

        lista.get(0);

        mapa.put(1223, "Zoran"); // .put smesti jedan par <Kljuc, Vrednost> u mapu
        mapa.put(3221, "Jelena");
        mapa.put(4001, "Milena");
        mapa.put(7801, "Stefan");
        mapa.put(1091, "Nikola");

        // Neke od metoda u mapama:

        mapa.get(4001); // metod koji za prosledjen kljuc vraca vrednost

        mapa.containsKey(1223); // boolean metod koji vraca true ukoliko se prosledjeni kljuc nalazi u mapi

        mapa.containsValue("Nikola"); // boolean metod koji vraca true cim naidje na zadatu vrednost u mapi

        mapa.size(); // metod koji vraca velicinu mapa, odnosno broj <Kljuc, Vrednost> elemenata

        mapa.isEmpty(); //boolean metod koji vraca true ako je mapa prazna

        mapa.clear(); // metod koji brise sve elemente iz mape

    }
}
