package com.itbootcamp.bgqa.nedelja2;

import java.util.Scanner;

public class Zadatak1While {
    public static void main(String[] args) {
        //pomocu while petlji ispisi brojeve od 1 do 10
        //ispisi samo one brojeve koji su parni
        int brojac = 0;
        int suma = 0;
        Scanner scaner = new Scanner(System.in);
        System.out.print("Unesite granicnu vrednost: ");
        int granicnaVrednost = scaner.nextInt();

        while (brojac <= granicnaVrednost) {
            System.out.println("Brojac je sada: " + brojac);
            suma += brojac;
            System.out.println("Suma je sada: " + suma);
            brojac = brojac + 2;

//            if (brojac % 2 == 0) {
//                System.out.println(brojac);
//            }
//            brojac++;

        }

        System.out.println("nastavak programa , suma je: " + suma);
    }

}
