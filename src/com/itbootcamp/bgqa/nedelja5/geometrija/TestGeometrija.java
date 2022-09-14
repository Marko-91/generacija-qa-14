package com.itbootcamp.bgqa.nedelja5.geometrija;

import java.util.ArrayList;

public class TestGeometrija {
    public static void main(String[] args) {
        PravougliTrougao trougao = new PravougliTrougao(3, 4, 5);
        Kvadrat kvadrat = new Kvadrat(5);
        Pravougaonik pravougaonik = new Pravougaonik(2, 3);

        ArrayList<Povrsina> listaTelaSaPovrsinom = new ArrayList<>();
        listaTelaSaPovrsinom.add(trougao);
        listaTelaSaPovrsinom.add(kvadrat);
        listaTelaSaPovrsinom.add(pravougaonik);

        for (Povrsina telo : listaTelaSaPovrsinom) {
            System.out.println(telo.getClass().getSimpleName() + " " + telo.racunajPovrsinu());
        }

        //System.out.println(trougao.racunajObim());
        //System.out.println(trougao.racunajPovrsinu());


    }
}
