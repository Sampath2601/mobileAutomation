package com.mobileautomation.screens;


import com.mobileautomation.util.androidUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class HomeScreen extends androidUtils {
    @AndroidFindBy( accessibility = "test-Username")
    //@iOSXCUITFindBy(id = "test-Username")
    public WebElement usernameTxtFld;

    @FindBy (id = "test-Password")
    //@iOSXCUITFindBy (id = "test-Password")
    public WebElement passwordTxtFld;

    @AndroidFindBy (accessibility = "test-LOGIN")
    //@iOSXCUITFindBy (id = "test-LOGIN")
    protected WebElement loginBtn;

    @AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
    //@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"test-Error message\"]/child::XCUIElementTypeStaticText")
    protected WebElement errTxt;

    public HomeScreen(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(15)),this);
    }

    public HomeScreen enterUserName(String username) {
        clear(usernameTxtFld);
        typeText(usernameTxtFld, username);
        return this;
    }

    public HomeScreen enterPassword(String password) {
        clear(passwordTxtFld);
        typeText(passwordTxtFld, password);
        return this;
    }

}

