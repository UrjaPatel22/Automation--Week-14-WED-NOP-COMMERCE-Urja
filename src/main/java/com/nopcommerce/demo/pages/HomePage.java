package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {


    @CacheLookup
    @FindBy(linkText="Log in")
    WebElement logInLink;

    @CacheLookup
    @FindBy(linkText="Register")
    WebElement register;

    @CacheLookup
    @FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computer;


    public void loginLink() {
        Reporter.log("Click On Login Link" );
        CustomListeners.test.log(Status.PASS,"Click On Login Link");
        clickOnElement(logInLink);
    }

    public void registerLink(){
        Reporter.log("Click On Register Link" );
        CustomListeners.test.log(Status.PASS,"Click On Register Link");
        clickOnElement(register);
    }

    public void clickOnComputer(){
        Reporter.log("Click On Computer" );
        CustomListeners.test.log(Status.PASS,"Click On Computer");
        clickOnElement(computer);
    }



}
