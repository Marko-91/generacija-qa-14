package com.itbootcamp.bgqa.nedelja4.prodavnica;

public class MlecniProizvod extends Roba {
    private String tipPakovanja;

    public MlecniProizvod(int barKod, double cena, String naziv, int popust, Prozvodjac prozvodjac, String tipPakovanja) {
        super(barKod, cena, naziv, popust, prozvodjac);
        this.tipPakovanja = tipPakovanja;
    }

    @Override
    public void obracunajCenu() {

        if (tipPakovanja.equalsIgnoreCase("tetrapak")) {
            setCena(getCena() + getCena() * 0.1); // 10% na cenu
        } else if (tipPakovanja.equalsIgnoreCase("plastika")) {
            setCena(getCena() + getCena() * 0.05); // 5% na cenu
        } else {
            setCena(getCena() + getCena() * 0.01); // 1% na cenu
        }

    }

    public static void main(String[] args) {
        Roba milk =
                new MlecniProizvod(123, 1000, "banane", 0, new Prozvodjac(), "tetrapak");
        milk.obracunajCenu();
        assert milk.getCena() == 100.00;
        System.out.println("Testovi prosli");
    }

    @Override
    public String toString() {
        return super.toString() +
                "tip pakovanja=" + tipPakovanja +'\n';
    }
}
