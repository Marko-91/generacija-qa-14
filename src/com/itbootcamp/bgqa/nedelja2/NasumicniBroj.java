package com.itbootcamp.bgqa.nedelja2;

import java.util.Scanner;

public class NasumicniBroj {
    public static void main(String[] args) {
        int nasumicniBroj = (int) (Math.random() * 10) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite ceo broj izmedju 1 i 10: ");
        int korisnikovBroj = scanner.nextInt();
        if (korisnikovBroj < 1 || korisnikovBroj > 10) {
            System.out.println("Broj mora biti izmedju 1 i 10");
            System.exit(-5);
        }

        if (nasumicniBroj == korisnikovBroj) {
            System.out.println("Pogodili ste broj " + nasumicniBroj);
        } else {
            System.out.println("Niste pogodili ste broj " + nasumicniBroj);
        }
    }
}
