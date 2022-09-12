package com.itbootcamp.bgqa.nedelja5;

public class TestZivotinje {
    public static void main(String[] args) {
        Macka macka1 = new Macka("Flekica", "maca", "viskas");
        Macka macka2 = new Macka("Flekica", "maca", "viskas");

        System.out.println(macka1.equals(macka2));
        String s1 = "itbootcamp";
        String s2 = "itbootcamp";
        System.out.println(s1.equals(s2));


    }
}
