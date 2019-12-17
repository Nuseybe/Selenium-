package com.techtorial.Tests.TestNGParameterPractice;

import com.techtorial.Pages.OrangeHRMPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHRMDataProvider extends TestBase {

    @DataProvider(name = "Credentials")
    public static Object[][] credential() {
        return new Object[][]{{"admin", "admin123"}, {"testUserName", "testPassword"}};

    }

    @Test(dataProvider = "Credentials")
    public void loginPageTest(String orangeUsername, String orangePassword) throws InterruptedException {
        OrangeHRMPage orange = new OrangeHRMPage(driver);
        driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
        Thread.sleep(2000);
        orange.username.clear();
        orange.username.sendKeys(orangeUsername);
        Thread.sleep(2000);
        orange.password.clear();
        orange.password.sendKeys(orangePassword);
        orange.login.click();
        if (orangeUsername.equals("admin") & orangePassword.equals("admin123")) {

            String actual = orange.pageTitle.getText();
            String expected = "Dashboard";
            //Expected comes from the requirements
            Assert.assertEquals(expected, actual);

            orange.dropDownButton.click();
            orange.logout.click();
        } else {
            String actual = orange.retrytext.getText();
            String expected = "Retry Login";
            Assert.assertEquals(expected, actual);
            driver.navigate().back();


        }
    }
}