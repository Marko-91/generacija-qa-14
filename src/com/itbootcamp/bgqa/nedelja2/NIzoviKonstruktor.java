package com.itbootcamp.bgqa.nedelja2;

public class NIzoviKonstruktor {
    public static void main(String[] args) {

        int[] mojNiz = new int[10];
        System.out.println(mojNiz.length);
        for (int i = 0; i < mojNiz.length; i++) {
            mojNiz[i] = i + 1;
        }

        for (int i = 0; i < mojNiz.length; i++) {
            if (i == mojNiz.length - 1) {
                System.out.print(mojNiz[i]);
            } else {
                System.out.print(mojNiz[i] + ", ");
            }
        }


    }
}
