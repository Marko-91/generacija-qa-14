package com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ViewCart {

    private WebDriver webDriver;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/img[1]")
    private WebElement slika;
    /*
    @FindBy(className = "className")
    @FindBy(css = "nekiAtribut")

    public WebElement getSlika() { ovo je isto sto i @FindBy sa odredjenim xpath
        return webDriver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/img[1]"));
    }
     */

    /*
    @FindBys({
            @FindBy(xpath = "xpath1"),
            @FindBy(xpath = "xpath2")
    })
    private List<WebElement> webElementList;
    private List<WebElement> vratiListuElemenata() {
        return webDriver.findElements(By.xpath("nekiXpath"));
    }
     */



    public ViewCart(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this); // ucitaj sve elemente na web stranici
    }

    public String getFirstSrcAttr() {
        return slika.getAttribute("src");
    }

}
