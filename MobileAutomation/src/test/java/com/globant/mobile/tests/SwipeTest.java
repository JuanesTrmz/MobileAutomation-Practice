package com.globant.mobile.tests;

import com.globant.mobile.screens.HomeScreen;
import com.globant.mobile.screens.LoginScreen;
import com.globant.mobile.screens.SwipeScreen;
import com.globant.mobile.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwipeTest extends BaseTest {

    @Test
    public void VerticalAndHorizontalSwipeTest() {
        HomeScreen homeScreen = getHomeScreen();
        homeScreen.closePopUp();
        homeScreen.tapOnSwipeScreen();
        SwipeScreen swipeScreen = homeScreen.tapOnSwipeScreen();

        swipeScreen.swipeLeft();
        swipeScreen.swipeLeft();
        swipeScreen.swipeLeft();
        swipeScreen.swipeLeft();
        swipeScreen.swipeLeft();
        Assert.assertTrue(swipeScreen.isLastCardInScreen(), "The Last Card was not found.");

        swipeScreen.swipeDown();
        swipeScreen.swipeDown();
        Assert.assertTrue(swipeScreen.wasTheRobotBelowFound(), "The Bottom Robot was not found.");
    }
}
