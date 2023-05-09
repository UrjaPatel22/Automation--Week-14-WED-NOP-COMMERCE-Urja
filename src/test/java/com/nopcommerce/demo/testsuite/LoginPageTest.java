package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
RegisterPage registerPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage= new RegisterPage();
    }
@Test(groups={"sanity","regression"})
   public void userShouldNavigateToLoginPageSuccessFully() throws InterruptedException {
        Thread.sleep(2000);
        homePage.loginLink();
       String expectedMessage = "Welcome, Please Sign In!";
       String actualMessage = loginPage.verifyWelcomeText();
       Assert.assertEquals(actualMessage, expectedMessage, "Login page not displayed");
   }

//   2. verifyTheErrorMessageWithInValidCredentials().



    @Test(groups={"smoke","regression"})
    public void verifyTheErrorMessageWithInValidCredentials(){
//    Click on login link
        homePage.loginLink();
        loginPage.emailField("newUSer@123gmail.com");
        loginPage.passwordField("JohnSmith@1234");
        loginPage.clickOnLoginButton();
        //    Verify that the Error message
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = loginPage.verifyInvalidMsg();
        Assert.assertEquals(actualMessage, expectedMessage, "Error Msg not Matched");
    }

//3. verifyThatUserShouldLogInSuccessFullyWithValidCredentials.


//    Click on Login Button
//    Verify that LogOut link is display

    @Test(groups="regression")
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        //    Click on login link
        homePage.loginLink();
        //    Enter Email & Password
        loginPage.emailField("john@1234gmail.com");
        loginPage.passwordField("JohnSmith@123");
        loginPage.clickOnLoginButton();
        //Verify Log Out Text
        String expectedMessage ="Log out";
               String actualMessage = loginPage.verifyLogOut();
               Assert.assertEquals(actualMessage, expectedMessage, "Error Msg not Matched");

    }

    //4. VerifyThatUserShouldLogOutSuccessFully()

    @Test(groups="regression")
    public void VerifyThatUserShouldLogOutSuccessFully(){
        //    Click on login link
        homePage.loginLink();
        //    Enter Email & Password
        loginPage.emailField("john@1234gmail.com");
        loginPage.passwordField("JohnSmith@123");
        loginPage.clickOnLoginButton();
        loginPage.clickOnLogOut();
        //	 Verify that LogIn Link Display
        String expectedMessage ="Log in";
        String actualMessage = loginPage.verifyLogInText();
        Assert.assertEquals(actualMessage, expectedMessage, "Error Msg not Matched");

    }

}