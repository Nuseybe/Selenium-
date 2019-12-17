package com.techtorial.Utils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

public class ScreenshotTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("Chrome");
    }

    @Test
    public void screenshotTest() {
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.id("asdlfkadfj"));
        System.out.println(element.getText());
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            long timestamp = System.currentTimeMillis();// We store it in File because it to store as a File.
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //First part is casting our driver to a different object. getScreenshotAs is what takes the screenshot.
            FileUtils.copyFile(srcFile, new File("src/test/java/screenshots/" + timestamp + ".jpg"));
        }
        driver.close();

    }
}