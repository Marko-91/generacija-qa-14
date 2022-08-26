package com.itbootcamp.bgqa.nedelja3;

import java.util.Arrays;

public class UbaciElementNaIndex {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                ubaciElementUNizNaIndex(new int[]{1,2,3,4,5}, 99, 3)));
    }

    public static int[] ubaciElementUNizNaIndex(int[] niz, int element, int index) {

        int[] nizSaDodatimElementom = new int[niz.length + 1];
        for(int i = 0, j = 0; i < nizSaDodatimElementom.length; i++, j++) {
            if (i == index) {
                nizSaDodatimElementom[i] = element; // dodam element
                j--;
                continue;
            }
            nizSaDodatimElementom[i] = niz[j];
        }

        return nizSaDodatimElementom;
    }

}
