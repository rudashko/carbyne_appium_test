package utils;

import base.AppDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utils {
    AppiumDriver driver = (AppiumDriver) AppDriver.getDriver();

    protected WebElement waitWebElementPresent(AppiumDriver driver, By by, String error_message, long timeoutInSeconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message);
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }

    public WebElement waitWebElementAndClick(AppiumDriver driver, By by, String error_message, long timeoutInSeconds)
    {
        WebElement element = waitWebElementPresent(driver, by, error_message, timeoutInSeconds);
        element.click();
        return element;
    }

    //method to left and right swipe on the screen based on coordinates
    public void swipeAction(int Xcoordinate, int Ycoordinate, String direction) {
        //get device width and height
        Dimension dimension = driver.manage().window().getSize();
        int deviceHeight = dimension.getHeight();
        int deviceWidth = dimension.getWidth();
        System.out.println("Height x Width of device is: " + deviceHeight + " x " + deviceWidth);

        switch (direction) {
            case "Left":
                System.out.println("Swipe Right to Left");
                //define starting and ending X and Y coordinates
                int startX=deviceWidth - Xcoordinate;
                int startY=Ycoordinate; // (int) (height * 0.2);
                int endX=Xcoordinate;
                int endY=Ycoordinate;
                //perform swipe from right to left
                new TouchAction((AppiumDriver) driver).longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
                break;

            case "Right":
                System.out.println("Swipe Left to Right");
                //define starting X and Y coordinates
                startX=Xcoordinate;
                startY=Ycoordinate;
                endX=deviceWidth - Xcoordinate;
                endY=Ycoordinate;
                //perform swipe from left to right
                new TouchAction((AppiumDriver) driver).longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
                break;
        }
    }

}
