package com.itbootcamp.bgqa.nedelja2;

public class ParniBrojeniNaNeparnimIndeksima {
    public static void main(String[] args) {
        int[] niz = {3, 10, 1, 9, 2, 0};
        // 0 = 2 * n = 2 * 0 = 0
        for (int i = 0; i < niz.length; i++) {
            if (i % 2 != 0) {
                if (niz[i] % 2 == 0 && niz[i] != 0) {
                    System.out.println("Broj : '" + niz[i] + "' je paran na indeksu " + i);
                }
            }
        }
    }
}
