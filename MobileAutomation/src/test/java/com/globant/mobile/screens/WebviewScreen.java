package com.globant.mobile.screens;

import com.globant.mobile.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class WebviewScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "className(\"android.webkit.WebView\")")
    WebElement fraWebview;

    @AndroidFindBy(uiAutomator = "text(\"Home\")")
    WebElement btnHome;
    @AndroidFindBy(uiAutomator = "text(\"Login\")")
    WebElement btnLogin;
    @AndroidFindBy(uiAutomator = "text(\"Forms\")")
    WebElement btnForms;
    @AndroidFindBy(uiAutomator = "text(\"Swipe\")")
    WebElement btnSwipe;
    @AndroidFindBy(uiAutomator = "text(\"Drag\")")
    WebElement btnDrag;

    public WebviewScreen(AppiumDriver driver) {
        super(driver);
    }

    public boolean isWebviewScreenDisplayed() {
        isTheElementVisible(fraWebview, 20);
        System.out.println("Webview is displayed");

        return true;
    }

    public LoginScreen tapOnLoginButton() {
        click(btnLogin);
        return new LoginScreen(driver);
    }
}
