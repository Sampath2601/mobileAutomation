package com.mobileautomation.Tests;

import com.mobileautomation.base.AppiumController;
import com.mobileautomation.screens.HomeScreen;
import com.mobileautomation.screens.playStoreScreen;
import com.mobileautomation.screens.zomatoScreen;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest extends AppiumController {

    protected HomeScreen homeScreen;
    protected playStoreScreen playStoreScreen;

    protected zomatoScreen zomatoScreen;

    @BeforeSuite
    public void setUp() throws Exception {

        AppiumController.server.start();

        switch (AppiumController.executionOS) {
            case ANDROID:
                //homeScreen = new HomeScreen(driver);
                playStoreScreen = new playStoreScreen(driver);
                zomatoScreen = new zomatoScreen(driver);
                break;

        }
    }

    @AfterSuite
    public void tearDown() {

        AppiumController.server.stop();

    }
}
