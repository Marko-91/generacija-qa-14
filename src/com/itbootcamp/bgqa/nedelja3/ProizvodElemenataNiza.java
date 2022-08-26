package com.itbootcamp.bgqa.nedelja3;

public class ProizvodElemenataNiza {

    public static void main(String[] args) {
        proizvodNiza(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 10});
    }

    public static void proizvodNiza(int[] niz1, int[] niz2) {
        for (int i = 0; i < niz1.length; i++) {
            int prozivod = niz1[i]; // 1, 2, 3, 4, 5.
            for (int j = 0; j < niz2.length; j++) {
                prozivod = prozivod * niz2[j];
            }

            System.out.println("Proizvod brojeva u " + (i + 1) + " redu je: " + prozivod);
        }
    }
}
