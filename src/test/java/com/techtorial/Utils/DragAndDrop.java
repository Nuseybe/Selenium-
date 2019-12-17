package com.techtorial.Utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragAndDrop {
    WebDriver driver;
    @BeforeClass
    public void setup() {
    }

    @Test
    public void DragandDrop(){
        Actions actions=new Actions(driver);
        driver.get("http://the-internet.herokuapp.com");
        WebElement dragD = driver.findElement(By.xpath("//a[@href='/drag_and_drop']"));
        dragD.click();
        WebElement sourceELement = driver.findElement(By.id("column-a"));
        WebElement targetElement= driver.findElement(By.id("column-b"));
        actions.dragAndDrop(sourceELement,targetElement).perform();
    }
}
