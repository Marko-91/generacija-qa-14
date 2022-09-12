package com.itbootcamp.bgqa.nedelja5;

import java.util.ArrayList;

public class Park {

    private ArrayList<Zivotnja> zivotnje;
    private double povrsina;

    public Park(ArrayList<Zivotnja> zivotnje, double povrsina) {
        this.zivotnje = zivotnje;
        this.povrsina = povrsina;
    }

    public static void main(String[] args) {
        ArrayList<Zivotnja> listaZivotinja = new ArrayList<>();
        double povrsinaParka = 100;

        Macka macka = new Macka("Flekica", "maca", "viskas");
        System.out.println(macka instanceof Macka);
        System.out.println(macka instanceof Zivotnja);
        Zivotnja macka2 = new Macka("Pega", "maca", "granukle");
        Zivotnja pas = new Pas("dzeki", "dog", "crna");
        System.out.println(macka2 instanceof Macka);
        System.out.println(macka2 instanceof Zivotnja);

        listaZivotinja.add(macka);
        listaZivotinja.add(macka2);
        listaZivotinja.add(pas);
        for (Zivotnja ljubimac : listaZivotinja) {
            System.out.println(ljubimac);
        }
    }
}
