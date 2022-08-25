package com.itbootcamp.bgqa.nedelja2;

import java.util.Arrays;

public class ProsledjivanjeKopijaPromeljivihPutemVrednosti {

    public static void main(String[] args) {
        /*
        int x = 10;
        System.out.println(x);
        int y = x; // y dobija kopiju x
        System.out.println(y);
        x = x + 5;
        System.out.println(y); //10 ili 15
        System.out.println(x); // 15

         */

        int[] dobitnaKombinaija = {30, 21, 1, 2, 5, 6, 20};
        System.out.println(dobitnaKombinaija);

        int[] nizX = dobitnaKombinaija;
        System.out.println(nizX); //?

        //nizX[0] = 5;

        //System.out.println(Arrays.toString(nizX)); // 5..

        System.out.println(Arrays.toString(dobitnaKombinaija)); //

        int[] nizY = Arrays.copyOf(dobitnaKombinaija, dobitnaKombinaija.length);
        nizY[0] = 1;
        System.out.println(Arrays.toString(dobitnaKombinaija)); //
        System.out.println(Arrays.toString(nizY)); //
        System.out.println(nizY);
        System.out.println(dobitnaKombinaija);



    }
}
