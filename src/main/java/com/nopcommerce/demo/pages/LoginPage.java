package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {


    @CacheLookup
    @FindBy(css="#Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(css="#Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(css=".button-1.login-button")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath="//div[@class='message-error validation-summary-errors']")
    WebElement invalidMsg;

    @CacheLookup
    @FindBy(linkText="Log out")
    WebElement logOutText;

    @CacheLookup
    @FindBy(linkText="Log in")
    WebElement logInText;

    public String verifyWelcomeText(){
        Reporter.log("Get text Welcome ");
        CustomListeners.test.log(Status.PASS, "Get text Welcome");
        return getTextFromElement(welcomeText);
    }


    public void emailField(String email) {
        Reporter.log("Enter email  " + email + " to Email  field " + emailField.toString());
        CustomListeners.test.log(Status.PASS,"Enter email  " + email);
        sendTextToElement(emailField, email);
    }

    public void passwordField(String password) {
        Reporter.log("Enter Password  " + password + " to Password  field " + passwordField.toString());
        CustomListeners.test.log(Status.PASS,"Enter Password  " + password);
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        Reporter.log("Click On Login Button" );
        CustomListeners.test.log(Status.PASS,"Click On Login Button");
        clickOnElement(loginButton);
    }

    public String verifyInvalidMsg(){
        Reporter.log("Get Invalid Error Msg");
        CustomListeners.test.log(Status.PASS, "Get Invalid Error Msg ");
        return getTextFromElement(invalidMsg);
    }

    public String verifyLogOut(){
        Reporter.log("Verify Logout Link Text");
        CustomListeners.test.log(Status.PASS, "Get Logout Link Text");
        return getTextFromElement(logOutText);
    }

    public void  clickOnLogOut(){
        Reporter.log("Click On Log Out");
        CustomListeners.test.log(Status.PASS, "Click On Log Out");
         clickOnElement(logOutText);
    }

    public String verifyLogInText(){
        Reporter.log("Verify Log In Link Text");
        CustomListeners.test.log(Status.PASS, "Verify Login Link Text");
        return getTextFromElement(logInText);
    }


}


