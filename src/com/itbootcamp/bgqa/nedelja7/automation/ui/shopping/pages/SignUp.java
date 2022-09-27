package com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUp {

    private WebDriver webDriver;
    private Select select;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/label[1]/div[1]/span[1]/input[1]")
    private WebElement title;

    @FindBy(id = "name")
    private WebElement name;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "days")
    private WebElement days;

    @FindBy(id = "months")
    private WebElement months;

    @FindBy(id = "years")
    private WebElement year;

    @FindBy(id = "first_name")
    private WebElement firstName;

    @FindBy(id = "last_name")
    private WebElement lastName;

    @FindBy(id = "address1")
    private WebElement address1;

    @FindBy(id = "country")
    private WebElement country;

    @FindBy(id = "state")
    private WebElement state;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "zipcode")
    private WebElement zipcode;

    @FindBy(id = "mobile_number")
    private WebElement mobileNumber;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]")
    private WebElement createAccount;

    public SignUp(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this); // ucitaj sve elemente na web stranici
    }

    public SignUp(WebDriver webDriver, Select select) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this); // ucitaj sve elemente na web stranici
        this.select = select;
    }

    public void clickTitle() {
        this.title.click();
    }

    public void inputName(String name) {
        this.name.sendKeys(name);
    }

    public void inputPassword(String password) {
        this.password.sendKeys(password);
    }

    public void selectDays(int value) {
        Select dropdown = new Select(this.days);
        dropdown.selectByValue(String.valueOf(value));
    }

    public void selectMonths(String month) {
        Select dropdown = new Select(this.months);
        dropdown.selectByVisibleText(month);
    }

    public void selectYear(int year) {
        Select dropdown = new Select(this.year);
        dropdown.selectByValue(String.valueOf(year));
    }

    public void inputFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void inputAddress(String address) {
        this.address1.sendKeys(address);
    }

    public void selectCountry(String country) {
        Select dropdown = new Select(this.country);
        dropdown.selectByVisibleText(country);
    }

    public void inputState(String state) {
        this.state.sendKeys(state);
    }

    public void inputCity(String city) {
        this.city.sendKeys(city);
    }

    public void inputZipcode(String zipcode) {
        this.zipcode.sendKeys(zipcode);
    }

    public void inputMobile(String number) {
        this.mobileNumber.sendKeys(number);
    }

    public void createAccount() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", this.createAccount);
        this.createAccount.click();
    }
}
