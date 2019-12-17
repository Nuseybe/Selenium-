package com.techtorial.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

    public static void main (String [] args){

        System.setProperty("webdriver.chrome.driver", "src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.expedia.com");
        WebElement flightTab = driver.findElement(By.xpath("button[@id='tab-flight-tab-hp']"));
        flightTab.click();
        driver.findElement(By.xpath("//button[@id='tab-flight-tab-hp']")).click();
        driver.findElement(By.xpath("//button[@id='tab-flight-tab-hp']")).click();
        //input[@id='flight-origin-hp-flight']
        WebElement flyingFrom=driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']"));
        WebElement flyingTo = driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']"));
        //flyingFrom.click();
        flyingFrom.sendKeys("Chicago");







    }


}
