package com.itbootcamp.bgqa.nedelja6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

public class TestLinkBootcamp {

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));

        WebDriver wd = new ChromeDriver();

        wd.get("https://itbootcamp.rs/");

        List<WebElement> webElement = wd.findElements(By.tagName("a"));

        HttpURLConnection httpURLConnection = null;
        for (WebElement element : webElement) {
            String link = element.getAttribute("href");

            if (link != null && link.contains("http")) {
                System.out.println(link);
                httpURLConnection = (HttpURLConnection) (new URL(link)).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();

                System.out.println(httpURLConnection.getResponseCode());
            }
        }

//        webElement.stream()
//                .map(linkWebElement -> linkWebElement.getAttribute("href"))
//                .filter(href -> href != null && href.contains("http"))
//                .map(href -> openConnection(href))
//                .forEach(connection -> System.out.println(getResponseCode("GET", connection)));
    }

    private static HttpURLConnection openConnection(String url) {
        try {
            return (HttpURLConnection) (new URL(url)).openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static int getResponseCode(String requestMethod, HttpURLConnection connection) {
        try {
            connection.setRequestMethod(requestMethod);
            connection.connect();
            return connection.getResponseCode();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;

    }
}
