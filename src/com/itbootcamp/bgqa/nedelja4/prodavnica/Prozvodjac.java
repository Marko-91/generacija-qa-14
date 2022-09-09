package com.itbootcamp.bgqa.nedelja4.prodavnica;

public class Prozvodjac {
    private String naziv;
    private String lokacija;

    public Prozvodjac() {};
    public Prozvodjac(String naziv, String lokacija) {
        this.naziv = naziv;
        this.lokacija = lokacija;
    }


    @Override
    public String toString() {
        return "Prozvodjac{" +
                "naziv='" + naziv + '\'' +
                ", lokacija='" + lokacija + '\'' +
                '}';
    }
}
