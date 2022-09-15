package com.itbootcamp.bgqa.nedelja5;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int niz[] = new int[]{7,6,5,3,10,100};

        selectionSort(niz);
        System.out.println(Arrays.toString(niz));
    }

    private static void selectionSort(int[] niz) {

        for (int i = 0; i < niz.length - 1; i++) {
            int indexMinimalog = i;
            for (int j = i; j < niz.length; j++) { //j=i znaci da petlja krece od nesortiranog dela niza
                //nadji indeks najmanjeg elementa
                if (niz[j] < niz[indexMinimalog]) {
                    indexMinimalog = j;
                }

                //menjamo mesta najmanjeg elementa i prvog elementa nesortiranog dela niza
                int temp = niz[i];
                niz[i] = niz[indexMinimalog];
                niz[indexMinimalog] = temp;

            }

        }
    }

}
