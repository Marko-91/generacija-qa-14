package com.itbootcamp.bgqa.nedelja6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DragNDrop {
    public static void main(String[] args) throws InterruptedException {
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

        WebElement droppableExampleTabAccept = wd.findElement(By.id("droppableExample-tab-accept"));
        droppableExampleTabAccept.click();
        WebElement acceptable = wd.findElement(By.id("acceptable"));
        WebElement dropabbleAccept = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]"));

        actions.dragAndDrop(acceptable, dropabbleAccept).perform();
        WebElement paragraf = wd.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/p[1]"));
        System.out.println(paragraf.getText().equals("Dropped!"));

        WebElement droppableExampleTabRevertable = wd.findElement(By.id("droppableExample-tab-revertable"));
        droppableExampleTabRevertable.click();

        WebElement revertable = wd.findElement(By.id("revertable"));
        Point pointBefore = revertable.getLocation();
        WebElement revertDragabbleDropped = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]"));
        actions.dragAndDrop(revertable, revertDragabbleDropped).perform();
        Thread.sleep(1000);
        //istraziti da li ima explicit wait koji ceka na lokaciju
        //new WebDriverWait(wd, Duration.ofSeconds(5)).until(ExpectedConditions.);

        Point pointAfter = revertable.getLocation();

        System.out.println(pointBefore.equals(pointAfter));
        wd.close();




    }
}
