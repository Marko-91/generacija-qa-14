package com.itbootcamp.bgqa.nedelja3;

public class BinarySearch {
    public static void main(String[] args) {
        int[] in = {-1, 0, 3, 4, 5, 6, 7, 100};
        //System.out.println(binarySearch(in, 1000));
        System.out.println(binarySearch(in, 1000, 0, in.length));

    }

    static int binarySearch(int[] arr, int num) {

        int high = arr.length - 1;
        int low = 0;
        int mid = 0;

        while (low <= high) {

            mid = (low + high) / 2;
            int target = arr[mid];

            if (target == num) {
                return mid;
            } else if (num < target) { //left
                high = mid - 1;
            } else { // right
                low = mid + 1;
            }
        }

        return -1;
    }

    static int binarySearch(int[] arr, int target, int low, int high) {

        int mid = (high + low) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (mid == 0) {
            return -1;
        } else if (target > mid) { // right side
            return binarySearch(arr, target, mid + 1, high);
        } else {
            return binarySearch(arr, target, low, mid - 1);
        }
    }
}
