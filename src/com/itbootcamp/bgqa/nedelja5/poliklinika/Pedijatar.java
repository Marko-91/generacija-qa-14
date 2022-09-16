package com.itbootcamp.bgqa.nedelja5.poliklinika;

import java.util.ArrayList;

public class Pedijatar extends Lekar {
    public Pedijatar(int id, String ime, String prezime, ArrayList<Pacijent> pacijenti, int brojPacijenata) {
        super(id, ime, prezime, pacijenti, brojPacijenata);
    }

    @Override
    public boolean prihvati(Pacijent pacijent) {
        if (pacijent.getBrojGodina() < 18 && getBrojPacijenata() < 200) {
            setBrojPacijenata(getBrojPacijenata() + 1); // povecavamo broj pacijenata za 1
            getPacijenti().add(pacijent); // dodamo pacijenta na lisu
            return true;
        }
        return false;
    }

    @Override
    public double plata() {
        int brojMladih = 0;

        for (Pacijent pacijent : pacijenti) {
            if (pacijent.getBrojGodina() < 5) {
                brojMladih++;
            }
        }

        return getBrojPacijenata() * 300 + (brojMladih * 100);
    }
}
