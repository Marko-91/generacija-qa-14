package com.itbootcamp.bgqa.nedelja4.nasledjivanje;

public class TestManager {
    public static void main(String[] args) {
        //region test scenario dodaj bonus
        Menadzer menadzer1 =
                new Menadzer("Zarko", "Zarkovic", 123, 2000, 0, 0, 15);

        menadzer1.setUspesneProdaje(1);
        menadzer1.dodajBonus();
        assert menadzer1.getMesecnaPlata() == 2040.0;
        //endregion
        //region test scenario bonus godisnji odmor

        Menadzer menadzer2 =
                new Menadzer("Zarko", "Zarkovic", 123, 2000, 0, 0, 15);

        menadzer2.setUspesneProdaje(10);
        boolean godisnji = menadzer2.bonusGodisnjiOdmor();
        assert godisnji;

        menadzer2.setUspesneProdaje(9);
        godisnji = menadzer2.bonusGodisnjiOdmor();
        assert !godisnji;

        menadzer2.setUspesneProdaje(41);
        menadzer2.setBrojDanaGodisnjegOdmora(0);
        godisnji = menadzer2.bonusGodisnjiOdmor();
        assert godisnji;
        assert menadzer2.getBrojDanaGodisnjegOdmora() == 4;

        menadzer2.setUspesneProdaje(9);
        menadzer2.setBrojDanaGodisnjegOdmora(0);
        godisnji = menadzer2.bonusGodisnjiOdmor();
        assert !godisnji;
        assert menadzer2.getBrojDanaGodisnjegOdmora() == 0;

        //endregion
        System.out.println(menadzer1.ispis());
        System.out.println("Testovi za klasu menadzer prosli!");
    }
}
