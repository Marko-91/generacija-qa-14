package com.itbootcamp.bgqa.nedelja5.biologija;

public class Covek extends ZivoBice implements Pokret, Hrana {

    private String jezik;
    private String ime;
    public Covek(String staniste, int brojNogu, String jezik, String ime) {
        super(staniste, brojNogu);
        this.jezik = jezik;
        this.ime = ime;
    }

    public static void main(String[] args) {
        Covek cova = new Covek("stalno", 2, "srpski", "jovan");
        System.out.println(cova.getStaniste());
        cova.kreciSe(cova.getBrojNogu());
        cova.hraniSe();
    }

    @Override
    public void kreciSe(int brojNogu) {
        System.out.println("Covek se krece sa " + brojNogu + "noge");
    }

    @Override
    public void hraniSe() {
        System.out.println("Covek se hrani");
    }
}
