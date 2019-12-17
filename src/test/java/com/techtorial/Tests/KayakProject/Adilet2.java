package com.techtorial.Tests.KayakProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.techtorial.Utils.DriverUtil;

public class Adilet2 {

    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver= DriverUtil.driverSetup("chrome");
    }
    @Test
    public void PriceFilter() throws InterruptedException {
        driver.get("https://www.kayak.com/cruises");
        Thread.sleep(2000);
        WebElement anyPort=driver.findElement(By.xpath("//div[@class='originField col col-1-2-m col-4-16-l']"));
        anyPort.click();
        Thread.sleep(2000);
        WebElement Choose=driver.findElement(By.xpath("//li[@data-title='Cape Canaveral']"));
        Choose.click();
        Thread.sleep(2000);
        WebElement AllDestin=driver.findElement(By.xpath("//div[@class='locationField col col-1-2-m col-5-16-l']"));
        AllDestin.click();
        Thread.sleep(2000);
        WebElement ChooseDes=driver.findElement(By.xpath("//li[@data-title='Caribbean']"));
        ChooseDes.click();
        Thread.sleep(2000);
        WebElement allCruiseLine=driver.findElement(By.xpath("//div[@class='cruiselineField col col-1-2-m col-4-16-l']"));
        allCruiseLine.click();
        Thread.sleep(2000);
        WebElement ChooseCrLine=driver.findElement(By.xpath("//li[@data-title='Carnival Cruise Lines']"));
        ChooseCrLine.click();
        Thread.sleep(2000);
        WebElement month=driver.findElement(By.xpath("//div[@class='depdateField col col-1-2-m col-3-16-l']"));
        month.click();
        Thread.sleep(2000);
        WebElement chooseMonth=driver.findElement(By.xpath("//li[@data-title='March 2020']"));
        chooseMonth.click();
        Thread.sleep(2000);
        WebElement search=driver.findElement(By.xpath("//button[@class='Common-Widgets-Button-StyleJamButton size-m _id7 _ihr _ihs _h-Y _im4 _ii0 _ihp _ihq _inw _iir _iae _jWT _iFQ _iFR _imQ _iv1']"));
        Thread.sleep(2000);
        search.click();
//         WebElement price=driver.findElement(By.xpath("//div[@class='Common-Results-Filters-Filter Common-Results-Filters-SimpleRangeFilter price hdropdown']"));
//         Thread.sleep(2000);
//         price.click();
    }


}
