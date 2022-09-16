package com.itbootcamp.bgqa.nedelja5.poliklinika;

import java.util.ArrayList;
import java.util.Collections;

public class Poliklinika {
    private ArrayList<Lekar> lekari;

    public Poliklinika(ArrayList<Lekar> lekari) {
        this.lekari = lekari;
    }

    public int pulmologSaNajmanjomPlatom() {

        double minPlata = Double.MAX_VALUE;
        int idNajmanjeg = -1;
        for (Lekar lekar : lekari) {
            if (lekar instanceof Pulmolog && lekar.plata() < minPlata) { // filtriramo samo pulmologe
                minPlata = lekar.plata();
                idNajmanjeg = lekar.getId();
            }
        }

        return idNajmanjeg;
    }

    public int pedijatarSaNajstarijimPacijentima() {

        double maksProsekGodina = Double.MIN_VALUE;
        int idNajveceg = -1;
        for (Lekar lekar : lekari) {
            if (lekar instanceof Pedijatar) {
                double sumaGodinaPacijenata = 0;
                for (Pacijent pacijent : lekar.getPacijenti()) { // za svakog pacijenta
                    sumaGodinaPacijenata = sumaGodinaPacijenata + pacijent.getBrojGodina(); //racunamo sumu godina
                }
                double prosekGodina = sumaGodinaPacijenata / lekar.getPacijenti().size(); // dobijamo prosek godina

                if (prosekGodina > maksProsekGodina) {
                    maksProsekGodina = prosekGodina;
                    idNajveceg = lekar.getId(); //izvlacimo id lekara sa najvecim prosekom godina pacijenata
                }
            }
        }

        return idNajveceg;
    }

    public void sortLekariPoBrojuPacijenata() {
        Collections.sort(this.lekari);
    }

    public static void main(String[] args) {
        ArrayList<Pacijent> pacijenti = new ArrayList<>();
        pacijenti.add(new Pacijent("Pacijent1", "P1", 30));
        pacijenti.add(new Pacijent("Pacijent2", "P1", 40));
        pacijenti.add(new Pacijent("Pacijent3", "P1", 50));

        Pulmolog p = new Pulmolog(1, "Pul", "Molog", pacijenti, 50);
        System.out.println(p.plata());
        System.out.println(p.prihvati(new Pacijent("Pacijent4", "P1", 20)));

        Pulmolog p1 = new Pulmolog(1, "Marko", "Molog", pacijenti, 30);
        Pulmolog p2 = new Pulmolog(2, "Zarko", "Molog", pacijenti, 10);
        Pulmolog p3 = new Pulmolog(3, "Darko", "Molog", pacijenti, 50);
        ArrayList<Pacijent> deca1 = new ArrayList<>();
        deca1.add(new Pacijent("Pacijent1", "P1", 10));
        deca1.add(new Pacijent("Pacijent1", "P1", 5));
        deca1.add(new Pacijent("Pacijent1", "P1", 3));

        ArrayList<Pacijent> deca2 = new ArrayList<>();
        deca2.add(new Pacijent("Pacijent1", "P1", 3));
        deca2.add(new Pacijent("Pacijent1", "P1", 2));
        deca2.add(new Pacijent("Pacijent1", "P1", 1));

        ArrayList<Pacijent> deca3 = new ArrayList<>();
        deca3.add(new Pacijent("Pacijent1", "P1", 13));
        deca3.add(new Pacijent("Pacijent1", "P1", 14));
        deca3.add(new Pacijent("Pacijent1", "P1", 15));
        Pedijatar pp1 = new Pedijatar(1, "Marko", "Molog", deca1, 30);
        Pedijatar pp2 = new Pedijatar(2, "Marko", "Molog", deca2, 30);
        Pedijatar pp3 = new Pedijatar(3, "Marko", "Molog", deca3, 30);

        ArrayList<Lekar> lekari = new ArrayList<>();
        lekari.add(p1);
        lekari.add(p2);
        lekari.add(p3);
        lekari.add(pp1);
        lekari.add(pp2);
        lekari.add(pp3);

        Poliklinika poliklinika = new Poliklinika(lekari);
        System.out.println(poliklinika.pulmologSaNajmanjomPlatom());
        System.out.println(poliklinika.pedijatarSaNajstarijimPacijentima());
        System.out.println(poliklinika.lekari);
        poliklinika.sortLekariPoBrojuPacijenata();
        System.out.println(poliklinika.lekari);
    }
}
