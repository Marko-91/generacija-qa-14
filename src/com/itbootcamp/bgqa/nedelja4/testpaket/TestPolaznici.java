package com.itbootcamp.bgqa.nedelja4.testpaket;
import com.itbootcamp.bgqa.nedelja4.Polaznik;

public class TestPolaznici {
    public static void main(String[] args) {
        Polaznik petar = new Polaznik(2222222, 30, "Petar", "Petrovic");
        System.out.println(petar.getIme());
        System.out.println(petar.getPrezime());
        System.out.println(petar.getGodine());
        System.out.println(petar.getJmbg());
        //petar.ime = "Novo ime";
        petar.setGodine();
        petar.setPrezime("Mitrovic");
        System.out.println(petar.getGodine());
        System.out.println(petar.getPrezime());
    }
}
