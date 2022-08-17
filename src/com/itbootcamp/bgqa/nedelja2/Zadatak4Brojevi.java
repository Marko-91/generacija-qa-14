package com.itbootcamp.bgqa.nedelja2;

import java.util.Scanner;

public class Zadatak4Brojevi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int proizvod = 1;

        for (;true;) {
            System.out.print("Unesite broj ili 0 za kraj programa: ");
            int broj = scanner.nextInt();

            if (broj == 0) {
                break;
            }

            if (broj == 1) {
                continue;
            }

            proizvod *= broj;
        }
        System.out.println("Proizvod = " + proizvod);
    }
}
