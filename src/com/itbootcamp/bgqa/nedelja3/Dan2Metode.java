package com.itbootcamp.bgqa.nedelja3;

public class Dan2Metode {
    public static void main(String[] args) {
        System.out.println(stepen(-2, -3));
        for (int i = 0; i < 100; i++) {
            System.out.println(random(5.0, 10.0));
        }
    }

    public static int random(int donjaGranica, int gornjaGranica) {
        return (int) (Math.random() * (gornjaGranica - donjaGranica + 1)) + donjaGranica;
    }

    public static double random(double m, double n) {
        double nasumicniBroj= Math.min(m,n)+Math.random()*Math.max(m,n);
        return nasumicniBroj;
    }

    public static double stepen(double n, int eksp) {

        double rezultat = 1;

        for (int i = 0; i < Math.abs(eksp); i++) {
            rezultat = rezultat * n;
        }
        if (eksp < 0) {
            rezultat = 1 / rezultat;
        }

        return rezultat;

    }
}
