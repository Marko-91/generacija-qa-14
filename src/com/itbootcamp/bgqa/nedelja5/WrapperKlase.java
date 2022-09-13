package com.itbootcamp.bgqa.nedelja5;

import java.util.ArrayList;

public class WrapperKlase {
    public static void main(String[] args) {
        int x = 1;
        Integer y = 10;
        System.out.println(x + y);
        //System.out.println(y.intValue());
        ArrayList<Integer> lista = new ArrayList<>();
        Boolean b = true;
        Long l = 123L;
        Short s = 1;
        Byte bajt = 10;
        Double dd = 1.2;
        Float fl = 3.14F;
        Character c = 's';
        lista.add(x);
        lista.add(y);
        int y2 = lista.get(1);
        System.out.println(y2);

    }
}
