/*package test.java.com.techtorial;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.graalvm.compiler.nodes.debug.WeakCounterNode;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class CheckBoxRadioButtonIntro {
    @Test
    public void checkbox1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");

        WebElement checkboxLink = driver.findElement(By.xpath("//a[@href='checkboxes']"));
        checkboxLink.click();

        WebElement checkboxLink1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkboxLink1.click();
        Assert.assertTrue(checkboxLink1.isSelected());

    }

    @Test
    public void checkbox2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");

        WebElement checkboxLink = driver.findElement(By.xpath("//a[@href='checkboxes']"));
        checkboxLink.click();
        List<WebElement> listOfElements = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement checkbox : listOfElements) {
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        }
    }
}
*/