package com.itbootcamp.bgqa.nedelja4;

import java.util.Arrays;

public class StringSplitPrimer {
    public static void main(String[] args) {
        String s = "cao cao ja sam caocao";
        String[] nizString = s.split(" ");
        System.out.println(Arrays.toString(nizString));
    }
}
