package com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.tests;

import com.itbootcamp.bgqa.nedelja6.PropertiesReader;
import com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.pages.HomePage;
import com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.pages.ViewCart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestHomePage {

    private final static String MODAL_TITLE_EXPECTED = "Added!";
    private WebDriver webDriver;
    private HomePage homePage;
    private ViewCart viewCart;

//    @BeforeClass
//    public void preKlase() {
//        System.out.println("Pre pustanja u rad klase");
//    }

//    @BeforeGroups
//    @BeforeSuite
//    @BeforeTest
//    @BeforeSuite
//    public void logging() {
//        System.out.println(this.getClass().getSimpleName() + " is running...");
//    }

//    @BeforeGroups(groups = "acceptance")
    @BeforeMethod
    public void configure() {
        System.out.println("Ovo se izvrsva pre pokretanja test metode");
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));
        webDriver = new ChromeDriver();
        homePage = new HomePage(webDriver);
        viewCart = new ViewCart(webDriver);
        webDriver.get("https://www.automationexercise.com/");
        webDriver.manage().window().maximize();
    }

    /**
     * Test steps:
     * 1. Idem na home
     * 2. Scroll do prve haljine
     * 3. Hover na tu haljinu (koristimo Actions, moveToElement(element).perform()
     * 4. Kliknemo 'add to card'
     * 5. Potvrdimo da se pojavilo 'Added'
     * 6. Kliknemo view cart
     * 7. Potvrdimo da je haljina u korpi
     */
    @Test(groups = {"regression", "acceptance"})
    public void testAddToShoppingCardHappyPath() {

        homePage.clickOnHome();
        homePage.scrollToDress(2);
        homePage.hoverToDress(2);
        homePage.clickToAddCartButton();

        Assert.assertEquals(homePage.getModalTitle(), MODAL_TITLE_EXPECTED, "The text should be added");

        homePage.clickToViewCartButton();

        Assert.assertEquals(viewCart.getFirstSrcAttr(), "https://www.automationexercise.com/get_product_picture/1", "the url should be 'get_product_picture/1'");
    }

    @Test
    public void testAddToShoppingCardUnhappyPath() {
        homePage.clickOnHome();
        Assert.assertThrows(IllegalArgumentException.class, () -> homePage.scrollToDress(100));
    }

    @AfterMethod
    public void closeWebDriver() {
        webDriver.close();
    }

}
