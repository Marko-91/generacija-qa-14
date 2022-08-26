package com.itbootcamp.bgqa.nedelja3;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] niz1 = {1, 2, 3, 4, 5, 6,7};
        int[] niz2 = {5,8,9,4,10,6};

        brojac (niz1,niz2);

    }

    public static int brojac (int[] niz1, int[] niz2){
        int brojacIstih = 0;
        for (int i = 0; i < niz1.length; i++){
            for (int j = 0; j < niz2.length; j++) {
                if (niz1[i] == niz2[j]){
                    brojacIstih++;
                    break;
                }
            }
        }
        noviNiz (niz1,niz2,brojacIstih);
        return brojacIstih;
    }

    public static int[] noviNiz (int[] niz1, int[] niz2, int brojacIstih){
        int[] noviNiz = new int[brojacIstih];
        int k = 0;
        for (int i = 0; i < niz1.length; i++){
            for (int j = 0; j< niz2.length; j++){
                if (niz1[i] == niz2[j]){
                    noviNiz[k] = niz1[i];
                    k++;
                    break;
                }
            }
        }
        System.out.println("Presek dva niza je: " + Arrays.toString(noviNiz));
        return noviNiz;
    }
}
