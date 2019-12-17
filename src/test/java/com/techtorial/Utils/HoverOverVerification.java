package com.techtorial.Utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HoverOverVerification {
    static WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("Chrome");
    }

    @Test
    public void Hovering() throws InterruptedException{
        Actions actions=new Actions(driver);
        driver.get("http://the-internet.herokuapp.com/");
        WebElement gohoverpage=driver.findElement(By.xpath("//a[@href='/hovers']"));
        gohoverpage.click();
        WebElement avatar1=driver.findElement(By.xpath("//a[@href='/users/1']"));
        WebElement avatar2=driver.findElement(By.xpath("//a[@href='/users/2']"));
        WebElement avatar3=driver.findElement(By.xpath("//a[@href='/users/3']"));
        WebElement avataruser1=driver.findElement(By.xpath("//a[@href='/users/1']/../../img"));
        WebElement avataruser2=driver.findElement(By.xpath("//a[@href='/users/2']/../../img"));
        WebElement avataruser3=driver.findElement(By.xpath("//a[@href='/users/3']/../../img"));
        Thread.sleep(3000);
        Assert.assertFalse(avatar1.isDisplayed());
        Assert.assertFalse(avatar2.isDisplayed());
        Assert.assertFalse(avatar3.isDisplayed());
        Thread.sleep(3000);

        actions.moveToElement(avataruser1).build().perform();
        Assert.assertTrue(avatar1.isDisplayed());
        Assert.assertFalse(avatar2.isDisplayed());
        Assert.assertFalse(avatar3.isDisplayed());
        Thread.sleep(3000);

        actions.moveToElement(avataruser2).build().perform();
        Assert.assertFalse(avatar1.isDisplayed());
        Assert.assertTrue(avatar2.isDisplayed());
        Assert.assertFalse(avatar3.isDisplayed());

        Thread.sleep(3000);
        actions.moveToElement(avataruser3).build().perform();
        Assert.assertFalse(avatar1.isDisplayed());
        Assert.assertFalse(avatar2.isDisplayed());
        Assert.assertTrue(avatar3.isDisplayed());





    }
}