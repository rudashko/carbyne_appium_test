package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import utils.Utils;

import java.net.URL;

public class BaseTest extends Utils {
    
    private static final String APPIUM_SERVER_PATH = "http://127.0.0.1:4723/wd/hub";

    public AppiumDriver driver;
    DesiredCapabilities capabilities = new DesiredCapabilities();

    @BeforeMethod
    public void setUp(String platform) throws Exception {
        if (platform == "Android") {
            //TODO list of Android capabilities

            driver = new AndroidDriver(new URL(APPIUM_SERVER_PATH), capabilities);
        } else {
            //TODO list of iOS capabilities

            driver = new IOSDriver(new URL(APPIUM_SERVER_PATH), capabilities)
        }
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}
