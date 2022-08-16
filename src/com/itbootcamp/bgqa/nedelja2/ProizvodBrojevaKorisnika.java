package com.itbootcamp.bgqa.nedelja2;

import java.util.Scanner;

public class ProizvodBrojevaKorisnika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        double korisnikovBroj;
        int suma = 0;

        do {
            System.out.print("Unesite broj: ");
            korisnikovBroj = scanner.nextDouble();
            suma += korisnikovBroj;

            System.out.print("Za zavrsetak unesite 'kraj', za nastavak unesite bilo sta: ");
            input = scanner.next();
            if (input.equals("kraj")) {
                System.out.println("Kraj igre");
            } else {
                System.out.println("nastavljamo igru");
            }
        } while (!input.equals("kraj"));

        System.out.println("Suma je " + suma);
    }
}
