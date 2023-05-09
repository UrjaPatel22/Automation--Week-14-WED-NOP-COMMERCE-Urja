package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    public static String generatedEmail;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Register']")
    WebElement registerText;
    @CacheLookup
    @FindBy(xpath="//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath="//span[@id='FirstName-error']")
    WebElement firstNameText;

    @CacheLookup
    @FindBy(xpath="//span[@id='LastName-error']")
    WebElement lastNameText;


    @CacheLookup
    @FindBy(xpath="//span[@id='Email-error']")
    WebElement emailText;


    @CacheLookup
    @FindBy(xpath="//span[@id='Password-error']")
    WebElement passwordText;

    @CacheLookup
    @FindBy(xpath="//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordText;

    @CacheLookup
    @FindBy(xpath="//input[@id='gender-female']")
    WebElement femaleRadioButton;



    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameInputBox;


    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement day;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement month;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement year;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasswordInputBox;


    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement messageOfSuccessfulRegistration;

    public String verifyRegisterText(){
        Reporter.log("Get register text" );
        CustomListeners.test.log(Status.PASS,"Get register text");
        return getTextFromElement(registerText);
    }



    public void clickOnRegisterButton(){
        Reporter.log("Click On Register Button" );
        CustomListeners.test.log(Status.PASS,"Click On Register Button");
        clickOnElement(registerButton);
    }

    public String verifyFirstName(){
        Reporter.log("Get First Name Field Required Text" );
        CustomListeners.test.log(Status.PASS,"Get First Name Field Required Text");
        return getTextFromElement(firstNameText);
    }

    public String verifyLastName(){
        Reporter.log("Get Last Name Field Required Text" );
        CustomListeners.test.log(Status.PASS,"Get Last Name Field Required Text");
        return getTextFromElement(lastNameText);
    }

    public String verifyEmailText(){
        Reporter.log("Get Email Field Required Text" );
        CustomListeners.test.log(Status.PASS,"Get Email Field Required Text");
        return getTextFromElement(emailText);
    }

    public String getPasswordRequiredText(){
        Reporter.log("Get Password Field Required Text" );
        CustomListeners.test.log(Status.PASS,"Get Password Field Required Text");
        return getTextFromElement(passwordText);
    }

    public String getConfirmPasswordRequiredText(){
        Reporter.log("Get Confirm Password Required Text" );
        CustomListeners.test.log(Status.PASS,"Get Confirm Password Field Required Text");
        return getTextFromElement(confirmPasswordText);
    }

public void selectRadioButton(){
    Reporter.log("Select Female Radio Button" );
    CustomListeners.test.log(Status.PASS,"Select Female Radio Button");
        clickOnElement(femaleRadioButton);
}


    public void fillInFirstName(String fName){
        Reporter.log("Enter first name " + fName + " to firstname field " + firstNameInputBox.toString());
        CustomListeners.test.log(Status.PASS, "Enter first name " + fName);
        sendTextToElement(firstNameInputBox, fName);
    }

    public void fillInLastName(String lName){
        Reporter.log("Enter last name " + lName + " to lastname field " + lastNameInputBox.toString());
        CustomListeners.test.log(Status.PASS, "Enter last name " + lName);
        sendTextToElement(lastNameInputBox, lName);
    }


    public void selectDay(String date){
        Reporter.log("Select Day from DropDown " );
        CustomListeners.test.log(Status.PASS,"Select Day from DropDown ");
        selectByVisibleTextFromDropDown(day,date);
    }

    public void selectMonth(String monthName){
        Reporter.log("Select Month from DropDown " );
        CustomListeners.test.log(Status.PASS,"Select Month from DropDown ");
        selectByVisibleTextFromDropDown(month,monthName);
    }

    public void selectYear(String yearName){
        Reporter.log("Select Year from DropDown " );
        CustomListeners.test.log(Status.PASS,"Select Year from DropDown ");
        selectByVisibleTextFromDropDown(year, yearName);
    }

    public void fillInEmail(String email){
        Reporter.log("Enter Email " + email + " to Email field " + emailInputBox.toString());
        CustomListeners.test.log(Status.PASS, "Enter Email " + email);
        sendTextToElement(emailInputBox, email);
    }
    public void fillInPassword(String password){
        Reporter.log("Enter password " + password + " to password field " + passwordInputBox.toString());
        CustomListeners.test.log(Status.PASS, "Enter password " + password);

        sendTextToElement(passwordInputBox, password);
    }

    public void fillInConfirmPassword(String confirmPassword){
        Reporter.log("Enter confirm password " + confirmPassword + " to confirm password field " + confirmPasswordInputBox.toString());
        CustomListeners.test.log(Status.PASS, "Enter confirm password " + confirmPassword);
        sendTextToElement(confirmPasswordInputBox, confirmPassword);
    }


    public String actualMessageOfSuccessfulRegistration(){
        Reporter.log("Get text successful registration");
        CustomListeners.test.log(Status.PASS, "Get text successful registration");
        return getTextFromElement(messageOfSuccessfulRegistration);
    }
}
