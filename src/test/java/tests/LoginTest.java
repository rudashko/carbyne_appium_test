package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.LoginPage;


public class LoginTest extends BaseTest {

    private static String USERNAME = "testUser";
    private static String PASSWORD = "testPwd";

    @Test
    public void loginAsUser() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginAs(USERNAME, PASSWORD);

        //TODO some assertions
    }






}
