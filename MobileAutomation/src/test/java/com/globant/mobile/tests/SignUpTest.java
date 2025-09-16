package com.globant.mobile.tests;

import com.globant.mobile.screens.HomeScreen;
import com.globant.mobile.screens.LoginScreen;
import com.globant.mobile.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class SignUpTest extends BaseTest {
    Faker faker = new Faker();

    @Test
    public void SignUpNewAccountTest() {
        String email = faker.internet().emailAddress();
        String password = faker.internet().password(8, 12);

        HomeScreen homeScreen = getHomeScreen();
        homeScreen.closePopUp();
        homeScreen.tapOnLoginButton();
        LoginScreen loginScreen = homeScreen.tapOnLoginButton();

        loginScreen.tapOnSignUpButton();
        loginScreen.completeEmail(email);
        loginScreen.completePassword(password);
        loginScreen.completeRepeatPassword(password);
        loginScreen.tapSIGNUPButton();

        Assert.assertTrue(loginScreen.isSignedUpScreenDisplayed(), "The sign up was not successful.");
    }
}
