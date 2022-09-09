package com.itbootcamp.bgqa.nedelja4.nasledjivanje;

public abstract class Radnik {
    private String ime;
    private String prezime;
    private int jmbg;
    private double mesecnaPlata;
    private double bonusZadada;
    private int brojDanaGodisnjegOdmora;


    public Radnik(String ime, String prezime, int jmbg, double mesecnaPlata, double bonusZadada, int brojDanaGodisnjegOdmora) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.mesecnaPlata = mesecnaPlata;
        this.bonusZadada = bonusZadada;
        this.brojDanaGodisnjegOdmora = brojDanaGodisnjegOdmora;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getJmbg() {
        return jmbg;
    }

    public double getMesecnaPlata() {
        return mesecnaPlata;
    }

    public double getBonusZadada() {
        return bonusZadada;
    }

    public int getBrojDanaGodisnjegOdmora() {
        return brojDanaGodisnjegOdmora;
    }

    public void setMesecnaPlata(double mesecnaPlata) {
        this.mesecnaPlata = mesecnaPlata;
    }

    public void setBonusZadada(double bonusZadada) {
        this.bonusZadada = bonusZadada;
    }

    public void setBrojDanaGodisnjegOdmora(int brojDanaGodisnjegOdmora) {
        this.brojDanaGodisnjegOdmora = brojDanaGodisnjegOdmora;
    }

    public abstract double dodajBonus();

    public abstract void zdravo();

    public String ispis() {
        return String.format("Ime: %s, Prezime: %s, JMBG: %d, Plata: %.2f", ime, prezime, jmbg, mesecnaPlata);
    }

    @Override
    public String toString() {
        return "Ime: " + this.ime + " Prezime: " +
                this.prezime + " JMBG: " + this.jmbg + " Plata: " + this.mesecnaPlata;
    }
}
