package com.itbootcamp.bgqa.nedelja5.ptice;

import com.itbootcamp.bgqa.nedelja3.Dan2Metode;

import java.util.ArrayList;

public class Ptica implements Comparable<Ptica> {
    private double minRaspon, maxRaspon;
    private double rasponKrila;
    private String staniste;
    private int maksJaja;
    private int brojJaja;
    private ArrayList<String> omiljenaHrana;


    public Ptica(double minRaspon, double maxRaspon, double rasponKrila, String staniste, int maksJaja, int brojJaja, ArrayList<String> omiljenaHrana) {
        this.minRaspon = minRaspon;
        this.maxRaspon = maxRaspon;
        this.rasponKrila = generateRasponKrila(); //pozivamo private metod u konstrutoru
        this.staniste = staniste;
        this.maksJaja = maksJaja;
        this.brojJaja = brojJaja;
        this.omiljenaHrana = omiljenaHrana;
    }

    public double getMinRaspon() {
        return minRaspon;
    }

    public double getMaxRaspon() {
        return maxRaspon;
    }

    public double getRasponKrila() {
        return rasponKrila;
    }

    public String getStaniste() {
        return staniste;
    }

    public int getMaksJaja() {
        return maksJaja;
    }

    public int getBrojJaja() {
        return brojJaja;
    }

    public ArrayList<String> getOmiljenaHrana() {
        return omiljenaHrana;
    }

    public void setBrojJaja(int brojJaja) {
        this.brojJaja = brojJaja;
    }

    private double generateRasponKrila() {
        return Dan2Metode.random(minRaspon, maxRaspon);
    }

    public boolean polaganjeJaja(int brojJajaKojaSePolazu) {
        if (brojJajaKojaSePolazu < (this.maksJaja - this.brojJaja)) { // ukoliko ima mesta u gnezdu
            setBrojJaja(brojJajaKojaSePolazu + this.brojJaja); // ptica je polegla jaja
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Ptica{" +
                "minRaspon=" + minRaspon +
                ", maxRaspon=" + maxRaspon +
                ", rasponKrila=" + rasponKrila +
                ", staniste='" + staniste + '\'' +
                ", maksJaja=" + maksJaja +
                ", brojJaja=" + brojJaja +
                ", omiljenaHrana=" + omiljenaHrana +
                '}';
    }

    @Override
    public int compareTo(Ptica drugaPtica) {
        return Double.compare(this.rasponKrila, drugaPtica.getRasponKrila());
    }
}
