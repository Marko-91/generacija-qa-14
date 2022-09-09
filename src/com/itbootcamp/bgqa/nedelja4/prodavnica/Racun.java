package com.itbootcamp.bgqa.nedelja4.prodavnica;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Racun {
    private String id;
    private Kasa kasa;
    private final FileOutputStream fos;


    public Racun(Kasa kasa) throws FileNotFoundException {
        this.id = LocalDateTime.now().toString().replaceAll(":", "");
        this.kasa = kasa;
        fos = new FileOutputStream(id);
    }

    public void izbaciRacun() throws IOException {
        fos.write(kasa.kreirajRacun().getBytes(StandardCharsets.UTF_8));
    }

    public static void main(String[] args) throws IOException {
        Roba meso =
                new Meso(58328, 1000, "junetina", 0, new Prozvodjac(), 100.00, "smrznuto");

        Roba mleko =
                new MlecniProizvod(342534, 321, "banane", 0, new Prozvodjac(), "tetrapak");

        Roba banane =
                new PijacniProizvod(2345, 42, "banane", 0, new Prozvodjac(), 100.00, false);
        ArrayList<Roba> roba  = new ArrayList<>();
        roba.add(meso);
        roba.add(mleko);
        roba.add(banane);
        Kasa kasa = new Kasa("1", roba);
        Racun racun = new Racun(kasa);
        racun.izbaciRacun();

    }
}
