package com.itbootcamp.bgqa.nedelja4;

public class Polaznik {
    int jmbg;
    int godine;
    String ime;
    String prezime;

    Polaznik(int noviJmbg, int godine, String ime, String prezime) {
        jmbg = noviJmbg;
        this.godine = godine;
        this.ime = ime;
        this.prezime = prezime;
    }

    public static void main(String[] args) {
        Polaznik dusan = new Polaznik(999191919, 30, "Dusan", "Stevanovic");
        System.out.println(dusan.jmbg);
        System.out.println(dusan.godine);
        System.out.println(dusan.ime);
        System.out.println(dusan.prezime); // polje
        System.out.println(dusan.jePunoletan()); // poziv metode

        Polaznik milos = new Polaznik(191293, 29, "Milos", "Obradovic");
        System.out.println(milos.jmbg);
        System.out.println(milos.godine);
        System.out.println(milos.ime);
        System.out.println(milos.prezime); // polje
        System.out.println(milos.jePunoletan()); // poziv metode
        Polaznik obrad = new Polaznik(191293, 18, "Obrad", "Obradovic");

        Polaznik[] polaznici = new Polaznik[3];
        polaznici[0] = dusan;
        polaznici[1] = milos;
        polaznici[2] = obrad;

        System.out.println("prosek godina je: " + Polaznik.prosekGodina(polaznici));
        System.out.println(Math.abs(2));
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

}
