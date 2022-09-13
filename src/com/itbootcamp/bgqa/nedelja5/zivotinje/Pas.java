package com.itbootcamp.bgqa.nedelja5.zivotinje;

public class Pas extends Zivotnja{

    private String boja;

    public Pas(String ime, String rasa, String boja) {
        super(ime, rasa);
        this.boja = boja;
    }

    @Override
    public void javiSe() {
        System.out.println("av av av...");
    }

    @Override
    public String toString() {
        return super.toString() + " boja: " + boja;
    }
}
