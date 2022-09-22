package com.itbootcamp.bgqa.nedelja6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ImpliciteWaitSeleniumDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));

        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();
        // defaultno cekanje da se element pojavi pre nego li se izbaci exeception element not found
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        wd.get("https://demoqa.com/dynamic-properties");

        WebElement colorChange = wd.findElement(By.id("colorChange"));

        colorChange.click();

        //WebElement visibleAfter = wd.findElement(By.id("visibleAfter"));
        WebElement visibleAfter = new WebDriverWait(wd, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("visibleAfter")));

        System.out.println(visibleAfter.isDisplayed());
    }
}
