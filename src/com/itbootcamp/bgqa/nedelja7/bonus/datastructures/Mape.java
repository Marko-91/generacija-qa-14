package com.itbootcamp.bgqa.nedelja7.bonus.datastructures;

import java.util.*;

public class Mape {
    public static void main(String [] arg) {

        Map<String, Integer> ucenici = new HashMap<>();

        ucenici.put("Marko", 3);
        ucenici.put("Nikola", 1);
        ucenici.put("Jelena", 5);
        ucenici.put("Zoran", 1);
        ucenici.put("Mirka", 4);
        ucenici.put("Mirko", 3);

        Set<String> keys = ucenici.keySet();
        for(String key : keys) {
            System.out.println(key + ", " + ucenici.get(key));
        }

        int prosecnaOcena = 0;
        int rezultat = 0;
        for(String key : keys) {
            prosecnaOcena +=  ucenici.get(key);
            rezultat = (int) prosecnaOcena / ucenici.size();
        }
        System.out.println("Prosecna ocena je: " + rezultat);

        List<String> losijiUcenici = new ArrayList<>();

        for(String key : keys) {
            if(ucenici.get(key) == 1) {
                losijiUcenici.add(key);
            }
        }

        System.out.println("Ucenici sa jedinicama su: " + losijiUcenici);

    }
}
