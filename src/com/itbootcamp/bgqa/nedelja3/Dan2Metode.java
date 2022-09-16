package com.itbootcamp.bgqa.nedelja3;

import java.text.DecimalFormat;
import java.util.Random;

public class Dan2Metode {
    public static void main(String[] args) {
        //System.out.println(stepen(-2, -3));
        for (int i = 0; i < 10; i++) {
            System.out.println(random(5.5, 8.5));
        }
    }

    public static int random(int donjaGranica, int gornjaGranica) {
        return (int) (Math.random() * (gornjaGranica - donjaGranica + 1)) + donjaGranica;
    }

    public static double random(double donjaGranica, double gornjaGranica) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        double n = (Math.random() * (gornjaGranica - donjaGranica)) + donjaGranica;
        return Double.parseDouble(decimalFormat.format(n));
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
