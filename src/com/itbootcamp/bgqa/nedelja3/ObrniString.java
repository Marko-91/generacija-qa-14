package com.itbootcamp.bgqa.nedelja3;

public class ObrniString {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }

    public static String obrniRec(String s) {
        String obrnutaRec = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            obrnutaRec = obrnutaRec + s.charAt(i);
        }

        return obrnutaRec;
    }

    public static void fizzBuzz(int donjaGranica, int gornjaGranica) {
        //TODO
    }
}
