package com.itbootcamp.bgqa.nedelja5;

public class Zivotnja {
    private String ime;
    private String rasa;

    public Zivotnja(String ime, String rasa) {
        this.ime = ime;
        this.rasa = rasa;
    }

    public String getIme() {
        return ime;
    }

    public String getRasa() {
        return rasa;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void javiSe() {
        System.out.println("mju...");
    }

    @Override
    public String toString() {
        return "Zivotnja{" +
                "ime='" + ime + '\'' +
                ", rasa='" + rasa + '\'' +
                '}';
    }
}
