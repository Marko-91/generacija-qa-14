package com.itbootcamp.bgqa.nedelja5.zivotinje;

public class Zivotnja {
    private String ime;
    private String rasa;
    protected int brojNogu;
    String brojCipa;

    public Zivotnja(String ime, String rasa, int brojNogu) {
        this.ime = ime;
        this.rasa = rasa;
        this.brojNogu = brojNogu;
    }

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

    //protected
    protected void igrajSeUBiblioteci() {
        System.out.println("pravi haos...");
    }

    //defaultni modifikator/pristup
    void hraniSeOmiljenomHranom() {
        System.out.println("Jede dzigu");
    }

    @Override
    public String toString() {
        return "Zivotnja{" +
                "ime='" + ime + '\'' +
                ", rasa='" + rasa + '\'' +
                '}';
    }
}
