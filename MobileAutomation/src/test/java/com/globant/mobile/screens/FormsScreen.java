package com.globant.mobile.screens;

import com.globant.mobile.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class FormsScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"Home\")")
    WebElement btnHome;
    @AndroidFindBy(uiAutomator = "text(\"Webview\")")
    WebElement btnWebview;
    @AndroidFindBy(uiAutomator = "text(\"Login\")")
    WebElement btnLogin;
    @AndroidFindBy(uiAutomator = "text(\"Swipe\")")
    WebElement btnSwipe;
    @AndroidFindBy(uiAutomator = "text(\"Drag\")")
    WebElement btnDrag;

    @AndroidFindBy(uiAutomator = "text(\"Form components\")")
    WebElement lblTitle;
    @AndroidFindBy(uiAutomator = "text(\"Input field:\")")
    WebElement lblInputField;
    @AndroidFindBy(uiAutomator = "className(\"android.view.ViewGroup\").instance(8)")
    WebElement fraForm;
    @AndroidFindBy(accessibility = "text-input")
    WebElement txtTypeSom;
    @AndroidFindBy(uiAutomator = "text(\"You have typed:\")")
    WebElement lblYouveTyped;
    @AndroidFindBy(uiAutomator = "text(\"Switch:\")")
    WebElement lblSwitch;
    @AndroidFindBy(accessibility = "switch")
    WebElement toggleSwitch;
    @AndroidFindBy(uiAutomator = "text(\"Dropdown:\")")
    WebElement lblDropdown;
    @AndroidFindBy(uiAutomator = "text(\"Buttons\")")
    WebElement lblButtons;
    @AndroidFindBy(uiAutomator = "text(\"Active\")")
    WebElement btnActive;
    @AndroidFindBy(uiAutomator = "text(\"Inactive\")")
    WebElement btnInactive;

    public FormsScreen(AppiumDriver driver) {
        super(driver);
    }

    public SwipeScreen tapOnSwipeButton() {
        click(btnSwipe);
        return new SwipeScreen(driver);
    }

    public boolean isFormsScreenDisplayed() {
        isTheElementVisible(lblTitle, 10);
        isTheElementVisible(lblInputField, 10);
        isTheElementVisible(lblDropdown, 10);
        isTheElementVisible(lblButtons, 10);
        isTheElementVisible(lblYouveTyped, 10);
        isTheElementVisible(lblSwitch, 10);
        isTheElementVisible(txtTypeSom, 10);
        isTheElementVisible(fraForm, 10);
        isTheElementVisible(toggleSwitch, 10);
        isTheElementVisible(btnActive, 10);
        isTheElementVisible(btnInactive, 10);
        System.out.println("Forms is displayed");

        return true;
    }
}
