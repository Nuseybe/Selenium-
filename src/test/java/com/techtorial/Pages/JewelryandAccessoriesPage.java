package com.techtorial.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryandAccessoriesPage {
    WebDriver driver;

  public JewelryandAccessoriesPage(WebDriver driver){
      this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//input[@aria-label='Any price']")
    public WebElement anyPrice;
    @FindBy (xpath = "/a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=&max=25&price_bucket=1']")
    public WebElement Under25;
    @FindBy(xpath ="//a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=25&max=50&price_bucket=1']")
    public WebElement twentyfivetofifty;
    @FindBy(xpath = "//a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=50&max=100&price_bucket=1']")
   public  WebElement fiftytohundred;
    @FindBy(xpath = "//a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=100&max=&price_bucket=1']")
   public WebElement over100;
    @FindBy(id="ship_to_select")
    public WebElement shipTo;


    /*
    @FindBy(id="a") "Basically we can use FindBy also for findElements."
    public List<WebElement>elementList;
     */



    }


