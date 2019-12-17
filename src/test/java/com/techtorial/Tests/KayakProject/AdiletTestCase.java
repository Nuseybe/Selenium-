package com.techtorial.Tests.KayakProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.techtorial.Utils.DriverUtil;


public class AdiletTestCase {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver= DriverUtil.driverSetup("chrome");
    }

    @Test
    public void GotoWebPage() throws InterruptedException {
        driver.get("https://www.kayak.com/cruises");
        Thread.sleep(2000);
        WebElement anyport = driver.findElement(By.xpath("(//div[@class='Common-Widgets-Select-StyleJamSelect '])[1]"));
        anyport.click();
        Thread.sleep(1000);
        WebElement ClickM = driver.findElement(By.xpath("//li[@data-title='Miami']"));
        ClickM.click();
        Thread.sleep(2000);
        WebElement AllDestination = driver.findElement(By.xpath("//div[@class='locationField col col-1-2-m col-5-16-l']"));
        Thread.sleep(1000);
        AllDestination.click();
        WebElement ChooseB = driver.findElement(By.xpath("//li[@data-title='Bahamas']"));
        Thread.sleep(2000);
        ChooseB.click();
        WebElement AllCruiseLine = driver.findElement(By.xpath("//div[@class='cruiselineField col col-1-2-m col-4-16-l']"));
        Thread.sleep(1000);
        AllCruiseLine.click();
        WebElement ChooseCruise = driver.findElement(By.xpath("//li[@data-title='Avalon Waterways']"));
        Thread.sleep(2000);
        ChooseCruise.click();
        WebElement ClickMonth = driver.findElement(By.xpath("//div[@class='depdateField col col-1-2-m col-3-16-l']"));
        Thread.sleep(1000);
        ClickMonth.click();
        WebElement ChooseMonth = driver.findElement(By.xpath("//li[@data-title='December 2019']"));
        Thread.sleep(2000);
        ChooseMonth.click();
        WebElement search = driver.findElement(By.xpath("//button[@class='Common-Widgets-Button-StyleJamButton size-m _id7 _ihr _ihs _h-Y _im4 _ii0 _ihp _ihq _inw _iir _iae _jWT _iFQ _iFR _imQ _iv1']"));
        Thread.sleep(2000);
        search.click();
    }

}
