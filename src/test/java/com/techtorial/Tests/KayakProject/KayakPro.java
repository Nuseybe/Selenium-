package com.techtorial.Tests.KayakProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.techtorial.Utils.DriverUtil;


public class KayakPro {

    static WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("Chrome");

    }
    @Test
    public void signIn() throws InterruptedException{
        driver.get("https://www.kayak.com");
        WebElement signInIcon=driver.findElement(By.xpath("//div[contains(text(),'Sign in')]"));
        signInIcon.click();
        Thread.sleep(2000);
        WebElement emailEnter=driver.findElement(By.xpath("//input[@name='username']"));
        emailEnter.sendKeys("nnyagmur@gmail.com");
        WebElement passwordEnter=driver.findElement(By.xpath("//input[@name='passwd']"));
        passwordEnter.sendKeys("techtorial2200");
        Thread.sleep(2000);
        WebElement singInButton=driver.findElement(By.xpath("//button[@title='Sign in']"));
        singInButton.click();
    }



}
