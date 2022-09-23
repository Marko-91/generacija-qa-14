package com.itbootcamp.bgqa.nedelja6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));

        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();

        wd.get("https://demoqa.com/alerts");

        WebElement webElement = wd.findElement(By.id("alertButton"));
        clickAndAccept(webElement, wd);
        webElement.click();
        wd.switchTo().alert().accept();

        WebElement timerAlertButton = wd.findElement(By.id("timerAlertButton"));
        timerAlertButton.click();
        new WebDriverWait(wd, Duration.ofSeconds(5)).until(ExpectedConditions.alertIsPresent());
        wd.switchTo().alert().accept();

        WebElement confirmButton = wd.findElement(By.id("confirmButton"));
        clickAndAccept(confirmButton, wd);
        WebElement confirmResult1 = wd.findElement(By.id("confirmResult"));
        System.out.println(confirmResult1.getText().contains("Ok"));
        confirmButton.click();
        wd.switchTo().alert().dismiss();
        System.out.println(confirmResult1.getText().contains("Cancel"));

        WebElement promtButton = wd.findElement(By.id("promtButton"));
        promtButton.click();
        wd.switchTo().alert().sendKeys("test");
        wd.switchTo().alert().accept();
        WebElement promptResult = wd.findElement(By.id("promptResult"));
        System.out.println(promptResult.getText().contains("test"));

    }

    private static void clickAndAccept(WebElement webElement, WebDriver webDriver) {
        webElement.click();
        webDriver.switchTo().alert().accept();
    }

    private static void clickWaitAndAccept(WebElement webElement, WebDriver webDriver) {

    }

    private static void clickSendKeysAndAccept(WebElement webElement, WebDriver webDriver) {

    }
}
