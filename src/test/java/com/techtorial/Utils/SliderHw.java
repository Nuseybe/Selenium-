package com.techtorial.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderHw {
    @Test
    public void slider() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/horizontal_slider");
        WebElement slide = driver.findElement(By.xpath("//input[@type='range']"));
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.clickAndHold(slide).moveByOffset(5, 10).perform();



    }
}
