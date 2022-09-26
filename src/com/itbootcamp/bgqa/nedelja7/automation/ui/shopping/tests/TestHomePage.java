package com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.tests;

import com.itbootcamp.bgqa.nedelja6.PropertiesReader;
import com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestHomePage {

    private final static String MODAL_TITLE_EXPECTED = "Added!";

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
    @Test
    public void testAddToShoppingCard() {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));

        WebDriver wd = new ChromeDriver();
        wd.get("https://www.automationexercise.com/");
        wd.manage().window().maximize();
        HomePage homePage = new HomePage(wd);

        //region Idem na home
        WebElement home = wd.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]"));
        home.click();
        //endregion

        //region Scroll do prve haljine
        WebElement prvaHaljina = wd.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) wd;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", prvaHaljina);
        //endregion

        //region Hover na tu haljinu
        Actions actions = new Actions(wd);
        actions.moveToElement(prvaHaljina).perform();
        //endregion

        //region  Kliknemo 'add to card'
        WebElement addToCard = wd.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]"));
        addToCard.click();
        //endregion

        //region Potvrdimo da se pojavilo 'Added'
        Assert.assertEquals(homePage.getModalTitle(), MODAL_TITLE_EXPECTED, "The text should be added");
        //endregion

        //region Kliknemo view cart
        WebElement viewCart = wd.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/p[2]/a[1]"));
        viewCart.click();
        //endregion

        //region Potvrdimo da je haljina u korpi
        WebElement slika = wd.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/img[1]"));
        String actualUrl = slika.getAttribute("src");
        Assert.assertEquals(actualUrl, "https://www.automationexercise.com/get_product_picture/1", "the url should be 'get_product_picture/1'");
        //endregion

        wd.close();
    }

}
