package com.itbootcamp.bgqa.nedelja2;

public class NIzoviInt {
    public static void main(String[] args) {
        int[] mojNiz = {100, 2, -1, 44, 2, 6, 7, 8, 9, 10};
        System.out.println("Prvi element: " + mojNiz[0]);
        System.out.println("Drugi element: " + mojNiz[1]);
        System.out.println("Treci element: " + mojNiz[2]);

        System.out.println("Deseti element: " + mojNiz[9]);
        //System.out.println("11 element: " + mojNiz[10]);
        System.out.println("Niz je duzine " + mojNiz.length);

        for (int i = 0; i < mojNiz.length; i++) {
            System.out.println(i + ". element niza: " + mojNiz[i]);
        }

        System.out.println("Kraj programa");
    }
}
