package com.itbootcamp.bgqa.nedelja2;

import java.util.Scanner;

public class BrojSlovaUReci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite rec: ");
        String rec = scanner.nextLine();
        System.out.println("Uneli ste " + rec);
        int brojKaraktera = 0;
        //Trazimo karakter O
        char trazeniKarakter = 'o';
        int index = 0;
        while(index < rec.length()) {
            char karakterUReci = rec.charAt(index);
            if (karakterUReci == trazeniKarakter) {
                brojKaraktera = brojKaraktera + 1;
            }
            index = index + 1;

        }

        System.out.println("Broj karaktera '" + trazeniKarakter + "' je: " + brojKaraktera);
    }
}
