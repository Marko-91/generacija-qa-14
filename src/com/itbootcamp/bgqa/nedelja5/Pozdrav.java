package com.itbootcamp.bgqa.nedelja5;

public class Pozdrav {
    public static final String pozdrav = "Zdravo"; // samo 1 se kreira za celo trajanje programa
    public static final double pi = 3.14;
    public String pozdrav2;

    public static int racunajDuzinuStringa(String s) {
        return s.length();
    }

    static {
        System.out.println("Desava se pri pokretanju 'main' metode");
    }

    public Pozdrav(String pozdrav2) {
        this.pozdrav2 = pozdrav2;
    }

    public static void main(String[] args) {
        Pozdrav cao = new Pozdrav("cao");
        System.out.println(cao.getPozdrav2());
        Pozdrav poz1 = new Pozdrav("cao1");
        Pozdrav poz2 = new Pozdrav("cao2");
        Pozdrav poz3 = new Pozdrav("cao3");
        Pozdrav poz4 = new Pozdrav("cao4");
        int duzina = Pozdrav.racunajDuzinuStringa(Pozdrav.pozdrav);
        System.out.println(duzina);


    }

    public String getPozdrav2() {
        return pozdrav2;
    }
}
