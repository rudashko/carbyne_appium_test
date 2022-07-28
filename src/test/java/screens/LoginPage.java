package screens;

import base.AppDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;


public class LoginPage extends Pages{

    AppiumDriver driver = (AppiumDriver) AppDriver.getDriver();

    // Locators

    @AndroidFindBy(id="com.testapp:id/loginField")
    MobileElement loginField;

    @AndroidFindBy(id = "com.testapp:id/passwordField")
    MobileElement passwordField;

    @AndroidFindBy(id="com.testapp:id/submitField")
    MobileElement submitField;


    // Actions

   @Step
    public void setLogin(String username) {
       loginField.sendKeys(username);
   }

   @Step
    public void setPassword(String password) {
       passwordField.sendKeys(password);
   }

   @Step
    public void clickSubmit() {
       submitField.click();
   }

   @Step
    public void loginAs(String username, String password) {
       setLogin(username);
       setPassword(password);
       clickSubmit();
   }

}
