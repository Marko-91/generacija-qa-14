package com.itbootcamp.bgqa.nedelja1;//Komentari...
import java.util.Scanner;

public class ScannerObjekat {
    public static void main(String[] args) {
        Scanner mojSkener = new Scanner(System.in);
        System.out.print("Unesite vase ime: "); // printa liniju bez novog reda
        String ss = "ovo je neki string";

        String ime = mojSkener.nextLine();
        System.out.println("Vi se zovete: " + ime);
        System.out.println(ime.equals("marko"));
    }
}


