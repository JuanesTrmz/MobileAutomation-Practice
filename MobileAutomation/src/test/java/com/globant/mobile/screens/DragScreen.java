package com.globant.mobile.screens;

import com.globant.mobile.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DragScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"Home\")")
    WebElement btnHome;
    @AndroidFindBy(uiAutomator = "text(\"Webview\")")
    WebElement btnWebview;
    @AndroidFindBy(uiAutomator = "text(\"Login\")")
    WebElement btnLogin;
    @AndroidFindBy(uiAutomator = "text(\"Forms\")")
    WebElement btnForms;
    @AndroidFindBy(uiAutomator = "text(\"Swipe\")")
    WebElement btnSwipe;

    @AndroidFindBy(uiAutomator = "text(\"Drag and Drop\")")
    WebElement lblTitle;
    @AndroidFindBy(uiAutomator = "text(\"\uDB80\uDC6A\")")
    WebElement btnReset;
    @AndroidFindBy(uiAutomator = "className(\"android.view.ViewGroup\").instance(8)")
    WebElement fraRobotInput8;
    @AndroidFindBy(uiAutomator = "className(\"android.view.ViewGroup\").instance(10)")
    WebElement fraRobotInput10;
    @AndroidFindBy(uiAutomator = "className(\"android.view.ViewGroup\").instance(12)")
    WebElement fraRobotInput12;
    @AndroidFindBy(uiAutomator = "className(\"android.view.ViewGroup\").instance(14)")
    WebElement fraRobotInput14;
    @AndroidFindBy(uiAutomator = "className(\"android.view.ViewGroup\").instance(16)")
    WebElement fraRobotInput16;
    @AndroidFindBy(uiAutomator = "className(\"android.view.ViewGroup\").instance(18)")
    WebElement fraRobotInput18;
    @AndroidFindBy(uiAutomator = "className(\"android.view.ViewGroup\").instance(20)")
    WebElement fraRobotInput20;
    @AndroidFindBy(uiAutomator = "className(\"android.view.ViewGroup\").instance(22)")
    WebElement fraRobotInput22;
    @AndroidFindBy(uiAutomator = "className(\"android.view.ViewGroup\").instance(24)")
    WebElement fraRobotInput24;

    @AndroidFindBy(uiAutomator = "className(\"android.widget.ImageView\").instance(1)")
    WebElement fraRobot1;
    @AndroidFindBy(uiAutomator = "className(\"android.widget.ImageView\").instance(2)")
    WebElement fraRobot2;
    @AndroidFindBy(uiAutomator = "className(\"android.widget.ImageView\").instance(3)")
    WebElement fraRobot3;
    @AndroidFindBy(uiAutomator = "className(\"android.widget.ImageView\").instance(4)")
    WebElement fraRobot4;
    @AndroidFindBy(uiAutomator = "className(\"android.widget.ImageView\").instance(5)")
    WebElement fraRobot5;
    @AndroidFindBy(uiAutomator = "className(\"android.widget.ImageView\").instance(6)")
    WebElement fraRobot6;
    @AndroidFindBy(uiAutomator = "className(\"android.widget.ImageView\").instance(7)")
    WebElement fraRobot7;
    @AndroidFindBy(uiAutomator = "className(\"android.widget.ImageView\").instance(8)")
    WebElement fraRobot8;
    @AndroidFindBy(uiAutomator = "className(\"android.widget.ImageView\").instance(9)")
    WebElement fraRobot9;

    public DragScreen(AppiumDriver driver) {
        super(driver);
    }

    public boolean isDragScreenDisplayed() {
        isTheElementVisible(lblTitle, 10);
        isTheElementVisible(btnReset, 10);
        isTheElementVisible(fraRobot1, 10);
        isTheElementVisible(fraRobot2, 10);
        isTheElementVisible(fraRobot3, 10);
        isTheElementVisible(fraRobot4, 10);
        isTheElementVisible(fraRobot5, 10);
        isTheElementVisible(fraRobot6, 10);
        isTheElementVisible(fraRobot7, 10);
        isTheElementVisible(fraRobot8, 10);
        isTheElementVisible(fraRobot9, 10);
        isTheElementVisible(fraRobotInput8, 10);
        isTheElementVisible(fraRobotInput10, 10);
        isTheElementVisible(fraRobotInput12, 10);
        isTheElementVisible(fraRobotInput14, 10);
        isTheElementVisible(fraRobotInput16, 10);
        isTheElementVisible(fraRobotInput18, 10);
        isTheElementVisible(fraRobotInput20, 10);
        isTheElementVisible(fraRobotInput22, 10);
        isTheElementVisible(fraRobotInput24, 10);
        System.out.println("Drag is displayed");

        return true;
    }
}
