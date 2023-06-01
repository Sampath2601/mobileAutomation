package com.mobileautomation.screens;

import com.mobileautomation.util.androidUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class playStoreScreen extends androidUtils {

    @AndroidFindBy(accessibility = "Search Google Play")
    protected WebElement playstoreSearchbtn;

    @AndroidFindBy(className = "android.widget.EditText")
    protected WebElement searchEditText;

    @AndroidFindBy(accessibility = "Install")
    protected WebElement installBtn;

    @AndroidFindBy(accessibility = "Open")
    protected WebElement openAppBtn;

    public playStoreScreen(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(15)),this);
    }

    public playStoreScreen tapOnSearchButton() {
        tap(playstoreSearchbtn);
        return this;
    }

    public playStoreScreen searchForApp(String app) {
        clear(searchEditText);
        typeText(searchEditText,app);
        tapKeyboardSearchBtn();
        return this;
    }

    public playStoreScreen installApp()
    {
        if(openAppBtn.isDisplayed())
        {
            openApp();
        }
        else {
            waitForElement(installBtn,3);
            tap(installBtn);
        }

        return this;
    }

    public playStoreScreen openApp() {
        waitForElementFluently(openAppBtn);
        tap(openAppBtn);
        return this;
    }

}
