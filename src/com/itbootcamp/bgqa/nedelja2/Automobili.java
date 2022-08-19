package com.itbootcamp.bgqa.nedelja2;

import java.util.Scanner;

public class Automobili {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String[] nizAuto = new String[5];
        String[] nizAuto = {"BMW", "AUDI"};
        boolean imaVozila = false;

//        for (int i = 0; i < nizAuto.length; i++) {
//            System.out.print("Unesite marku automobila: ");
//            nizAuto[i] = scanner.next();
//        }

        System.out.print("Unesite marku koju zelite da proverite da li se nalazi u nizu: ");
        String marka = scanner.next();

        for (int i = 0; i < nizAuto.length; i++) {
            if (marka.equalsIgnoreCase(nizAuto[i])) {
                System.out.println("Marka " + marka + " je dostupna u prodavnici.");
                imaVozila = true;
                break;
            }

        }

        if (!imaVozila) {
            System.out.println("Marka " + marka + " nije dostupna u prodavnici.");
        }
    }
}
