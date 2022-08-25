package com.itbootcamp.bgqa.nedelja3;

public class FizzBUzz {

    public static void main(String[] args) {
        fizzBuzz(1, 100);
    }

    public static void fizzBuzz(int donjaGranica, int gornjaGranica) {

        for (int i = donjaGranica; i < gornjaGranica; i++) {
            if (i % 5 == 0 && i % 3 == 0) { // if (i % 15 == 0)
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Fizz");
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

            System.out.println("Posle if else grana");
        }
    }
}
