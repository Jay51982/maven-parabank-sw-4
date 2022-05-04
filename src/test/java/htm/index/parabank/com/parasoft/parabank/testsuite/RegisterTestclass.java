package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.RegisterPage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTestclass extends TestBase {

    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyThatSigningUpPageDisplay() {
        registerPage.clickOnRegisterLink();
        String expectedMessage = "Signing up is easy!";
        String actualMessage = registerPage.verifyTheSigningupiseasy();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        registerPage.clickOnRegisterLink();
        registerPage.enterFirstName("Abc");
        registerPage.enterLastNameField("Xyz");
        registerPage.enterAddressfield("54 Canary Warf");
        registerPage.enterCityField("London");
        registerPage.enterstateField("Westminster");
        registerPage.enterZipCode("E14 1DA");
        registerPage.enterPhoneNumber("07323723668");
        registerPage.enterSSNNumber("123456789");
        registerPage.enterUserName("AbcXyz1");
        registerPage.enterpassword("abc1231");
        registerPage.enterconformpassword("abc1231");
        registerPage.clickOnRegisterButton();
        String expectedMessage = "Your account was created successfully. You are now logged in.";
        String actualMessage = registerPage.verifyTextforSuccessAfterRegister();
        Assert.assertEquals(expectedMessage, actualMessage, "Cannot Register");
    }
}
