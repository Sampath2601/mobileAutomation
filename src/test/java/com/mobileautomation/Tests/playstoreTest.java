package com.mobileautomation.Tests;

import org.testng.annotations.Test;

public class playstoreTest extends BaseTest{

    @Test
    public void searchForApp()
    {
        playStoreScreen
                .tapOnSearchButton()
                .searchForApp("zomato")
                .installApp();
//                .openApp();
        zomatoScreen.
//                allowLocation()
//                tapOnLoginOptions()
//                .gmAddAccount()
//                .entergmailId("samtst119@gmail.com")
//                .tapNext()
//                .entergmailPwd("s@m#1425")
//                .tapNext()
//                .tapGmAgree()
                searchforRestaurent("Empire");

    }
}
