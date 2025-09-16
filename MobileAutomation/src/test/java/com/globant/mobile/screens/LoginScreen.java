package com.globant.mobile.screens;

import com.globant.mobile.utils.BaseScreen;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"Home\")")
    WebElement btnHome;
    @AndroidFindBy(uiAutomator = "text(\"Webview\")")
    WebElement btnWebview;
    @AndroidFindBy(uiAutomator = "text(\"Forms\")")
    WebElement btnForms;
    @AndroidFindBy(uiAutomator = "text(\"Swipe\")")
    WebElement btnSwipe;
    @AndroidFindBy(uiAutomator = "text(\"Drag\")")
    WebElement btnDrag;

    @AndroidFindBy(accessibility = "input-email")
    WebElement txtEmail;
    @AndroidFindBy(accessibility = "input-password")
    WebElement txtPassword;
    @AndroidFindBy(accessibility = "input-repeat-password")
    WebElement txtRepeatPassword;
    @AndroidFindBy(uiAutomator = "text(\"LOGIN\")")
    WebElement btnLogin;
    @AndroidFindBy(uiAutomator = "text(\"SIGN UP\")")
    WebElement btnSIGNUP;

    @AndroidFindBy(uiAutomator = "text(\"Sign up\")")
    WebElement btnSignUp;
    @AndroidFindBy(uiAutomator = "text(\"Login / Sign up Form\")")
    WebElement lblTitleLogin;
    @AndroidFindBy(uiAutomator = "text(\"When the device has Touch/FaceID (iOS) or FingerPrint enabled a biometrics button will be shown to use and test the login.\")")
    WebElement lblDesc;

    // SIGN UP ELEMENTS
    @AndroidFindBy(uiAutomator = "text(\"Signed Up!\")")
    WebElement lblTitleSignup;
    @AndroidFindBy(uiAutomator = "text(\"You successfully signed up!\")")
    WebElement lblDescSignUp;
    @AndroidFindBy(uiAutomator = "text(\"OK\")")
    WebElement btnOk;

    // LOGIN SUCCESSFUL ELEMENTS
    @AndroidFindBy(uiAutomator = "text(\"Success\")")
    WebElement lblTitleLogS;
    @AndroidFindBy(uiAutomator = "text(\"You are logged in!\")")
    WebElement lblDescLogS;
    @AndroidFindBy(uiAutomator = "text(\"OK\")")
    WebElement btnOkLogin;

    public LoginScreen(AppiumDriver driver) {
        super(driver);
    }

    public void tapOnLoginButton() {
        click(btnLogin);
    }
    public void tapOnSignUpButton() {
        click(btnSignUp);
    }
    public void tapSIGNUPButton() {
        click(btnSIGNUP);
    }

    public FormsScreen tapOnFormsButton() {
        click(btnForms);
        return new FormsScreen(driver);
    }

    public void completeEmail(String email) {
        txtEmail.sendKeys(email);
    }

    public void completePassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void completeRepeatPassword(String repeatPassword) {
        txtRepeatPassword.sendKeys(repeatPassword);
    }

    public boolean isLoginScreenDisplayed() {
        isTheElementVisible(lblTitleLogin, 10);
        isTheElementVisible(btnSignUp, 10);
        isTheElementVisible(lblDesc, 10);
        isTheElementVisible(txtEmail, 10);
        isTheElementVisible(txtPassword, 10);
        System.out.println("Login is displayed");

        return true;
    }

    public boolean isSignedUpScreenDisplayed() {
        isTheElementVisible(lblTitleSignup, 10);
        isTheElementVisible(lblDescSignUp, 10);
        isTheElementVisible(btnOk, 10);
        System.out.println("Sign Up done");

        return true;
    }

    public boolean wasLoginSuccessful() {
        isTheElementVisible(lblTitleLogS, 10);
        isTheElementVisible(lblDescLogS, 10);
        isTheElementVisible(btnOkLogin, 10);
        System.out.println("Sign Up done");

        return true;
    }
}
