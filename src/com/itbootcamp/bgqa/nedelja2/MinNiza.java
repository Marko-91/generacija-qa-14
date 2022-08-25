package com.itbootcamp.bgqa.nedelja2;

import java.util.Scanner;

public class MinNiza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite duzinu niza: ");
        int l = scanner.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.print("Unesite " + (i + 1) + " element niza: ");
            arr[i] = scanner.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < l; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum je: " + min);
    }
}
