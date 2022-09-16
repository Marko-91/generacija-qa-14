package com.itbootcamp.bgqa.nedelja5.poliklinika;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Lekar implements Comparable<Lekar> {

    private int id;
    private String ime;
    private String prezime;
    ArrayList<Pacijent> pacijenti;
    private int brojPacijenata;


    public Lekar(int id, String ime, String prezime, ArrayList<Pacijent> pacijenti, int brojPacijenata) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.pacijenti = pacijenti;
        this.brojPacijenata = brojPacijenata;
    }


    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public ArrayList<Pacijent> getPacijenti() {
        return pacijenti;
    }

    public int getBrojPacijenata() {
        return brojPacijenata;
    }

    public void setPacijenti(ArrayList<Pacijent> pacijenti) {
        this.pacijenti = pacijenti;
    }

    public void setBrojPacijenata(int brojPacijenata) {
        this.brojPacijenata = brojPacijenata;
    }

    public abstract boolean prihvati(Pacijent pacijent);

    public abstract double plata();


    @Override
    public String toString() {
        return "Lekar{" +
                "id=" + id +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", pacijenti=" + pacijenti +
                ", brojPacijenata=" + brojPacijenata +
                '}';
    }

    @Override
    public int compareTo(Lekar lekarSaKojimSePoredi) {
        return Double.compare(lekarSaKojimSePoredi.brojPacijenata, this.brojPacijenata);
    }

    public static void main(String[] args) {
        ArrayList<Lekar> lekari = new ArrayList<>();
        Collections.sort(lekari);
    }
}
