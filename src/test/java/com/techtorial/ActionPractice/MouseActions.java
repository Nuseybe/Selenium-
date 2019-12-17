package com.techtorial.ActionPractice;


import com.techtorial.Utils.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MouseActions {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("CHROME");
    }
    //Driver first time initialized in this line.

    @Test
    public void test1(){

        driver=DriverUtil.driverSetup("Chrome");
        //Because it initialized in the first line it won't in this line because of singleton pattern.
        driver=DriverUtil.driverSetup("ff");
        //the same for this line also.
    }
    @Test
    public void mouseActionsIntro(){
        Actions actions=new Actions(driver);

        WebElement webElement=driver.findElement(By.xpath(""));

        //for double click
        actions.doubleClick();

        //right click
        actions.contextClick(webElement).perform();

        //hover over
        actions.moveToElement(webElement).perform();

        //drag and drop
        WebElement sourceElement=driver.findElement(By.xpath(""));
        WebElement targetElement=driver.findElement(By.xpath(""));

        actions.dragAndDrop(sourceElement, targetElement);

    }
}
