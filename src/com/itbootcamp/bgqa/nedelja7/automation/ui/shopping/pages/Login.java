package com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    private WebDriver webDriver;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]")
    private WebElement name;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]")
    private WebElement email;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/button[1]")
    private WebElement button;

    public Login(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this); // ucitaj sve elemente na web stranici
    }

    public void inputNameField(String name) {
        this.name.sendKeys(name);
    }

    public void clickSingUp() {
        this.button.click();
    }

    public void inputEmailField(String email) {
        this.email.sendKeys(email);
    }
}
