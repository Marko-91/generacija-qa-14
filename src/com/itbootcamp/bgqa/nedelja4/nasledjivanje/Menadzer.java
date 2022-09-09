package com.itbootcamp.bgqa.nedelja4.nasledjivanje;

public class Menadzer extends Radnik {
    private int uspesneProdaje;

  public Menadzer(String ime, String prezime, int jmbg, double mesecnaPlata, double bonusZadada, int brojDanaGodisnjegOdmora, int uspesneProdaje) {
    super(ime, prezime, jmbg, mesecnaPlata, bonusZadada, brojDanaGodisnjegOdmora);
    this.uspesneProdaje = uspesneProdaje;
  }

  public int getUspesneProdaje() {
    return uspesneProdaje;
  }

  public void setUspesneProdaje(int uspesneProdaje) {
    this.uspesneProdaje = uspesneProdaje;
  }

  @Override
  public double dodajBonus() {
    //za svaku uspesnu prodaju dodaj 2% na trenutnu mesecnuPlatu
    double bonus = uspesneProdaje * getMesecnaPlata() * 0.02;
    setMesecnaPlata(getMesecnaPlata() + bonus); // dodaje 2% za svaku uspesnu prodaju
    return bonus;
  }

// (za svakih 10 uspesnih prodaja dodaje se 1 slobodan dan)
  public boolean bonusGodisnjiOdmor() {
    boolean dodajDan = false;
    if (uspesneProdaje >= 10) {
      dodajDan = true;
      setBrojDanaGodisnjegOdmora(getBrojDanaGodisnjegOdmora() + uspesneProdaje / 10);
    }

    return dodajDan;
  }

  @Override
  public void zdravo() {
    System.out.println("Zdravo ja sam Menadzer");
  }
}
