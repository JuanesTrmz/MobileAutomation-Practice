package com.globant.mobile.screens;

import com.globant.mobile.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import javax.swing.colorchooser.AbstractColorChooserPanel;


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
    @AndroidFindBy(uiAutomator = "description(\"card\").instance(1)")
    WebElement fraCard1;

    // CARDS OF CAROUSEL
    @AndroidFindBy(uiAutomator = "description(\"card\")")
    WebElement fraLastCard;
    @AndroidFindBy(uiAutomator = "text(\"COMPATIBLE\")")
    WebElement lblLastCardTitle;
    @AndroidFindBy(uiAutomator = "text(\"WebdriverIO works in combination with most of the TDD and BDD test frameworks in the JavaScript world\")")
    WebElement lblLastCardDesc;

    // ROBOT OF THE BOTTOM OF THE PAGE
    @AndroidFindBy(accessibility = "WebdriverIO logo")
    WebElement imgRobotBelow;
    @AndroidFindBy(uiAutomator = "text(\"You found me!!!\")")
    WebElement lblFoundMe;

    public SwipeScreen(AppiumDriver driver) {
        super(driver);
    }

    public void swipeDown() {
        int screenWidth = driver.manage().window().getSize().getWidth();
        int screenHeight = driver.manage().window().getSize().getHeight();

        int startX = screenWidth / 2;
        int startY = (int) (screenHeight * 0.9);
        int endY   = (int) (screenHeight * 0.2);

        swipeVertically(startX, startY, startX, endY);
    }

    public void swipeLeft() {
        swipeHorizontally(fraCard1, fraCard0);
    }

    public DragScreen tapOnDragButton() {
        click(btnDrag);
        return new DragScreen(driver);
    }

    public boolean isSwipeScreenDisplayed() {
        isTheElementVisible(lblTitle, 10);
        isTheElementVisible(lblSubtitle, 10);
        isTheElementVisible(fraCard0, 10);
        isTheElementVisible(fraCard1, 10);
        System.out.println("Swipe is displayed");

        return true;
    }

    public boolean isLastCardInScreen() {
        try {
            return isTheElementVisible(fraLastCard, 5) &&
                    isTheElementVisible(lblLastCardTitle, 5) &&
                    isTheElementVisible(lblLastCardDesc, 5);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean wasTheRobotBelowFound() {
        try {
            return isTheElementVisible(imgRobotBelow, 10) &&
                    isTheElementVisible(lblFoundMe, 10);
        } catch (Exception e) {
            return false;
        }
    }
}
