package com.globant.mobile.tests;

import com.globant.mobile.screens.*;
import com.globant.mobile.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    @Test
    public void menuBarNavigationTest() {

        HomeScreen homeScreen = getHomeScreen();
        homeScreen.closePopUp();
        Assert.assertTrue(homeScreen.isHomeScreenDisplayed(), "Home Screen is not visible.");
        homeScreen.tapOnWebviewButton();

        WebviewScreen webviewScreen = homeScreen.tapOnWebviewButton();
        Assert.assertTrue(webviewScreen.isWebviewScreenDisplayed(), "Webview Screen is not visible.");
        webviewScreen.tapOnLoginButton();

        LoginScreen loginScreen = webviewScreen.tapOnLoginButton();
        Assert.assertTrue(loginScreen.isLoginScreenDisplayed(), "Login Screen is not visible.");
        loginScreen.tapOnFormsButton();

        FormsScreen formsScreen = loginScreen.tapOnFormsButton();
        Assert.assertTrue(formsScreen.isFormsScreenDisplayed(), "Login Screen is not visible.");
        formsScreen.tapOnSwipeButton();

        SwipeScreen swipeScreen = formsScreen.tapOnSwipeButton();
        Assert.assertTrue(swipeScreen.isSwipeScreenDisplayed(), "Swipe Screen is not visible.");
        swipeScreen.tapOnDragButton();

        DragScreen dragScreen = swipeScreen.tapOnDragButton();
        Assert.assertTrue(dragScreen.isDragScreenDisplayed(), "Drag Screen is not visible.");

    }
}
