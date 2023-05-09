package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {


    HomePage homePage;


    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        //   Click on Register Link
        Thread.sleep(2000);
        homePage.registerLink();
        //   Verify "Register" text
        registerPage.verifyRegisterText();
    }

    // 2. verifyThatFirstNameLastNameEmailOasswordAndConfirmPasswordFieldsAreMandetory()
    @Test(groups = {"smoke", "regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
        //    Click on Register Link
        homePage.registerLink();
        //    Click on "REGISTER" button
        registerPage.clickOnRegisterButton();
//    Verify the error message "First name is required."
        String expectedMessage = "First name is required.";
        String actualMessage = registerPage.verifyFirstName();
        Assert.assertEquals(actualMessage, expectedMessage, "First Name is required message not displayed");
//    Verify the error message "Last name is required."
        String expectedLastName = "Last name is required.";
        String actualLastPage = registerPage.verifyLastName();
        Assert.assertEquals(actualLastPage, expectedLastName, "Last Name is required message not displayed");
        //     Verify the error message "Email is required."
        String expectedMail = "Email is required.";
        String actualMail = registerPage.verifyEmailText();
        Assert.assertEquals(actualMail, expectedMail, "Email is required message not displayed");

// Verify the error message "Password is required."
        String expectedPassword = "Password is required.";
        String actualPassword = registerPage.getPasswordRequiredText();
        Assert.assertEquals(actualPassword, expectedPassword, "Password required is not displayed");

        // Verify the error message "Password is required."
        String expectedConfirmPassword = "Password is required.";
        String actualConfirmPassword = registerPage.getConfirmPasswordRequiredText();
        Assert.assertEquals(actualConfirmPassword, expectedConfirmPassword, "Confirm password required is not displayed");

    }


    //    3. VerifyThatUserShouldCreateAccountSuccessfully()
    @Test(groups =  "regression")
    public void VerifyThatUserShouldCreateAccountSuccessfully() {
        //   Click on Register Link
        homePage.registerLink();
        //    Select gender "Female"
        registerPage.selectRadioButton();
        //    Enter firstname
        registerPage.fillInFirstName("John");
        //    Enter lastname
        registerPage.fillInLastName("Smith");
        //   Select day, Month, year
        registerPage.selectDay("22");
        registerPage.selectMonth("August");
        registerPage.selectYear("1997");
//    Enter email,pswd,cpmfirm,
        registerPage.fillInEmail("john@1234gmail.com");
        registerPage.fillInPassword("JohnSmith@123");
        registerPage.fillInConfirmPassword("JohnSmith@123");
        registerPage.clickOnRegisterButton();
//Verify Register Msg
        String expectedMessageOfSuccessfulRegistration = "Your registration completed";
        Assert.assertEquals(registerPage.actualMessageOfSuccessfulRegistration(), expectedMessageOfSuccessfulRegistration, "Successful registration message not displayed");
    }

}
