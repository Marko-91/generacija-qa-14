package com.itbootcamp.bgqa.nedelja1;

public class OcenaTesta {
    public static void main(String[] args) {
        int brojPoenaNaTestu = 0;

        if (brojPoenaNaTestu >= 91) {
            System.out.println("A");
        } else if (brojPoenaNaTestu >= 81) {
            System.out.println("B");
        } else if (brojPoenaNaTestu >= 71) {
            System.out.println("C");
        } else if (brojPoenaNaTestu >= 61) {
            System.out.println("D");
        } else if (brojPoenaNaTestu >= 51) {
            System.out.println("E");
        } else {
            System.out.println("F - Nije polozio");
        }
        System.out.println("***Kraj programa***");
    }
}
