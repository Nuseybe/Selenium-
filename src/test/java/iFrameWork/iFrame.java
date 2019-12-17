package iFrameWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class iFrame {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void iframe()throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        WebElement txtfield=driver.findElement(By.tagName("p"));
        String expectedTxt="Hello from Techtorial class!!!";
        txtfield.clear();

        txtfield.sendKeys(expectedTxt);
        System.out.println(txtfield.getText());
        Thread.sleep(3000);
        Assert.assertEquals(txtfield.getText(),"Failed to assert text in text box.");

    }
}