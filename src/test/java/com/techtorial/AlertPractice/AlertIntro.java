package com.techtorial.AlertPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AlertIntro {

    @org.testng.annotations.Test
    public void alertIntro() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com");
        WebElement alertlink=driver.findElement(By.xpath("//a[@href='jacascript_alerts'"));
        WebElement alertbutton=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        alertbutton.click();
        Thread.sleep(3000);

        driver.switchTo().alert().dismiss();

    }

    @Test
    public void alertWithText() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com");
        WebElement alertlink=driver.findElement(By.xpath("//a[@href='jacascript_alerts'"));
        WebElement alertbutton=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        alertbutton.click();
        Thread.sleep(3000);

        driver.switchTo().alert().sendKeys("Techtorial");
        driver.switchTo().alert().accept();

    }
}
