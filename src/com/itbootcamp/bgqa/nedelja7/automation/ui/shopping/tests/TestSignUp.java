package com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.tests;

import com.github.javafaker.Faker;
import com.itbootcamp.bgqa.nedelja6.PropertiesReader;
import com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.pages.DashBoard;
import com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.pages.HomePage;
import com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.pages.Login;
import com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.pages.SignUp;
import com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.pages.ViewCart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSignUp {

    private WebDriver webDriver;
    private Login login;
    private SignUp signUp;
    private DashBoard dashBoard;
    private Select select;

    @BeforeMethod
    public void configure() {
        System.out.println("Ovo se izvrsva pre pokretanja test metode");
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        login = new Login(webDriver);
        signUp = new SignUp(webDriver);
        dashBoard = new DashBoard(webDriver);
        webDriver.get("https://www.automationexercise.com/login");
        webDriver.manage().window().maximize();
    }
    @Test
    public void testSingUp() {
        String name = Faker.instance().name().fullName();
        login.inputNameField(name);
        login.inputEmailField(Faker.instance().bothify("?????####@gmail.com"));
        login.clickSingUp();
        signUp.clickTitle();
        signUp.inputName(name);
        signUp.inputPassword(Faker.instance().bothify("??????????"));
        signUp.selectDays(2);
        signUp.selectMonths("January");
        signUp.selectYear(1991);
        signUp.inputFirstName(name);
        signUp.inputLastName(name);
        signUp.inputAddress(Faker.instance().address().streetAddress());
        signUp.selectCountry("India");
        signUp.inputState("India");
        signUp.inputCity("City");
        signUp.inputZipcode(Faker.instance().bothify("###########"));
        signUp.inputMobile(Faker.instance().phoneNumber().phoneNumber());
        signUp.createAccount();
        Assert.assertEquals(dashBoard.getAccountCreatedHeadingText(), "ACCOUNT CREATED!",
                "The message should be correct");
    }

    @AfterMethod
    public void close() {
        webDriver.close();
    }
}
