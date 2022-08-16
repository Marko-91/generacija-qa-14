package com.itbootcamp.bgqa.nedelja1;

public class CelbrojniTipovi {
    public static void main(String[] args) {
        int ceoBroj = 2_147_483_647; // deklaracija promeljive
        //8 bytes... 32 bita
        // 0000 0000 0000 0000 0000 0000 0000 0000 0000
        //long brojLjudiNaPlaneti = 8_500_000_000L;
        ceoBroj = ceoBroj + 1; // integer overflow
        short nekiBroj = 1000;
        byte bajt = 127; //0000 0000 2 ^ 8 = 256 ...
        //bajt = bajt + 1;
        bajt++; // bajt = bajt + 1
        bajt++;
        System.out.println(bajt);
        //System.out.println(ceoBroj);
    }
}
