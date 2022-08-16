package com.itbootcamp.bgqa.nedelja2;

public class MathDemo {
    public static void main(String[] args) {
        /*
        int x = (int) Math.pow(2, 16);
        System.out.println(x);

        int koren = (int) Math.sqrt(25);
        System.out.println("Koren broja 25 je " + koren);

        double y = -3.5;
        double yceil = Math.ceil(y);
        System.out.println(yceil);
        double yfloor = Math.floor(y);
        System.out.println(yfloor);
        double yabs = Math.abs(y);
        System.out.println(yabs);
        //Math.max(9, 99);
        //Math.min(-20, 20);

         */
        double mojNasumicniBroj = Math.random();
        System.out.println(mojNasumicniBroj);

        int ceoNasumicniBroj = (int) (Math.random() * 10) + 1;
        System.out.println(ceoNasumicniBroj);
    }
}
