package com.techtorial.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleSelect {
    @Test
    public void radioButton() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement bmw = driver.findElement(By.xpath("// input[@id='bmwradio']"));
        bmw.click();
    }
    @Test
    public void checkBox() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement cars = driver.findElement(By.xpath(" //select[@id='carselect']"));
        cars.click();

    }

    @Test
    public void mutlipleSelect() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement selectList = driver.findElement(By.id("multiple-select-example"));
        Select select = new Select(selectList);
        select.selectByVisibleText("Apple");
        select.selectByVisibleText("Orange");
        select.selectByVisibleText("Peach");
        Thread.sleep(10);
        select.deselectByVisibleText("Peach");

        /*WebElement option1= driver.findElement(By.xpath("//option[@value='Apple']"));
        WebElement option2= driver.findElement(By.xpath("//option[@value='Orange']"));
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).click(option1).click(option2).build().perform();*/
    }

    @Test
    public void newWindow(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement newTab = driver.findElement(By.xpath("//button[@id='openwindow']"));
        String firstWindowTitle= driver. getTitle();
        System.out.println("First window title is "+ firstWindowTitle);
        String firstWindowHandle= driver.getWindowHandle();
        newTab.click();
        String secondWindowHandle=driver.getWindowHandle();
        for (String handle: driver.getWindowHandles()){
            if (!handle.equalsIgnoreCase(firstWindowHandle)) {
                secondWindowHandle = handle;
            }
        }
        driver.switchTo().window(secondWindowHandle);
        String secondWindowTitle=driver.getTitle();
        Assert.assertFalse(firstWindowTitle.equalsIgnoreCase(secondWindowTitle));

    }

    @Test
    public void slider() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/horizontal_slider");
        WebElement slide = driver.findElement(By.xpath("//input[@type='range']"));
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.clickAndHold(slide).moveByOffset(40, 0).perform();
        Assert.assertTrue(slide.equals(slide));

    }

}
