package com.itbootcamp.bgqa.nedelja3;

import java.util.Scanner;

public class UvodUMetode {
    public static void main(String[] args) {
        System.out.println("*** Pocetak programa ***");
        ispis("Cao");
        ispis();
        System.out.println("*** Kraj programa ***");
        //2 3 = 2 * 2 * 2 = 8
        //2 -3

    }

    public static void ispis(String rec) {
        System.out.println("Ulazimo u metodu 'ispis'");
        System.out.println(rec);
    }

    public static String ispis() {
        System.out.println("Cao iz metode ispis");
        return "Vraceno iz metode ispis";
    }

    public static int apsolut(int broj) {
        /*
        if (broj < 0) { // da li je broj negativan
            return -broj; //sad je apsoluti broj pozitivan
        }
        return broj;
         */
        return (broj < 0) ?/*onda*/ -broj :/*inace*/ broj;
    }

    public static double apsolut(double broj) {
        double apsolutniBroj = broj; //napravimo kopiju promenljive broj
        if (broj < 0) { // da li je broj negativan
            apsolutniBroj = broj * (-1); //sad je apsoluti broj pozitivan
        }
        return apsolutniBroj;
    }
    public static double celsiusUFarenhajt(double tempCelsius) {
        return tempCelsius * 1.8 + 32;
    }
    //isto kao u metodi string.indexOf
    public static double celsiusUFarenhajt(int tempCelsius) {
        return tempCelsius * 1.8 + 32;
    }
    public static int/*povratni tip metode/return type*/ proizvod(int x, int y) {
        //apstrakcija, mogucnost ponovnog koriscenja bloka koda - reusability, mogucnost lakog otklanjanja bagova
        //metoda pravi kopije argumenata i cuva ih u promeljive x i y
        // x i y se nazivaju lokalne promenljive posto su lokalne za ovu metodu
        int proizvod = x * y;
        System.out.println("Cinoc x: " + x);
        System.out.println("Cinoc y: " + y);
        System.out.println(proizvod);
        return proizvod; //vraca vrednost promeljive 'proizvod'
        //System.out.println(proizvod);
    }


}
