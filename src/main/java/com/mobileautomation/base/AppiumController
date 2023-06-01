package com.mobileautomation.base;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class AppiumController {

    public static OS executionOS = OS.ANDROID;

    public enum OS {
        ANDROID
    }

    public static AppiumDriverLocalService service;

    public static AppiumController server = new AppiumController();
    public static AndroidDriver driver;

    public void start() {
        if (driver != null) {
            return;
        }
        switch (executionOS) {
            case ANDROID:

                DesiredCapabilities dc = new DesiredCapabilities();
                dc.setCapability("platformName", "android");
                dc.setCapability("platfromVersion", "11.0");
                dc.setCapability("automationName", "uiautomator2");
                dc.setCapability("deviceName", "sdk_gphone_x86");
                dc.setCapability("udid", "emulator-5554");
                //dc.setCapability("appPackage","com.android.chrome");
//                dc.setCapability("app", "/Users/zop5074/Downloads/appium-pageobjectmodel-master/src/test/resources/app/Android.SauceLabs.Mobile.Sample.app.2.2.1.apk");
//                dc.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");
                dc.setCapability("appPackage", "com.android.vending");
                dc.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");

                try {
                    AppiumServiceBuilder builder = new AppiumServiceBuilder();
                    builder
                            .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                            .usingDriverExecutable(new File("/usr/local/bin/node"))
                            .usingPort(4723)
                            .withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
                            .withLogFile(new File("Appiumlog.txt"))
                            .withIPAddress("127.0.0.1");

                    service = AppiumDriverLocalService.buildService(builder);
                    service.start();
                    System.out.println(service.getUrl());
                    System.out.println(service.isRunning());
                    driver = new AndroidDriver(service.getUrl(), dc);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
        }
    }

    public void stop() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
