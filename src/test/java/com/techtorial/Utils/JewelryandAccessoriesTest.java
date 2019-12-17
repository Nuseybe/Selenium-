package com.techtorial.Utils;
import com.techtorial.Pages.JewelryandAccessoriesPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.techtorial.Pages.EtsyHomePage;
import java.io.File;
import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class JewelryandAccessoriesTest{
    static WebDriver driver;


    @BeforeClass
    public void setup() throws InterruptedException{
        driver = DriverUtil.driverSetup("Chrome");
    }

    @Test
    public void jaPage() throws InterruptedException{
        driver.get("https://www.etsy.com/");
        String expectedHomePageTtile="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertEquals(expectedHomePageTtile,driver.getTitle());
        EtsyHomePage tdd=new EtsyHomePage(driver);
        tdd.jewelpage.click();
        Thread.sleep(2000);
        JewelryandAccessoriesPage blah=new JewelryandAccessoriesPage(driver);
        blah.over100.click();
        Thread.sleep(2000);
        Select select=new Select(blah.shipTo);
        select.selectByVisibleText("Germany");

        String str = driver.findElement(By.xpath("//*[@id=\"ship_to_select\"]")).getText();
        assertTrue(str.contains("Germany"));
    }



    @AfterTest
    public void tearDown(ITestResult result) throws IOException {
        if (result.getStatus()==ITestResult.FAILURE){

            //timestamp = 1001001011343
            //timestamp = 1001001011344
            //timestamp = 1001001011345
            //timestamp = 1001001011346

            //generate 100 100 users
            //String username="usr";
            //usr-1001001011343
            //usr-1001001011344
            //usr-1001001011345
            //usr-1001001011346

            long timestamp=System.currentTimeMillis();// We store it in File because it to store as a File.
            File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //First part is casting our driver to a different object. getScreenshotAs is what takes the screenshot.
            FileUtils.copyFile(srcFile, new File("src/test/java/screenshots/" + timestamp + ".jpg"));
        }

        driver.close();
    }
}
