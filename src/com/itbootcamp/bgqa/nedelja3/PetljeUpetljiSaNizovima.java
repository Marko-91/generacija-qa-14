package com.itbootcamp.bgqa.nedelja3;

public class PetljeUpetljiSaNizovima {
    public static void main(String[] args) {
        int[] niz1 = {1, 2, 3, 4, 5};
        int[] niz2 = {-1, -2, -3, -4, -5};
        for (int i = 0; i < niz1.length; i++) {
            System.out.println(niz1[i]);
            for (int j = 0; j < niz2.length; j++) {
                System.out.print(niz2[j]);
            }
            System.out.println();
        }

    }
}
