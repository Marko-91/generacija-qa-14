package com.itbootcamp.bgqa.nedelja6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));

        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();

        wd.get("https://demoqa.com/alerts");

        WebElement webElement = wd.findElement(By.id("alertButton"));
        webElement.click();

        Thread.sleep(1000);
        wd.switchTo().alert().accept();
        wd.switchTo().alert().sendKeys("text");
        WebElement confirmButton = wd.findElement(By.id("confirmButton"));
        confirmButton.click();
    }
}
