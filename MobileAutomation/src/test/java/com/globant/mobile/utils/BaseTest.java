package com.globant.mobile.utils;

import com.globant.mobile.screens.HomeScreen;
import com.globant.mobile.screens.LoginScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.MalformedURLException;
import java.time.Duration;

public class BaseTest {

    protected AppiumDriver driver;
    protected SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void setUp() {
        this.driver = createDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public HomeScreen getHomeScreen() {
        return new HomeScreen(driver);
    }

    public LoginScreen getLoginScreen() {
        return new LoginScreen(driver);
    }

    public AppiumDriver createDriver() {
        UiAutomator2Options options = new UiAutomator2Options()
                .setApp("C:\\Repos\\Mobile\\MobileAutomation-Practice\\android.wdio.native.app.v1.0.8.apk")
                .setDeviceName("emulator-5554")
                .setPlatformVersion("16");
        try {
            AppiumDriver driver1 = new AppiumDriver(new URL("http://127.0.0.1:4723/"), options);
            driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            return driver1;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
