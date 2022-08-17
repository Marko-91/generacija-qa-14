package com.itbootcamp.bgqa.nedelja2;

import java.util.Scanner;

public class Zadatak3Cool {
    /*
    zadatak 3: napravatie beskonacnu petlju koja ispisuje String
    koji korisnik unese, pa onda proverava da taj string sadrzi rec 'cool'.
    ukoliko korisnik unese rec 'cao' izlazimo iz petlje.
    program broji koliko ima stringova koji sadrze cool

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int brojPonavljanjaReci = 0;
        System.out.println("Brojimo ponavljanje 'cool'");
        for (;true;) {
            System.out.print("Unesite rec ili 'cao' za izlaz: ");
            String rec = scanner.next();

            if (rec.contains("cool")) {
                brojPonavljanjaReci++;
            }

            if (rec.contains("cao")) {
                System.out.println("Izlazimo iz petlje");
                break;
            }
        }
        System.out.println("Broj ponavljanja 'cool' " + brojPonavljanjaReci);
    }
}
