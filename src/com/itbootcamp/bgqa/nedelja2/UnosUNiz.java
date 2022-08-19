package com.itbootcamp.bgqa.nedelja2;

import java.util.Scanner;

public class UnosUNiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mojNiz = new int[5];
        String unos;
        int j = 0;
        while (true) {
            System.out.print("Unesite broj: ");
            mojNiz[j] = scanner.nextInt();
            j++;

            if (j == mojNiz.length) { // ukoliko sam dosao do kraja niza
                System.out.print("Unesite 'kraj' za izlaz, ili bilo sta za nastavak: ");
                unos = scanner.next(); //uzmi unos korisnika
                if (unos.equalsIgnoreCase("kraj") ) { //proveri da li je kraj
                    break;
                } else {
                    int[] noviNiz = new int[mojNiz.length * 2]; // 000000000
                    for (int i = 0; i < mojNiz.length; i++) { // pravimo kopiju starog niza
                        noviNiz[i] = mojNiz[i];
                    }
                    mojNiz = noviNiz; //moj niz postaje novi niz
                }

            }
        }

        for (int i = 0; i < mojNiz.length; i++) { // ispis
            if (i == mojNiz.length - 1) {
                System.out.print(mojNiz[i]);
            } else {
                System.out.print(mojNiz[i] + ", ");
            }
        }
    }
}
