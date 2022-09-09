package com.itbootcamp.bgqa.nedelja4.prodavnica;

import java.util.ArrayList;

public class Kasa {
    private String id;
    private ArrayList<Roba> roba;


    public Kasa(String id, ArrayList<Roba> roba) {
        this.id = id;
        this.roba = roba;
    }

    public String kreirajRacun() {
        String robaOut = null;
        for (Roba r : roba) {
            robaOut += r.toString();
            robaOut += "\n";
        }
        return roba.toString();
    }
}
