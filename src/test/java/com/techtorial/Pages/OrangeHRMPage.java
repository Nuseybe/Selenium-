package com.techtorial.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

import static com.techtorial.Utils.DriverUtil.driver;
import static com.techtorial.Utils.DriverUtil.driverSetup;

public class OrangeHRMPage {
    //Without PageFactory.initElements method your elements will not be initialized.
    //Meaning you cannot use your elements.
    @Parameters("driverName")
    public OrangeHRMPage(WebDriver driver){


        PageFactory.initElements(driver, this);
    }
    //I want to store my elements.
    @FindBy(css = ".nav-search-scope.nav-sprite")
    public WebElement anyElement;
    @FindBy(id = "txtUsername")
    public WebElement username;
    @FindBy (id = "txtPassword")
    public WebElement password;
    @FindBy (id = "btnLogin")
    public WebElement login;
    @FindBy (className = "page-title")
    public WebElement pageTitle;
    @FindBy (id = "user-dropdown")
    public WebElement  dropDownButton;
    @FindBy (id = "logoutLink")
    public WebElement logout;
    @FindBy (className = "dashboardCard-title-for-card")
    public WebElement retrytext;

}
