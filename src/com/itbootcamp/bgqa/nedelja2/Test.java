package com.itbootcamp.bgqa.nedelja2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite visinu piramide: ");
        int h = s.nextInt();
        String star = "*";
        for (int i = 0; i < h; i++) {
            for (int j = i; j < h - 1; j++) {
                System.out.print(" ");
            }
            System.out.print(star);
            star += "**";
            System.out.println();
        }
    }
    public static int proizvod(int x, int y) {  //povratni tip metode\return type
        //metoda pravi kopije argumenata i cuva ih u promenljive x i y
        // int x = 5;
        //  int y = 5;
        int proizvod = x * y;
        System.out.println("Cinioc x:" + x);
        System.out.println("Cinioc y:" + y);
        System.out.println(proizvod);
        return proizvod; //vraca vrednost promenljive "proizvod"
    }
}
