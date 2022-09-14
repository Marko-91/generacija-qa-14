package com.itbootcamp.bgqa.nedelja5.geometrija;

public class PravougliTrougao implements Obim, Povrsina {
    private double k1, k2;
    private double h;

    public PravougliTrougao(double k1, double k2, double h) {
        this.k1 = k1;
        this.k2 = k2;
        this.h = h;
    }

    @Override
    public double racunajObim() {
        return k1 + k2 + h;
    }

    @Override
    public double racunajPovrsinu() {
        return k1 * k2 / 2;
    }
}
