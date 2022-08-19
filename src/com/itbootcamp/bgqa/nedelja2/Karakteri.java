package com.itbootcamp.bgqa.nedelja2;

import java.util.Arrays;

public class Karakteri {
    public static void main(String[] args) {
        char[] slova = {'p', 'b', 'c', 'd', 'e', 'i', 'a', 'x'};

        char[] samoglasnici = new char[slova.length];

        int brojacZaSamoglasnike = 0;
        for (int i = 0; i < slova.length; i++) {
            if (slova[i] == 'a' || slova[i] == 'e'
            || slova[i] == 'i' || slova[i] == 'o'
            || slova[i] == 'u') {
                samoglasnici[brojacZaSamoglasnike] = slova[i];
                brojacZaSamoglasnike++;
            }
        }

        char[] samoglasniciTrimovani = new char[brojacZaSamoglasnike];

        for (int i = 0; i < brojacZaSamoglasnike; i++) {
            samoglasniciTrimovani[i] = samoglasnici[i];
        }

        System.out.println(Arrays.toString(samoglasniciTrimovani));
    }
}
