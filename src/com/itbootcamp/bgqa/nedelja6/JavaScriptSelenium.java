package com.itbootcamp.bgqa.nedelja6;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptSelenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));

        WebDriver wd = new ChromeDriver();
        Dimension dimension = new Dimension(1000, 500);

        wd.manage().window().setSize(dimension);

        wd.get("https://demoqa.com/text-box");

        Thread.sleep(1000);

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) wd;

        WebElement textArea = wd.findElement(By.id("permanentAddress"));
        textArea.sendKeys("Zdravo...");
        //1resenje
        //javascriptExecutor.executeScript("console.log('zdravo')");
        //Thread.sleep(1000);
        //javascriptExecutor.executeScript("scroll(0, 100);");
        Thread.sleep(1000);
        //2resenje
        //2.1
        javascriptExecutor.executeScript("const elem = document.getElementById('permanentAddress');" +
                "elem.scrollIntoView(true)");
        //2.2
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", textArea);
        //3resenje
        Actions action = new Actions(wd);
        action.moveToElement(textArea).perform();

    }
}
