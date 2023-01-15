package com.cydeo.utilities;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

/*
ın this class only general utility methods that are nor related to some specific page.
 */
public class BrowserUtils {
    /*
    This method will accept int (in seconds) ad execute Thread.sleep
    for given duration
     */
    public void sleep (int second){
        second *=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }


    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl,String expectedInTitle ){
        Set<String > allWindowsHandles = driver.getWindowHandles();

        for (String each : driver.getWindowHandles()) {

            driver.switchTo().window(each);
            System.out.println("Current URL: "+ driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains("expectedInUrl")){
                break;
            }

        }

        //5. Assert: Title contains “Etsy”

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }


}
