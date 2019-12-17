package JavaScripExecuteIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.techtorial.Utils.DriverUtil.driver;

public class JSScriptIntro {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @Test
    public void jsTest(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.location='https://www.google.com'");

        String title=js.executeScript("return document.title").toString();
        System.out.println("My page title is" + title);

        driver.getCurrentUrl();
        String url=js.executeScript("return document.URL").toString( );


        //scroll down/up
        //driver.navigate().to("https://expedia.com);
        //js.executeScript("window.scrollBy(0,1500)");
        //Thread.sleep(4000);
        //js.executeScript("window.scrollBy(0,1500)");

        //generate custom alert
        //js.executeScript("alert('My custom alert')");

        //WebElement button=driver.findElement()
        driver.navigate().to("https://amazon.com");
        js.executeScript("document.getElementById('twotabsearchtextbox').value='iphone';");

    }
}
