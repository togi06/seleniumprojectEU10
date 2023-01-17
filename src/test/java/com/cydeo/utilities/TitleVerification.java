package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TitleVerification {

    //TC #5: Create utility method
    //1. Create a new method for title verification
    //2. Create a method to make title verification logic re-usable
    //3. When method is called, it should simply verify expected title with actual
    //title
    //Method info:
    //• Name: verifyTitle()
    //• Return type: void
    //• Arg1: WebDriver
    //• Arg2: String expectedTitle

    public static void verify_Title(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(),expectedTitle);


    }


}
