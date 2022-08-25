package com.itbootcamp.bgqa.nedelja3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ubaciElement(3, 100, new int[]{1,2,3,4,5})));
        System.out.println(Arrays.toString(presek(new int[]{1,2,3,4,5}, new int[]{1, 3, 6})));
    }

    public static int[] ubaciElement(int index, int element, int[] arr) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++, j++) {
            if (i == index) {
                newArr[i] = element;
                j--;
                continue;
            }
            newArr[i] = arr[j];
        }

        return newArr;
    }
    public static int[] presek(int[] a, int[] b) {
        int[] c = new int[a.length];

        for (int i = 0, k = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[k] = a[i];
                    k++;
                    break;
                }
            }
        }

        return c;
    }
}
