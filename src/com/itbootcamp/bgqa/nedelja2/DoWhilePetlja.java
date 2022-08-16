package com.itbootcamp.bgqa.nedelja2;

public class DoWhilePetlja {
    public static void main(String[] args) {
        boolean uslov = true;
        String ime = "Dusan";
        int brojac = 0;

        do {
            System.out.println("Zdravo " + ime);
            brojac++;
        } while(brojac > 10);

        System.out.println(brojac);
    }
}
