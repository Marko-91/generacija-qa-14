package com.itbootcamp.bgqa.nedelja1;

public class SwitchDaniUNedelji {
    public static void main(String[] args) {
        int danUNedelji = 1;

        switch (danUNedelji) {
            case 1:
                System.out.println("ponedeljak");
                break;
            case 2:
                System.out.println("utorak");
                break;
            case 3:
                System.out.println("sreda");
                break;
            case 4:
                System.out.println("cetvrtak");
                break;
            case 5:
                System.out.println("petak");
                break;
            case 6:
                System.out.println("subota");
                break;
            case 7:
                System.out.println("nedelja");
                break;
            default:
                System.out.println("Pogresan unos");
        }

    }
}
