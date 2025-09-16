package com.globant.mobile.screens;

import com.globant.mobile.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;


public class SwipeScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"Home\")")
    WebElement btnHome;
    @AndroidFindBy(uiAutomator = "text(\"Webview\")")
    WebElement btnWebview;
    @AndroidFindBy(uiAutomator = "text(\"Login\")")
    WebElement btnLogin;
    @AndroidFindBy(uiAutomator = "text(\"Forms\")")
    WebElement btnForms;
    @AndroidFindBy(uiAutomator = "text(\"Drag\")")
    WebElement btnDrag;

    @AndroidFindBy(uiAutomator = "text(\"Swipe horizontal\")")
    WebElement lblTitle;
    @AndroidFindBy(uiAutomator = "text(\"Or swipe vertical to find what I'm hiding.\")")
    WebElement lblSubtitle;
    @AndroidFindBy(uiAutomator = "description(\"card\").instance(0)")
    WebElement fraCard0;

    public SwipeScreen(AppiumDriver driver) {
        super(driver);
    }

    public void swipeDown() {
        //swipeVertically();
    }

    public DragScreen tapOnDragButton() {
        click(btnDrag);
        return new DragScreen(driver);
    }

    public boolean isSwipeScreenDisplayed() {
        isTheElementVisible(lblTitle, 10);
        isTheElementVisible(lblSubtitle, 10);
        isTheElementVisible(fraCard0, 10);
        System.out.println("Swipe is displayed");

        return true;
    }
}
