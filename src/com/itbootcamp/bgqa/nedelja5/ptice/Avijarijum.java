package com.itbootcamp.bgqa.nedelja5.ptice;

import java.util.ArrayList;
import java.util.Collections;

public class Avijarijum {
    private ArrayList<Ptica> ptice;

    public Predator najuspesnijiLovac() {
        ArrayList<Predator> predatori = new ArrayList<>();

        //nadji pretatore
        for (Ptica ptica : ptice) {
            if (ptica instanceof Predator) {
                predatori.add((Predator) ptica);
            }
        }

        //nadji najuspesniheg
        int max = Integer.MIN_VALUE;
        Predator najuspesnijiPredator = null;
        for (Predator predator : predatori) {
            if (predator.getLovina() > max) {
                max = predator.getLovina();
                najuspesnijiPredator = predator;
            }
        }

        return najuspesnijiPredator;
    }

    public Ptica najviseJaja() {
        //petlja koja prolazi kroz ptice i trazi onu sa najvise jaja
        int max = Integer.MIN_VALUE;
        Ptica pticaSaNajviseJaja = null;
        for (Ptica ptica : ptice) {
            if (ptica.getBrojJaja() > max) {
                max = ptica.getBrojJaja();
                pticaSaNajviseJaja = ptica;
            }
        }
        return pticaSaNajviseJaja;
    }

    public void sortPtice() {
        Collections.sort(ptice);
    }
}
