package com.techtorial.Tests.TestNGParameterPractice;

import com.techtorial.Utils.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.util.concurrent.TimeUnit;

public class TestBase {


    public WebDriver driver;

    @Parameters("driverName")
    @BeforeClass(alwaysRun = true)
    public void setUpDriver(String driverName) {
        driver = DriverUtil.driverSetup(driverName);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    //@AfterClass
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


}