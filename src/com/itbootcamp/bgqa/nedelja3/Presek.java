package com.itbootcamp.bgqa.nedelja3;

import java.util.Arrays;

public class Presek {
    public static void main(String[] args) {
        int[] p = presek(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 6, 7, 8});
        System.out.println(Arrays.toString(p));

    }

    public static int[] presek(int[] niz1, int[] niz2) {

        int[] nizPresek = new int[niz1.length];
        int brojacPreseka = 0;
        for (int i = 0; i < niz1.length; i++) {
            for (int j = 0; j < niz2.length; j++) {
                if (niz1[i] == niz2[j]) {
                    nizPresek[brojacPreseka++] = niz1[i];
                    //brojacPreseka++; moze ovako ili kao gore ^
                    break;
                }
            }
        }

        return Arrays.copyOf(nizPresek, brojacPreseka);
    }
}
