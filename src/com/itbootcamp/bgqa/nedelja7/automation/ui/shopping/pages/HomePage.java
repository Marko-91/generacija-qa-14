package com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver webDriver;
    private final String MODAL_HEADING_XPATH = "/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]";
    private final String MODAL_HEADING_TEXT = "Added!";

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this); // ucitaj sve elemente na web stranici
    }

    public String getModalTitle() {
        boolean elementFound = new WebDriverWait(webDriver, Duration.ofSeconds(2))
                .until(ExpectedConditions.textToBe(By.xpath(MODAL_HEADING_XPATH), MODAL_HEADING_TEXT));
        WebElement addedText = webDriver.findElement(By.xpath(MODAL_HEADING_XPATH));
        return addedText.getText();
    }
}
