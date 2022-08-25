package com.itbootcamp.bgqa.nedelja2;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        //region Init niza
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite duzinu niza: ");
        int l = scanner.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.print("Unesite " + (i + 1) + " element niza: ");
            arr[i] = scanner.nextInt();
        }
        //endregion
        System.out.println("Pre swapovanja: " + Arrays.toString(arr));
        System.out.print("Unesite prvi index: ");
        int index1 = scanner.nextInt();
        System.out.print("Unesite drugi index: ");
        int index2 = scanner.nextInt();
        int trecaCasa = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = trecaCasa;

        System.out.println("Posle swapovanja: " + Arrays.toString(arr));


    }
}
