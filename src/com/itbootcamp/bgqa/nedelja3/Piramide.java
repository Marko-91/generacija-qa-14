package com.itbootcamp.bgqa.nedelja3;

public class Piramide {

    public static void main(String[] args) {
        piramida(5);
    }

    public static void piramida(int visina) {

        String z = "*";
        for(int i = 0; i < visina; i++) {
            for(int j = 0; j < visina - i - 1 ; j++) {
                System.out.print(" ");
            }
            System.out.println(z);
            z = z + "**";
        }
    }

    public static void pravouglaPiramida(int visina) {
        for (int i = 0; i < visina; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*"); //zvezdice u red
            }
            System.out.println(); //novi red
        }
    }
}
