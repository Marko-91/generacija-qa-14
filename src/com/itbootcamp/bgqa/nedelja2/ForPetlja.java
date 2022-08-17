package com.itbootcamp.bgqa.nedelja2;

public class ForPetlja {
    public static void main(String[] args) {
        /*
        for (int i = 1, j = 0; i <= 10; i++, j++) {
            System.out.println(i);
            System.out.println(j);
        }
        */

        for (int i = 0; i <= 10; i++) {
            //i = 5;
            //break izlazi iz bloka for petlje
            if (i >= 5) {
                System.out.println(i);
                continue;
                //System.out.println("");
            }
            System.out.println(i);

        }
        System.out.println("Kraj programa");
    }
}
