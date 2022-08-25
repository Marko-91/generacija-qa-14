package com.itbootcamp.bgqa.nedelja3;

public class Palindrom {

    public static void main(String[] args) {
        System.out.println(palindrom("ana"));
    }

    public static boolean palindrom(String rec) {
        boolean jePalindrom = true;

        for (int i = 0; i < rec.length(); i++) {
            if (rec.charAt(i) != rec.charAt(rec.length() - i - 1)) {
                jePalindrom = false;
                break;
            }
        }

        //ispis
        if (jePalindrom) {
            System.out.println("Rec '" + rec + "' je palindrom");
        } else {
            System.out.println("Rec '" + rec + "' nije palindrom");
        }

        return jePalindrom;

    }
}
