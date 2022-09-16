package com.itbootcamp.bgqa.nedelja5.ptice;

import java.util.ArrayList;

public class Orao extends Ptica implements Predator{
    private int brojUlova;
    public Orao(double minRaspon, double maxRaspon, double rasponKrila, String staniste, int maksJaja, int brojJaja, ArrayList<String> omiljenaHrana, int brojUlova) {
        super(minRaspon, maxRaspon, rasponKrila, staniste, maksJaja, brojJaja, omiljenaHrana);
        this.brojUlova = brojUlova;
    }

    @Override
    public boolean lovi(Ptica ptica) {
        if (ptica.getRasponKrila() < 100) {
            setBrojUlova(this.brojUlova+1);
            return true;
        }

        return false;
    }

    @Override
    public int getLovina() {
        return this.brojUlova;
    }

    private void setBrojUlova(int brojUlova) {
        this.brojUlova = brojUlova;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", brojUlova=" + brojUlova +
                '}';
    }
}
