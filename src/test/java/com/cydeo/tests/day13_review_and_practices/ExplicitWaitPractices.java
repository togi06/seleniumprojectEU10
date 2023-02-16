package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DynamicControlPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitPractices {

    DynamicControlPage dynamicControlPage;
    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlPage = new DynamicControlPage();

    }

    @Test
    public void  remove_button_test(){
        //3- Click to “Remove” button
        dynamicControlPage.removeButton.click();

        //4- Wait until “loading bar disappears”
        //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        //wait.until(ExpectedConditions.invisibilityOf(dynamicControlPage.loadingBar));
        BrowserUtils.waitForInvisibilityOf(dynamicControlPage.loadingBar);

        //5- Verify:
        //a. Checkbox is not displayed

        try {
            Assert.assertTrue(!dynamicControlPage.checkbox.isDisplayed());
            //assertFalse method will pass the test if the boolean value returned is: false
            Assert.assertFalse(dynamicControlPage.checkbox.isDisplayed());
        }catch (NoSuchElementException n){
            Assert.assertTrue(true);
        }

        //b. “It’s gone!” message is displayed.
        //ikisi de aynı...
        Assert.assertTrue(dynamicControlPage.message.isDisplayed());
        Assert.assertTrue(dynamicControlPage.message.getText().equals("It's gone!"));

    }

    @Test
    public void enable_button_test(){

        //3- Click to “Enable” button

        //System.out.println("dynamicControlPage.enableButton.isEnabled() = " + dynamicControlPage.enableButton.isEnabled());
        dynamicControlPage.enableButton.click();


        System.out.println("dynamicControlPage.inputBox.isEnabled() = " + dynamicControlPage.inputBox.isEnabled());

        //4- Wait until “loading bar disappears”
        //Calling pur ExplicitWait utility method tow ait loadingBar to disappear
        BrowserUtils.waitForInvisibilityOf(dynamicControlPage.loadingBar);
        System.out.println("dynamicControlPage.inputBox.isEnabled() = " + dynamicControlPage.inputBox.isEnabled());

        //5- Verify:
        //a. Input box is enabled.
        Assert.assertTrue(dynamicControlPage.inputBox.isEnabled());


         //b. “It’s enabled!” message is displayed.
        Assert.assertTrue(dynamicControlPage.message.isDisplayed());

        //Check the String value is matching as expected :"It’s enabled!"
        Assert.assertTrue(dynamicControlPage.message.getText().equals("It's enabled!"));
    }
}
