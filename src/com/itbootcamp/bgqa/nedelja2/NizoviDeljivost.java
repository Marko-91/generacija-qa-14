package com.itbootcamp.bgqa.nedelja2;

public class NizoviDeljivost {
    public static void main(String[] args) {
        int[] mojNiz = {100, 15, -1, 44, 2, 6, 7, 8, 9, 10};

        for (int i = 0; i < mojNiz.length; i++) {
            int iTiElementNiza = mojNiz[i];
            if (iTiElementNiza % 5 == 0 && iTiElementNiza % 3 == 0) {
                System.out.println("Broj " + iTiElementNiza + " je deljiv sa 3 i 5");
            }
        }
    }
}
