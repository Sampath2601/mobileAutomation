package com.mobileautomation.util;

import com.mobileautomation.base.AppiumController;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.time.Duration;


public class androidUtils extends AppiumController {

    public WebDriverWait wait;


//    public androidUtils() {
//        this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//    }
    public void tap(WebElement e)
    {
        Assert.assertTrue(e.isDisplayed(), "Element is not visibile on screen");
        e.click();
    }

    public void clear(WebElement element)
    {
        waitForElement(element,2);
        element.click();
        element.clear();
    }

    public void typeText(WebElement element, String s) {
        //element.click();
        element.sendKeys(s);
    }

    public void tapKeyboardSearchBtn()
    {
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void waitForElement(WebElement we,int seconds) {
        wait = new WebDriverWait(driver,Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOf(we));
    }

    public void waitForElementFluently(WebElement element) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
