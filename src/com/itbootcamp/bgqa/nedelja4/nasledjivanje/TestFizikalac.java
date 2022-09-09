package com.itbootcamp.bgqa.nedelja4.nasledjivanje;

public class TestFizikalac {
    public static void main(String[] args) {
        //region test scenario dodaj bonus
        Fizikalac fizikalac1 =
                new Fizikalac("Zarko", "Zarkovic", 123, 1000, 0, 0, 10);

        fizikalac1.setBrojRadnihSubota(1);
        fizikalac1.dodajBonus();
        assert fizikalac1.getMesecnaPlata() == 1010.0;
        //endregion
        //region test scenario bonus godisnji odmor
        Fizikalac fizikalac2 =
                new Fizikalac("Zarko", "Zarkovic", 123, 1000, 0, 0, 10);

        fizikalac2.setBrojRadnihSubota(4);
        boolean godisnji = fizikalac2.bonusGodisnjiOdmor();
        assert godisnji;

        fizikalac2.setBrojRadnihSubota(3);
        godisnji = fizikalac2.bonusGodisnjiOdmor();
        assert !godisnji;

        fizikalac2.setBrojRadnihSubota(17);
        fizikalac2.setBrojDanaGodisnjegOdmora(0);
        godisnji = fizikalac2.bonusGodisnjiOdmor();
        assert godisnji;
        assert fizikalac2.getBrojDanaGodisnjegOdmora() == 4;

        fizikalac2.setBrojRadnihSubota(3);
        fizikalac2.setBrojDanaGodisnjegOdmora(0);
        godisnji = fizikalac2.bonusGodisnjiOdmor();
        assert !godisnji;
        assert fizikalac2.getBrojDanaGodisnjegOdmora() == 0;


        //endregion
        System.out.println(fizikalac1);
        System.out.println("Testovi za klasu fizikalac prosli!");
    }
}
