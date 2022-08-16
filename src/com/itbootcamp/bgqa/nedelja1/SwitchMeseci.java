package com.itbootcamp.bgqa.nedelja1;

import java.util.Scanner;

public class SwitchMeseci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextLine()) {
            case "februar":
                System.out.println("29 dana");
                break;
            case "januar":
            case "mart":
            case "maj":
            case "jul":
            case "avgust":
            case "oktobar":
            case "decembar":
                System.out.println("31 dan");
                break;
            case "april":
            case "jun":
            case "septembar":
            case "novembar":
                System.out.println("30 dana");
                break;
            default:
                System.out.println("Pogresan unos");
        }
    }
}
