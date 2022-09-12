package com.itbootcamp.bgqa.nedelja5;

public class Macka extends Zivotnja {

    private String omiljenaHrana;

    public Macka(String ime, String rasa, String omiljenaHrana) {
        super(ime, rasa);
        this.omiljenaHrana = omiljenaHrana;
    }

    @Override
    public void javiSe() {
        System.out.println("mjau mjau...");
    }

    @Override
    public String toString() {
        return super.toString() + " omiljenaHrana " + omiljenaHrana;
    }

    @Override
    public boolean equals(Object object) {
        Macka macaKojaSePoredi = (Macka) object;

        return this.getIme().equals(macaKojaSePoredi.getIme())
                && this.getRasa().equals(macaKojaSePoredi.getRasa())
                && this.omiljenaHrana.equals(macaKojaSePoredi.omiljenaHrana);
    }
}
