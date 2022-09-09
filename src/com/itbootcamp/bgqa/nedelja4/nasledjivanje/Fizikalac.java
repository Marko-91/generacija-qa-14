package com.itbootcamp.bgqa.nedelja4.nasledjivanje;

public class Fizikalac extends Radnik {
    private int brojRadnihSubota;

    public Fizikalac(String ime, String prezime, int jmbg, double mesecnaPlata, double bonusZadada, int brojRadnihSubota, int brojDanaGodisnjegOdmora) {
        super(ime, prezime, jmbg, mesecnaPlata, bonusZadada, brojDanaGodisnjegOdmora); //Pozivamo konstruktor iz nadklase
        this.brojRadnihSubota = brojRadnihSubota;
    }

    public int getBrojRadnihSubota() {
        return brojRadnihSubota;
    }

    public void setBrojRadnihSubota(int brojRadnihSubota) {
        this.brojRadnihSubota = brojRadnihSubota;
    }

    @Override
    public double dodajBonus() {
        double bonus = brojRadnihSubota * getMesecnaPlata() * 0.01;
        setMesecnaPlata(getMesecnaPlata() + bonus); // dodaje 1% za svaku radnu subotu
        return bonus;
    }

    // (za svakih 4 radnih subota dodaje se 1 slobodan dan)
    public boolean bonusGodisnjiOdmor() {
        boolean dodajDan = false;
        if (brojRadnihSubota >= 4) {
            dodajDan = true;
            setBrojDanaGodisnjegOdmora(super.getBrojDanaGodisnjegOdmora() + brojRadnihSubota / 4);
        }

        return dodajDan;
    }

    public static void main(String[] args) {
        Fizikalac fizikalac1 =
                new Fizikalac("Zarko", "Zarkovic", 123, 1000, 0, 0, 10);
        System.out.println("Pre bonusa: " + fizikalac1.getMesecnaPlata());

        fizikalac1.setBrojRadnihSubota(5);
        fizikalac1.dodajBonus();
        System.out.println("Posle bonusa: " + fizikalac1.getMesecnaPlata());

    }

    @Override
    public void zdravo() {
        System.out.println("Zdravo ja sam Fizikalac");
    }

    @Override
    public String toString() {
        return super.toString() + " broj radnih subota: "+ this.brojRadnihSubota;
    }

}
