package com.itbootcamp.bgqa.nedelja7;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

    @Test
    public void softAssertTest() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(12 == 13);
        softAssert.assertFalse(12 == 13);
        softAssert.assertEquals("cao", "cao");

        softAssert.assertAll("Svi asertovi treba da prodju");

    }
}
