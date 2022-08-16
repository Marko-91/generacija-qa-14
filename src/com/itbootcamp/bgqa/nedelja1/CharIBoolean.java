package com.itbootcamp.bgqa.nedelja1;

public class CharIBoolean {
    public static void main(String[] args) {
        char mojKarakter = 'F';
        System.out.println(mojKarakter);

        boolean bool = true;
        System.out.println(bool);
        boolean proveraKaraktera = mojKarakter == 'F';
        if (proveraKaraktera) {
            System.out.println("Karakter je F");
        }
    }
}
