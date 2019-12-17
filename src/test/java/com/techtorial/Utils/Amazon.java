package com.techtorial.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Amazon {
    @Test
    public void iphoneSearchTest(){

    }

    @Test
    public void getAmazonPrices() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement searchField = driver.findElement(By.id("twotabsearchbox"));
        searchField.sendKeys("iphone" + Keys.ENTER);
        List<WebElement>list= driver.findElements(By.xpath("//a[class='a-link-normal a-text-normal']"));
        Assert.assertEquals(27, list.size());

    }
}