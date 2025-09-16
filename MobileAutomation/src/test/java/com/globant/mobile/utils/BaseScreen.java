package com.globant.mobile.utils;

import java.util.List;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseScreen {

    protected AppiumDriver driver;

    public BaseScreen(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    public void click(WebElement webElement) {
        webElement.click();
    }

    public boolean isTheElementVisible(WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        try {
            WebElement element1 = wait.until(ExpectedConditions.visibilityOf(element));
            return element1 != null;
        } catch (NoSuchElementException e) {
            return false;
        } finally {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }

    public void swipeVertically(int startX, int startY, int endX, int endY) {

        PointerInput dedito = new PointerInput(PointerInput.Kind.TOUCH, "dedito");
        Sequence sequence = new Sequence(dedito, 0)
                .addAction(dedito.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, startY))
                .addAction(dedito.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(dedito, Duration.ofMillis(125)))
                .addAction(dedito.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), endX, endY))
                .addAction(dedito.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(sequence));

    }

    public void swipeHorizontally(WebElement element1, WebElement element2) {
        int centerXElement1 = element1.getRect().getX() + element1.getRect().getWidth() / 2;
        int centerYElement1 = element1.getRect().getY() + element1.getRect().getHeight() / 2;
        int centerXElement2 = element2.getRect().getX() + element2.getRect().getWidth() / 2;
        int centerYElement2 = element2.getRect().getY() + element2.getRect().getHeight() / 2;

        PointerInput dedito = new PointerInput(PointerInput.Kind.TOUCH, "dedito");
        Sequence sequence = new Sequence(dedito, 0)
                .addAction(dedito.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), centerXElement1, centerYElement1))
                .addAction(dedito.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(dedito, Duration.ofMillis(125)))
                .addAction(dedito.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), centerXElement2, centerYElement1))
                .addAction(dedito.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(sequence));

    }

}
