package com.itbootcamp.bgqa.nedelja2;

public class StringMetode {
    public static void main(String[] args) {
        String string = "ITBootcamp";

        System.out.println(string.equals("ITBootcamp")); // True
        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
        System.out.println(string.length());
        System.out.println(string.charAt(0));
        System.out.println(string.charAt(1));
        System.out.println(string.charAt(9));
        //System.out.println(string.charAt(10)); // Baca Runtime exception
        System.out.println(string.indexOf('o')); // 3
        System.out.println(string.indexOf('o', 4)); // 4
        System.out.println(string.substring(4));
        System.out.println(string.substring(4, 7));
        System.out.println(string.contains("Boot"));


    }
}
