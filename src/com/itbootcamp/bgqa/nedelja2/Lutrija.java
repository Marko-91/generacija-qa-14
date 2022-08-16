package com.itbootcamp.bgqa.nedelja2;

import java.util.Scanner;

public class Lutrija {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            int nasumicniBroj = (int) (Math.random() * 10) + 1;

            System.out.print("Unesite ceo broj izmedju 1 i 10: ");
            int korisnikovBroj = scanner.nextInt();

            if (nasumicniBroj == korisnikovBroj) {
                System.out.println("Pogodili ste broj " + nasumicniBroj);
            } else {
                System.out.println("Niste pogodili ste broj " + nasumicniBroj);
            }

            System.out.print("Za zavrsetak igre unesite 'kraj', za nastavak unesite bilo sta: ");
            input = scanner.next();

            if (input.equals("kraj")) {
                System.out.println("Kraj igre");
            } else {
                System.out.println("nastavljamo igru");
            }
        } while (!input.equals("kraj"));
    }
}
