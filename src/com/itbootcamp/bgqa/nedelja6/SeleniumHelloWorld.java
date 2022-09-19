package com.itbootcamp.bgqa.nedelja6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class SeleniumHelloWorld {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\marko.stankovic\\itbootcamp\\materijali\\webdrivers\\chrome\\105\\chromedriver.exe");

        WebDriver wd = new ChromeDriver();

        wd.get("https://google.com/");
        Thread.sleep(1000);
        wd.close();


    }
}
