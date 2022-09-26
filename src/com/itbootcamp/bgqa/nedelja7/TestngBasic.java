package com.itbootcamp.bgqa.nedelja7;

import org.testng.Assert;
import org.testng.annotations.Test;

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


}
