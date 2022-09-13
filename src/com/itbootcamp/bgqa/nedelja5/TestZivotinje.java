package com.itbootcamp.bgqa.nedelja5;

import com.itbootcamp.bgqa.nedelja5.zivotinje.Macka;

public class TestZivotinje {
    public static void main(String[] args) {
        Macka macka1 = new Macka("Flekica", "maca", "viskas");
        Macka macka2 = new Macka("Flekica", "maca", "viskas");
        String nijeMacka100posto = "nekistring";

        System.out.println(macka1.equals(macka2));
        String s1 = "itbootcamp";
        String s2 = "itbootcamp";
        s1 = "itbootcamp";
        s1.concat("camp"); // s1 + ".."
        s1.substring(0, 1);
        s1 += "";

        System.out.println(s1 == s2); /// ????

        int[] niz = {1, 2, 3};
        niz[0] = 100; // ne pravi novi niz od {100, 2, 3}

//        String s1 = new String("itbootcamp");
//        String s2 = new String("itbootcamp");

        //System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); //?

    }
}
