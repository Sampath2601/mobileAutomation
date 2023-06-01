package com.mobileautomation.screens;

import com.mobileautomation.util.androidUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class restaurtants extends androidUtils {

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.application.zomato:id/button_add'])")
    protected WebElement item_add;

    public restaurtants(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(15)),this);
    }

    public restaurtants additemstocart(int items)
    {
        for (int i =1; i<=items;i++)
        {
            tap(item_add);
        }
        return this;
    }
}
