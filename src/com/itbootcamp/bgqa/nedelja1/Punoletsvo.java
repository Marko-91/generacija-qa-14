package com.itbootcamp.bgqa.nedelja1;

public class Punoletsvo {
    public static void main(String[] args) {
        int godinaRodjenja = 1991;
        int trenuntnaGodina = 2022;
        int godine = trenuntnaGodina - godinaRodjenja;
        // ==, >=, <=, >, <, != (nejednako)
        if (trenuntnaGodina - godinaRodjenja >= 18) {
            System.out.println("Vi ste punoletni");
        } else {
            System.out.println("Vi ste maloletni");
        }
    }
}
