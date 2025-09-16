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
        boolean lastCardFound = false;
        boolean robotFound = false;

        HomeScreen homeScreen = getHomeScreen();
        homeScreen.closePopUp();
        homeScreen.tapOnSwipeScreen();
        SwipeScreen swipeScreen = homeScreen.tapOnSwipeScreen();

        while (!lastCardFound) {
            swipeScreen.swipeLeft();
            lastCardFound = swipeScreen.isLastCardInScreen();
            if (lastCardFound)
                System.out.println("Last Card was found");
        }

        while (!robotFound) {
            swipeScreen.swipeDown();
            robotFound = swipeScreen.wasTheRobotBelowFound();
            if (robotFound)
                System.out.println("Robot was found");
        }
    }
}
