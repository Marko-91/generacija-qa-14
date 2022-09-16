package com.itbootcamp.bgqa.nedelja5.poliklinika;

public class Pacijent {
    private String ime;
    private String prezime;
    private int brojGodina;

    public Pacijent(String ime, String prezime, int brojGodina) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getBrojGodina() {
        return brojGodina;
    }

    public void setBrojGodina(int brojGodina) {
        this.brojGodina = brojGodina;
    }

    @Override
    public String toString() {
        return "Pacijent{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", brojGodina=" + brojGodina +
                '}';
    }
}
