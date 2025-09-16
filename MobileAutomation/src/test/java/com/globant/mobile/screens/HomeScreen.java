package com.globant.mobile.screens;

import com.globant.mobile.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"WEBDRIVER\")")
    WebElement lblHomeTitle;
    @AndroidFindBy(uiAutomator = "className(\"android.widget.ImageView\").instance(0)")
    WebElement imgRobot;
    @AndroidFindBy(uiAutomator = "text(\"Demo app for the appium-boilerplate\")")
    WebElement lblDesc;
    @AndroidFindBy(uiAutomator = "text(\"Support\")")
    WebElement lblSupport;
    @AndroidFindBy(accessibility = "Home-screen")
    WebElement fraHomeScreen;

    @AndroidFindBy(uiAutomator = "text(\"Webview\")")
    WebElement btnWebview;
    @AndroidFindBy(uiAutomator = "text(\"Login\")")
    WebElement btnLogin;
    @AndroidFindBy(uiAutomator = "text(\"Forms\")")
    WebElement btnForms;
    @AndroidFindBy(uiAutomator = "text(\"Swipe\")")
    WebElement btnSwipe;
    @AndroidFindBy(uiAutomator = "text(\"Drag\")")
    WebElement btnDrag;

    @AndroidFindBy(uiAutomator = "text(\"OK\")")
    WebElement btnOk;

    public HomeScreen(AppiumDriver driver) {
        super(driver);
    }

    public boolean isHomeScreenDisplayed() {
        isTheElementVisible(imgRobot, 10);
        isTheElementVisible(lblHomeTitle, 10);
        isTheElementVisible(lblDesc, 10);
        isTheElementVisible(lblSupport, 10);
        isTheElementVisible(fraHomeScreen, 10);
        System.out.println("Home is displayed");

        return true;
    }

    public WebviewScreen tapOnWebviewButton() {
        click(btnWebview);
        return new WebviewScreen(driver);
    }

    public LoginScreen tapOnLoginButton() {
        click(btnLogin);
        return new LoginScreen(driver);
    }

    public SwipeScreen tapOnSwipeScreen() {
        click(btnSwipe);
        return new SwipeScreen(driver);
    }

    public void closePopUp() {
        try {
            click(btnOk);
        } catch (Exception e) {
            System.out.println("Popup wdiodemoapp no estaba presente.");
        }
    }
}
