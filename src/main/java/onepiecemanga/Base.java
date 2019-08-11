package onepiecemanga;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Base {
    public WebDriver driver = new ChromeDriver();
    public void openBrowser(String URL){
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void closeBrowser(){
        driver.close();
    }

    public void click(By by){
        try {
            driver.findElement(by).click();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void sendKeys(By by, String text){
        try {
        	WebElement el = driver.findElement(by);
        	el.sendKeys(text);
        	el.submit();
        	
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
