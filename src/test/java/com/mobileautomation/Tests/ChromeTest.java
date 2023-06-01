package com.mobileautomation.Base.Tests;

import com.mobileautomation.screens.HomeScreen;
import org.testng.annotations.Test;


public class ChromeTest extends BaseTest {


    @Test
    public void validateChromeOpened()
    {
        homeScreen.enterUserName("Send").
                enterPassword("text");
    }

}
