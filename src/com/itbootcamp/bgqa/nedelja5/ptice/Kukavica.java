package com.itbootcamp.bgqa.nedelja5.ptice;

import java.util.ArrayList;

public class Kukavica extends Ptica implements KukavicijeJaje{
    public Kukavica(double minRaspon, double maxRaspon, double rasponKrila, String staniste, int maksJaja, int brojJaja, ArrayList<String> omiljenaHrana) {
        super(minRaspon, maxRaspon, rasponKrila, staniste, maksJaja, brojJaja, omiljenaHrana);
    }


    @Override
    public boolean poloziKukavicijeJaje(Ptica ptica, int brojKukavicijihJaja) {
        if ((ptica.getMaksJaja() - ptica.getBrojJaja()) < brojKukavicijihJaja) {
            ptica.setBrojJaja(ptica.getBrojJaja() + brojKukavicijihJaja); // polozila kukavicije jaje
            return true;
        }
        return false;
    }
}
