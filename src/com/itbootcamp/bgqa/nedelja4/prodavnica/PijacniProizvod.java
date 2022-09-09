package com.itbootcamp.bgqa.nedelja4.prodavnica;

public class PijacniProizvod extends Roba {

    private double tezina; //tezina u gramima
    private boolean uvoz;

    public PijacniProizvod(int barKod, double cena, String naziv, int popust, Prozvodjac prozvodjac, double tezina, boolean uvoz) {
        super(barKod, cena, naziv, popust, prozvodjac);
        this.tezina = tezina;
        this.uvoz = uvoz;
    }

    @Override
    public void obracunajCenu() {
        setCena(getCena() * tezina / Roba.faktorTezine);
    }

    public static void main(String[] args) {
        PijacniProizvod banane =
                new PijacniProizvod(123, 1000, "banane", 0, new Prozvodjac(), 100.00, false);
        banane.obracunajCenu();
        assert banane.getCena() == 100.00;
        System.out.println("Testovi prosli");
    }
}
