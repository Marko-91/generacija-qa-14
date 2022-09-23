package com.itbootcamp.bgqa.nedelja6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));

        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();

        wd.get("https://demoqa.com/droppable");

        WebElement draggable = wd.findElement(By.id("draggable"));
        WebElement droppable = wd.findElement(By.id("droppable"));

        Actions actions = new Actions(wd);
        //actions.moveToElement(draggable);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) wd;
        //javascriptExecutor.executeScript("scroll(0, 100);");
        // koristite za male ekrane
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", draggable);


        actions.dragAndDrop(draggable, droppable).perform();
    }
}
