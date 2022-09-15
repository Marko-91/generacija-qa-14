package com.itbootcamp.bgqa.nedelja5;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int niz[] = new int[]{7,6,5,3,10,100};
        int niz2[] = new int[100000];
        long vremePreAlgoritma = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            niz2[i] = new Random().nextInt();
        }

        selectionSort(niz);
        long vremePosleAlgoritma = System.currentTimeMillis();
        //System.out.println((vremePosleAlgoritma - vremePreAlgoritma) / 100);
        System.out.println(Arrays.toString(niz));
    }

    private static void selectionSort(int[] niz) {

        for (int i = 0; i < niz.length - 1; i++) {
            int indexTrazenogBroja = i;
            for (int j = i; j < niz.length; j++) { //j=i znaci da petlja krece od nesortiranog dela niza
                //nadji indeks najmanjeg elementa
                if (compareTo(niz[j], niz[indexTrazenogBroja]) < 0) {
                    indexTrazenogBroja = j;
                }

                //menjamo mesta najmanjeg elementa i prvog elementa nesortiranog dela niza
                int temp = niz[i];
                niz[i] = niz[indexTrazenogBroja];
                niz[indexTrazenogBroja] = temp;

            }

        }
    }

    public static int compareTo(int x, int y) {
        return y - x;
    }

}
