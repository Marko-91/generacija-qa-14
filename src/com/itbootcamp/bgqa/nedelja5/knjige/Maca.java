package com.itbootcamp.bgqa.nedelja5.knjige;

import com.itbootcamp.bgqa.nedelja5.zivotinje.Zivotnja;

public class Maca extends Zivotnja {

    public Maca(String ime, String rasa, int brojNogu) {
        super(ime, rasa, brojNogu);
    }

    public static void main(String[] args) {
        Maca flekica = new Maca("flkeica", "maca", 4);
        int brojNogu = flekica.brojNogu;
//        flekica.ime;
//        flekica.brojCipa;
        flekica.igrajSeUBiblioteci();

        System.out.println(brojNogu);
    }
}
