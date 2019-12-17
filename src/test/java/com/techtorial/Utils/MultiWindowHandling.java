package com.techtorial.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class MultiWindowHandling {
    @Test
    public void windowIntro(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");

        WebElement windowlink=driver.findElement(By.xpath("//a[@href='/windows']"));
        windowlink.click();
        //get the original window handle
        String originalWindowHandle=driver.getWindowHandle();

        WebElement clickherelink=driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickherelink.click();

        //get all window handles
        Set<String>SetOfWindowHandles=driver.getWindowHandles();
        String secondWindowHandle= "";
        for (String dh: SetOfWindowHandles){
            if (!dh.equalsIgnoreCase(originalWindowHandle)){
                secondWindowHandle=dh;
            }
        }
        driver.switchTo().window(secondWindowHandle);

        WebElement newWindowText=driver.findElement(By.xpath("//h3[.='New Window']"));
        System.out.println("new window text is :" + newWindowText.getText());




        /*
        click on click
        get new window text from new opened window
        print it out
         */

    }
}
