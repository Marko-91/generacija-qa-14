package com.itbootcamp.bgqa.nedelja1;

import java.util.Scanner;

public class BootCampCasovi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite dan u nedelji: ");
        String dan = scanner.nextLine();



        if (dan.equals("ponedeljak") || dan.equals("utorak") || dan.equals("cetvrtak") || dan.equals("petak")) {
            System.out.println("Imamo cas na Bootcamp-u");
        } else if (dan.equals("sreda") || dan.equals("subota") || dan.equals("nedelja")) {
            System.out.println("Nemamo cas na bootcamp-u");
        } else {
            System.out.println("Pogresan unos");
        }

        System.out.println("Kraj programa ***");

    }
}
