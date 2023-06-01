package com.mobileautomation.screens;

import com.mobileautomation.util.androidUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class zomatoScreen extends androidUtils {

    @AndroidFindBy(xpath = "(//android.widget.Button)[1]")
    protected WebElement locationAllow;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[(@resource-id='com.application.zomato:id/login_options_container')]/child::android.widget.LinearLayout[1]")
    protected WebElement loginOptions;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Continue with Facebook')]")
    protected WebElement continuewithFB;

    @FindBy(id = "m_login_email")
    protected WebElement fb_email;

    @FindBy(id = "m_login_password")
    protected WebElement fb_pwd;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id ='com.google.android.gms:id/add_account_chip_title']")
    protected WebElement addAccount;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='identifierId']")
    protected WebElement gmail_email;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'NEXT')]")
    protected WebElement next_btn;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id='password']/child::android.view.View/child::android.view.View[1]/child::android.widget.EditText")
    protected WebElement gmail_pwd;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id='signinconsentNext']/child::android.widget.Button")
    protected WebElement gm_agree;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.application.zomato:id/search_edit_text']")
    protected WebElement zom_search;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.application.zomato:id/edittext']")
    protected WebElement rest_ty;

    @AndroidFindBy(uiAutomator = "new UiSelector().text('Empire')")
    protected WebElement resteu;

    public zomatoScreen(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(15)),this);
    }

    public zomatoScreen allowLocation()
    {
        tap(locationAllow);
        return this;
    }

    public zomatoScreen tapOnLoginOptions()
    {
        tap(loginOptions);
        return this;
    }

    public zomatoScreen tapOnFb()
    {
        tap(continuewithFB);
        return this;
    }

    public zomatoScreen enterFbId(String email)
    {
        setContexttoWeb();
        tap(fb_email);
        typeText(fb_email,email);
        return this;
    }

    public zomatoScreen enterFbPwd(String pwd)
    {
        tap(fb_pwd);
        typeText(fb_pwd,pwd);
        return this;
    }

    public void setContexttoWeb()
    {
      Set<String> con = driver.getContextHandles();
      for(String s: con)
      {
          System.out.println(s);
          if(s.contains("WEBVIEW"))
          {
              driver.context(s);
          }
      }
    }

    public zomatoScreen gmAddAccount()
    {
        tap(addAccount);
        return this;
    }

    public zomatoScreen entergmailId(String email)
    {
        //setContexttoWeb();
        waitForElement(gmail_email,5);
        tap(gmail_email);
        typeText(gmail_email,email);
        return this;
    }

    public zomatoScreen entergmailPwd(String pwd)
    {
        tap(gmail_pwd);
        typeText(gmail_pwd,pwd);
        return this;
    }

    public zomatoScreen tapNext() {
        tap(next_btn);
        return this;

    }

    public zomatoScreen tapGmAgree() {
        tap(gm_agree);
        return this;
    }

    public zomatoScreen searchforRestaurent(String rest) {
        waitForElement(zom_search,5);
        tap(zom_search);
        typeText(rest_ty,rest);
        tap(resteu);
        return this;
    }
}
