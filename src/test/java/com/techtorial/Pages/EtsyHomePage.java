package com.techtorial.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EtsyHomePage {
    WebDriver driver;

    public EtsyHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "golabal-enhancements-search-query")
    WebElement searchField;

    @FindBy(id = "register")
    WebElement register;

    @FindBy(xpath = "//a[@href='https:www.etsy.com/cart?ref=hdr-cart']" )
    WebElement cart;

    @FindBy(xpath = "input[@name='Any price']")
    public WebElement anyPrice;

    @FindBy(id="catnav-primary-link-10855")
    public WebElement jewelpage;



    }

