package com.itbootcamp.bgqa.nedelja5.knjige;

import java.util.ArrayList;

public class Knjizara {

    private ArrayList<Knjiga> knjige;

    public Knjizara(ArrayList<Knjiga> knjige) {
        this.knjige = knjige;
    }

    public ArrayList<Knjiga> autoroveKnige(String autor) {
        ArrayList<Knjiga> autoroveKnjige = new ArrayList<>();

        for (Knjiga knjigaUListi : this.knjige) {
            if (knjigaUListi.getAutor().equals(autor)) {
                autoroveKnjige.add(knjigaUListi);
            }
        }
        return autoroveKnjige;
    }

    public ArrayList<Knjiga> bestSeller() {
        ArrayList<Knjiga> listaBestSellera = new ArrayList<>();

        for (Knjiga knjigaUListi : this.knjige) {
            if (knjigaUListi.getBrojProdatihKopija() >= 1000) {
                listaBestSellera.add(knjigaUListi);
            }
        }

        return listaBestSellera;
    }
}
