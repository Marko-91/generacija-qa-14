package com.itbootcamp.bgqa.nedelja2;

public class SumaNeparnihBrojevaFor {
    //For petlja koja racuna sumu neparnih brojeva od 1 ddo 10
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 10; i++) { // I nacin
            if (i % 2 != 0) {
                suma += i;
            }
        }

        System.out.println("Suma 1: " + suma);

        int suma2 = 0;
        for (int i = 1; i <= 10; i += 2) { // 2 nacin
            suma2 += i;
        }

        System.out.println("Suma 2: " + suma2);

        int suma3 = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }

            suma3 += i;
        }

        System.out.println("Suma 3: " + suma3);

    }
}
