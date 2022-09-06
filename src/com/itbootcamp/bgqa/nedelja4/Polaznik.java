package com.itbootcamp.bgqa.nedelja4;

public class Polaznik {
    private int jmbg;
    private int godine; // default access
    private String ime;
    private String prezime;

    public Polaznik(int noviJmbg, int godine, String ime, String prezime) {
        jmbg = noviJmbg;
        this.godine = godine;
        this.ime = ime;
        this.prezime = prezime;
    }

    //setter za godine
    public void setGodine() {
        godine = godine + 1;
    }

    //setter za prezime
    public void setPrezime(String novoPrezime) {
        prezime = novoPrezime;
    }

    boolean jePunoletan() {
        return godine >= 18;
    }

    static double prosekGodina(Polaznik[] listaPolaznika) {
        double prosekGodina = 0;

        for (int i = 0; i < listaPolaznika.length; i++) {
            prosekGodina = prosekGodina + listaPolaznika[i].godine;
        }

        return prosekGodina / listaPolaznika.length;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodine() {
        return godine;
    }

    public int getJmbg() {
        return jmbg;
    }

    public static void main(String[] args) {
        Polaznik petar = new Polaznik(2222222, 30, "Petar", "Petrovic");
        int jmg = petar.jmbg;
    }
}
