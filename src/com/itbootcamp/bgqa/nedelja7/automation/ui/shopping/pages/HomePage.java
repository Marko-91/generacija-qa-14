package com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver webDriver;
    private final String MODAL_HEADING_XPATH = "/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]";
    private final String MODAL_HEADING_TEXT = "Added!";
    private final String HOME_PAGE = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]";
    private final String ADD_TO_CART = "/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]";
    private final String VIEW_CART_BTN = "/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/p[2]/a[1]";

    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
    private WebElement loginNavBar;

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

    public void clickOnHome(){
        WebElement home = webDriver.findElement(By.xpath(HOME_PAGE));
        home.click();
    }

    public void clickLogin() {
        loginNavBar.click();
    }
    private WebElement getDress(int dressNumber) {
        if (dressNumber < 2 || dressNumber > 35) {
            throw new IllegalArgumentException(String.format("The dress number %d is not available", dressNumber));
        }
        return webDriver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[" + dressNumber + "]"));
    }
    public void scrollToDress(int dressNumber) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", getDress(dressNumber));
    }
    public void hoverToDress(int dressNumber) {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(getDress(dressNumber)).perform();
    }
    public void clickToAddCartButton() {
        WebElement addToCard = webDriver.findElement(By.xpath(ADD_TO_CART));
        addToCard.click();
    }
    public void clickToViewCartButton() {
        WebElement viewCart = webDriver.findElement(By.xpath(VIEW_CART_BTN));
        viewCart.click();
    }

}
