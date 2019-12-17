package com.techtorial.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtil {
    // driver, element
    /*
    This method will hover over the webElement.
    you need to pass the element and driver
     */

    public static void hover(WebElement element, WebDriver driver){
        Actions actions=new Actions(driver);
        actions.moveToElement(element).build().perform();
    }
    /*
    this method will take the text of the webElement and return the string
    you need to pass the element.
     */
    public static String getText(WebElement element){
        return element.getText();
    }
    /*
    this method will take the list of WebElement
    It will return list of text from webelements
     */
    public static List<String>getElementsText(List<WebElement>elements){
        List<String>textList=new ArrayList<>(); //REMINDER: we cannot instantiate interfaces!! Even though you already know right?? !!You can do it, I got trust in you, your dreams do too!!!
        for (WebElement el:elements){
            if (!el.getText().isEmpty()){
                textList.add(el.getText());

            }
        }
        return textList;
    }
    public static void visibilityOfElement(WebDriver driver, WebElement element, int time){
        WebDriverWait wait=new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    //clickable, visibilityOf,alertIsPresent most common. The ones we didn't use are HW.
    public void switchWindow(String targetTitle, WebDriver driver){
        String origin=driver.getWindowHandle();
        Set<String> allWindows=driver.getWindowHandles();
        for (String windows:allWindows){
            driver.switchTo().window(windows);
            if (driver.getTitle().equals(targetTitle)){
                return;
            }
        }
        driver.switchTo().window(origin);
    }
}
