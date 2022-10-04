package com.itbootcamp.bgqa.nedelja7.domaci;

import com.itbootcamp.bgqa.nedelja6.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class D_19_Milos_Kos {
    private static WebDriver wd;
    @BeforeMethod
    public void configure() {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));
        wd = new ChromeDriver();
    }
    @Test
    public void testPopunjavanjeForme() {

        wd.get("https://demoqa.com/text-box");

        WebElement inputName = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]"));
        inputName.sendKeys("TheBlackbird");

        WebElement email = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[2]/input[1]"));
        email.sendKeys("crnaptica@digi.rs");

        WebElement current = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/textarea[1]"));
        current.sendKeys("gnezdo na malom drvetu");

        WebElement permament = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/div[2]/textarea[1]"));
        permament.sendKeys("rupa u drvetu");

        WebElement submitButton = wd.findElement(By.id("submit"));
        submitButton.click();

        WebElement prosao = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]"));
        Assert.assertTrue(prosao.isDisplayed());

        wd.close();
    }
}
