package com.techtorial.Utils;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class AmazonPrices {
    @Test
    public void getAmazonPrices() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement searchField = driver.findElement(By.id("twotabsearchbox"));
        searchField.sendKeys("laptop" + Keys.ENTER);

        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price']"));
        double totalPrice = 0;
        for (int i = 0; i < prices.size(); i++) {
            try {
                String priceStr = prices.get(i).getText().substring(1).replace("\n", ".");
                totalPrice = totalPrice + Double.parseDouble(priceStr);
            } catch (StringIndexOutOfBoundsException | NumberFormatException e) {
                System.out.println("some exception was thrown");

            }

            System.out.println("Total Price of products on the page is: " + totalPrice);
        }
    }
}
