package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {



    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Computers']")
    WebElement computerText;

    @CacheLookup
    @FindBy(xpath="//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktop;


    @CacheLookup
    @FindBy(css="#product_attribute_1")
    WebElement processorDropdownLocator;

    @CacheLookup
    @FindBy(css="#product_attribute_2")
    WebElement ramDropdownLocator;

    @CacheLookup
    @FindBy(css="#product_attribute_3_7")
    WebElement hddRadioButtonLocator;

    @CacheLookup
    @FindBy(css="#product_attribute_4_9")
    WebElement osRadioButtonLocator;


    @CacheLookup
    @FindBy(className="option-list")
    WebElement msOfficeCheckBoxLocator;
    @CacheLookup
    @FindBy(xpath="//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton1Locator;

    @CacheLookup
    @FindBy(xpath="//p[@class='content']")
    WebElement shoppingCart;



    public String verifyComputerText(){
            Reporter.log("Verify Computer Text");
            CustomListeners.test.log(Status.PASS, "Verify Computer Text");
            return getTextFromElement(computerText);
        }

        public void clickOnDesktop(){
            Reporter.log("Click On Desktop");
            CustomListeners.test.log(Status.PASS, "Click On Desktop");
            clickOnElement(desktop);
        }




    public void selectProcessor(String processor){
        Reporter.log("Select Processor" + processor + " to  Processor field " + processor.toString());
        CustomListeners.test.log(Status.PASS, "Select Processor " + processor);
        selectByVisibleTextFromDropDown(processorDropdownLocator,processor);

    }

    public void selectRAM(String ram){
        Reporter.log("Select RAM" + ram + " to  RAM field " + ram.toString());
        CustomListeners.test.log(Status.PASS, "Select RAM " + ram);
        selectByVisibleTextFromDropDown(ramDropdownLocator,ram);

    }

    public void selectHDD(String hdd){
        Reporter.log("Select HDD" + hdd + " to  HDD field " + hdd.toString());
        CustomListeners.test.log(Status.PASS, "Select HDD " + hdd);
        clickOnElement(hddRadioButtonLocator);

    }

    public void selectOS(String os){
        Reporter.log("Select OS" + os + " to  OS field " + os.toString());
        CustomListeners.test.log(Status.PASS, "Select OS " + os);
        clickOnElement(osRadioButtonLocator);

    }




    public void selectMicrosoftOffice(String software) {
        Reporter.log("Select Software" + software + " to  Software field " + software.toString());
        CustomListeners.test.log(Status.PASS, "Select Software " + software);
        clickOnElement(msOfficeCheckBoxLocator);



        }


    public void clickOnAddToCart(){
        Reporter.log("Click On Add to Cart");
        CustomListeners.test.log(Status.PASS, "Click On Add to cart");
        clickOnElement(addToCartButton1Locator);
    }

    public String verifyProductAddedInShoppingCart(){
        Reporter.log("Verify Product Added in Shopping Cart Text");
        CustomListeners.test.log(Status.PASS, "Verify Product Added in Shopping Cart Text");
        return getTextFromElement(shoppingCart);
    }




}

