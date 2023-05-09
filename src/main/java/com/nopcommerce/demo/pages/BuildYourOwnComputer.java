package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputer extends Utility {


    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputer;

    public void clickOnBuildYourOwnComputerProduct() {
        Reporter.log("Click On build your own computer product" );
        CustomListeners.test.log(Status.PASS,"Click On build your own computer product");
        clickOnElement(buildYourOwnComputer);
    }
}
