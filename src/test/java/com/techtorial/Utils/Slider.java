package com.techtorial.Utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Slider {
    static WebDriver driver;
    @BeforeClass
    public void setup(){
        driver= DriverUtil.driverSetup("Chrome");
    }

    @Test
    public void testSlider(){
        driver.get("http://the-internet.herokuapp.com/hovers");
        WebElement slider =driver.findElement(By.xpath("//input[@type='range']"));
        Actions actions=new Actions(driver);



    }
}
