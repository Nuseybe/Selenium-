package com.techtorial.Tests.TestNGParameterPractice;

import com.techtorial.Pages.OrangeHRMPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class OrangeHRMTest extends TestBase {
    @Test
    public void loginTest(String orangeUsername, String orangePassword) throws InterruptedException {
        OrangeHRMPage orange = new OrangeHRMPage(driver);
        driver.get("https://orangehrm-demo-6x.orangehrmlive.com");
        orange.username.clear();
        orange.username.sendKeys("admin");
        orange.password.clear();
        orange.password.sendKeys("admin123");
        orange.login.click();
        if (orangeUsername.equals("admin") & orangePassword.equals("admin123")) {

            String actual = orange.pageTitle.getText();
            String expected = "Dashboard";
            //Expected comes from the requirements
            Assert.assertEquals(expected, actual);

            orange.dropDownButton.click();


        }
    }
}