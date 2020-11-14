package Configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Timeouts{
     void implicit_wait(WebDriver dr){
        dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    void Fluent_wait(WebDriver dr){
        Wait<WebDriver> wait=new FluentWait<WebDriver>(dr)
                                .withTimeout(Duration.ofSeconds(40))
                                .pollingEvery(Duration.ofSeconds(30))
                                .ignoring(NoSuchElementException.class);
    }
    void explicit_wait(WebElement ele,WebDriver dr){
        WebDriverWait wait=new WebDriverWait(dr,Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(ele));
    }
}
