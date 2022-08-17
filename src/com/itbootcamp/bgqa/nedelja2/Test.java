package com.itbootcamp.bgqa.nedelja2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int brojPonavljanja = 0;
        String trazenaRec = "cool";
        for (int i = 0; true; i++) {
            System.out.println("Unesite string koji sadrzi bar jednom 'cool': ");
            String text = s.nextLine().toLowerCase();
            if (text.contains(trazenaRec)) {
                brojPonavljanja++;
            } else if (text.contains("cao")) {
                System.out.println("Program je prekinut!");
                break;
            }
        }
        System.out.println("Broj ponavljanja reci 'cool' je: " + brojPonavljanja);
    }
}
