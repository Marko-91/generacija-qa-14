package com.itbootcamp.bgqa.nedelja4;

import java.time.LocalDate;

public class Radnik {
    private int id;
    private String ime;
    private String pozicija;
    private int godinaPocetka;
    private double plataBrutoGodisnja;

    public Radnik(int id, String ime, String pozicija, int godinaPocetka, double plataBrutoGodisnja) {
        this.id = id;
        this.ime = ime;
        this.pozicija = pozicija;
        this.godinaPocetka = godinaPocetka;
        this.plataBrutoGodisnja = plataBrutoGodisnja;
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPozicija() {
        return pozicija;
    }

    public int getGodinaPocetka() {
        return godinaPocetka;
    }

    public double getPlataBrutoGodisnja() {
        return plataBrutoGodisnja;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public void setPlataBrutoGodisnja(double plataBrutoGodisnja) {
        this.plataBrutoGodisnja = plataBrutoGodisnja;
    }

    public int racunajRadniStaz() {
        if (godinaPocetka > LocalDate.now().getYear()) { // 2023 > 2022
            throw new IllegalArgumentException
                    (String.format("Godina zaposlenja %d ne moze biti veca od trenutne godine %d",
                            godinaPocetka, LocalDate.now().getYear()));
        }
        return LocalDate.now().getYear() - godinaPocetka;
    }

    public double racunajNetoPlatuGodisnju() {
        return plataBrutoGodisnja * 0.7;
    }

    public double racunajMesecnuPlatuBruto() {
        return plataBrutoGodisnja / 12;
    }

    public double racunajMesecnuPlatuNeto() {
        return racunajNetoPlatuGodisnju() / 12;
    }
}
