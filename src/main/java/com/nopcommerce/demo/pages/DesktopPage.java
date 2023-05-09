package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DesktopPage extends Utility {


    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Desktops']")
    WebElement desktopText;

    public String verifyDesktopText(){
        Reporter.log("Verify Desktop Text");
        CustomListeners.test.log(Status.PASS, "Verify Desktop Text");
        return getTextFromElement(desktopText);
    }



}
