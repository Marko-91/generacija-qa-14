package com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.tests;

import com.itbootcamp.bgqa.nedelja6.PropertiesReader;
import com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.pages.HomePage;
import com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.pages.Login;
import com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.pages.ViewCart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLogin {

    private WebDriver webDriver;
    private Login login;
    private HomePage homePage;

    @BeforeMethod
    public void configure() {
        System.out.println("Ovo se izvrsva pre pokretanja test metode");
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));
        webDriver = new ChromeDriver();
        homePage = new HomePage(webDriver);
        login = new Login(webDriver);
        webDriver.get("https://www.automationexercise.com/");
        webDriver.manage().window().maximize();
    }

    @Test(dataProvider = "invalidUsers")
    public void testInvalidAccountLogin(String email, String password) {
        homePage.clickLogin();
        login.inputEmailLoginExistingUserField(email);
        login.inputPasswordLoginExistingUserField(password);
        login.clickButtonLoginExistingUser();
        Assert.assertEquals(login.getTextLoginExistingUserIncorrectEmailOrPassword(),
                "Your email or password is incorrect!",
                "invalid password or user name message should popup");
    }

    @DataProvider(name = "invalidUsers")
    public Object[][] getInvalidUserNamesAndPasswords() {
        return new Object[][] {
                {"test1@test.com", "password1"},
                {"test2@test.com", "password2"},
                {"test3@test.com", "password3"},
                {"test4@test.com", "password4"},
                {"test5@test.com", "password5"}
        };
    }

    @AfterMethod
    public void close() {
        webDriver.close();
    }
}
