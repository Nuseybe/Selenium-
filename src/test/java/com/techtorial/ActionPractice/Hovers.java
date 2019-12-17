package com.techtorial.ActionPractice;


import com.techtorial.Utils.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hovers {


    static WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("Chrome");
    }


    @Test
    public void hoverover() {
        Actions actions = new Actions(driver);
        driver.get("http://the-internet.herokuapp.com/");
        WebElement hoverbutton = driver.findElement(By.xpath("//a[@href='/hovers']"));
        hoverbutton.click();
        WebElement hovers = driver.findElement(By.xpath("//h3"));
        Assert.assertEquals("Hovers", hovers.getText());
        actions.moveToElement(driver.findElement(By.xpath("//a[@href='/users/2']/../../img"))).perform();
        WebElement username = driver.findElement(By.xpath("//a[@href='/users/2']//preceding-sibling::h5"));
        Assert.assertTrue(username.getText().contains("user2"));
    }
}