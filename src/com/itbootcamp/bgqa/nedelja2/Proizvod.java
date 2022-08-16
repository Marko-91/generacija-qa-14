package com.itbootcamp.bgqa.nedelja2;

import java.util.Scanner;

public class Proizvod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("unesite prvi broj: ");
        int x = scanner.nextInt();
        int cinoc = x;
        System.out.print("unesite drugi broj: ");
        int y = scanner.nextInt();

        int proizvod = 0;

        while (x > 0) {
            proizvod = proizvod + y;
            x--;
        }

        System.out.println("Proizvod brojeva " + cinoc + " i " + y + " je " + proizvod);
    }

}
