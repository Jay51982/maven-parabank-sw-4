package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.LoginPage;
import htm.index.parabank.com.parasoft.parabank.pages.RegisterPage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTestClass extends TestBase {
    LoginPage loginPage = new LoginPage();


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("AbcXyz");
        loginPage.enterPassword("abc123");
        loginPage.clickonloginbutton();
        String expectedMessage = "Accounts Overview";
        String actualMessage =loginPage.getverifyText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login message not matched");

    }
    @Test
    public void verifyTheErrorMessage() {
        loginPage.enterUserName("Abc");
        loginPage.enterPassword("abc");
        loginPage.clickonloginbutton();
        String expectedMessage ="The username and password could not be verified.";
        String actualMessage =loginPage.getverifyText1();
        Assert.assertEquals(expectedMessage, actualMessage, "Login message not matched.");
    }
    @Test
    public void userShouldLogOutSuccessfully(){
        loginPage.enterUserName("AbcXyz");
        loginPage.enterPassword("abc123");
        loginPage.clickonloginbutton();
        String expectedMessage = "Customer Login";
        String actualMessage = loginPage.getverifyText2();
        Assert.assertEquals(expectedMessage, actualMessage, "Login message not matched");
    }

}
