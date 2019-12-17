package com.techtorial.Utils;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class KeyPressEventIntro {

    static WebDriver driver;
    @BeforeClass
    public void setup(){
        driver= DriverUtil.driverSetup("Chrome");
    }

    @Test
    public void googleSearch(){
        driver.get("https://www.google.com");
        WebElement searchField=driver.findElement(By.xpath("//div[@class='vdLsw gsfi']"));
        searchField.click();
        searchField.sendKeys("selenium");
        WebElement clickSearch= driver.findElement(By.xpath("//ul/..//input[@value='Google Search']"));
        clickSearch.click();
        Actions actions=new Actions(driver);
        actions.keyDown(Keys.COMMAND).sendKeys("a").perform();


    }
}
