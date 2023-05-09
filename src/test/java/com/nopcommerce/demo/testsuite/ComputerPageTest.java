package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.BuildYourOwnComputer;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import com.nopcommerce.demo.testdata.TestData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ComputerPageTest extends BaseTest {
    HomePage homePage;
    ComputerPage computerPage;

    DesktopPage desktopPage;

    BuildYourOwnComputer buildYourOwnComputer;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopPage = new DesktopPage();
        buildYourOwnComputer = new BuildYourOwnComputer();
    }
//1. verifyUserShouldNavigateToComputerPageSuccessfully()


    @Test(groups={"sanity","regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        //    Click on Computer tab
        homePage.clickOnComputer();
        //    Verify "Computer" text
        String expected = "Computers";
        Assert.assertEquals(computerPage.verifyComputerText(), expected, "Not Matched");
    }

//2. verifyUserShouldNavigateToDesktopsPageSuccessfully()


@Test(groups={"smoke","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.clickOnComputer();
        //    Click on Desktops link
        computerPage.clickOnDesktop();
    //    Verify "Desktops" text
    String expected = "Desktops";
    Assert.assertEquals(desktopPage.verifyDesktopText(), expected, "Not Matched");
    }

//    3. VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram,
//                                                                           String hdd, String os, String software)


@Test (dataProvider = "DataSet", dataProviderClass = TestData.class,groups="regression")
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram,String hdd, String os, String software){
        //    Click on Computer tab
        homePage.clickOnComputer();
        //    Click on Desktops link
        computerPage.clickOnDesktop();
        //    Click on product name "Build your own computer"
        buildYourOwnComputer.clickOnBuildYourOwnComputerProduct();
        // Select processor "processor"
computerPage.selectProcessor(processor);
computerPage.selectRAM(ram);
computerPage.selectHDD(hdd);
computerPage.selectOS(os);
computerPage.selectMicrosoftOffice(software);
computerPage.clickOnAddToCart();
//    Verify message "The product has been added to your shopping cart"
    String expected = "The product has been added to your shopping cart";
    Assert.assertEquals(computerPage.verifyProductAddedInShoppingCart(), expected, "Not Matched");

    }


}


