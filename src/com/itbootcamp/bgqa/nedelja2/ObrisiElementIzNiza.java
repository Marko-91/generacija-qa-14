package com.itbootcamp.bgqa.nedelja2;

import java.util.Arrays;
import java.util.Scanner;

public class ObrisiElementIzNiza {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] niz1 = {1, 2, 3, 4, 5};
        int[] niz2 = new int[niz1.length - 1];
        System.out.print("Unesite index: ");
        int index = 1;
        for (int i = 0, brojacDrugogNiza = 0; i < niz2.length; i++, brojacDrugogNiza++) {
            if (i == index) {
                brojacDrugogNiza = i + 1;
            }

            niz2[i] = niz1[brojacDrugogNiza];
        }

        System.out.println(Arrays.toString(niz2));
    }
}
