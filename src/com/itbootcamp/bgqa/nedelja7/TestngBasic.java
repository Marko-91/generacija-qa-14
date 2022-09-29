package com.itbootcamp.bgqa.nedelja7;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TestngBasic {

    @Test
    public void test1() {
        String testExpected = "cao";
        //dohvatanje podatka...
        //izvrsavanje neke akcije
        String testActual = "ca";

        Assert.assertEquals(testActual, testExpected, "Poruke treba da budu jedanke");
    }

    @Test
    public void test2() {
        String testExpected = "cao";
        //dohvatanje podatka...
        //izvrsavanje neke akcije
        String testActual = "cao";

        Assert.assertEquals(testActual, testExpected, "Poruke treba da budu jedanke");
    }

    @Test
    public void test3() {
        int x = 10;
        int y = 5;

        Assert.assertTrue(x - y == 5, "rezultat bi trebalo da bude 5");
    }

    @Test
    public void test4() {
        Assert.assertFalse(true, "...should be false");
    }

    @DataProvider(name = "myDataProvider")
    public Object[][] createData1() {
//        Object[][] mojaMatrica = new Object[2][3];
//        mojaMatrica[0][0] = "Cedric";
//        mojaMatrica[0][1] = "Zarkovic";
//        mojaMatrica[0][2] = 36;
//
//        mojaMatrica[1][0] = "Anne";
//        mojaMatrica[1][1] = "Zarkovic";
//        mojaMatrica[1][2] = 37;
//
//        return mojaMatrica;
        return new Object[][] {
                { "Cedric", "Zarkovic", 36},
                { "Anne", "Zarkovic", 37},
                { "Kevin", "Zarkovic", 37},
                { "Dusan", "Zarkovic", 37}

        };
    }

    @Test(dataProvider = "myDataProvider")
    public void verifyData1(String ime, String prezime, Integer godine) {
        System.out.println(ime + " " + prezime + " " + godine);
    }

    public static void main(String[] args) {

        String[][] matrica = new String[3][3];
        matrica[0][0] = "1";
        matrica[0][1] = "Marko";
        matrica[0][2] = "Markovic";

        matrica[1][0] = "2";
        matrica[1][1] = "Stefan";
        matrica[1][2] = "Stefanovic";

        matrica[2][0] = "3";
        matrica[2][1] = "Jovan";
        matrica[2][2] = "Jovanovic";

//        for (int i = 0; i < matrica.length; i++) {
//            for (int j = 0; j < matrica.length; j++) {
//                System.out.print(matrica[i][j] + " ");
//            }
//            System.out.println();
//        }

        System.out.println(Arrays.deepToString(matrica));

    }




}
