package com.itbootcamp.bgqa.nedelja6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogType;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class SeleniumHelloWorld {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\marko.stankovic\\itbootcamp\\materijali\\webdrivers\\chrome\\105\\chromedriver.exe");



        WebDriver wd = new ChromeDriver();

        wd.get("https://demoqa.com/");
        wd.manage().window().maximize(); // maksimizuje prozor
        Thread.sleep(1000); // pauziraj ovu nit (thread) za 5 sekundi
        String url = wd.getCurrentUrl();
        System.out.println("URL: " + url);
        String title = wd.getTitle();
        System.out.println("Title: " + title);

        wd.navigate().refresh();
        wd.navigate().back();
        wd.navigate().forward();
        Set<String> logTypes = wd.manage().logs().getAvailableLogTypes();
        System.out.println(logTypes);
        System.out.println(wd.manage().logs().get(LogType.BROWSER));
        wd.close(); // uglavnom na kraju testa



    }
}
