package com.itbootcamp.bgqa.nedelja5.geometrija;

public class Kvadrat implements Obim, Povrsina {
    private double a;

    public Kvadrat(double a) {
        this.a = a;
    }

    @Override
    public double racunajObim() {
        return 4 * a;
    }

    @Override
    public double racunajPovrsinu() {
        return a * a;
    }
}
