package com.cydeo.tests.day6_alerst_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/javascript_alerts

        driver.get(" https://practice.cydeo.com/javascript_alerts");

    }

    @Test
    public void alert_task1(){

        //3. Click to “Click for JS Alert” button
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        informationAlertButton.click();



        //To be able to click to Alert Ok button we nedd to switch driver's focus to Alert itself
        Alert alert = driver.switchTo().alert();

        //4. Click to OK button from the alert
        alert.accept(); //allert Ok "html" dışında olduğu için burada ".accept();" yapmamız gerekiyor

        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //Failure massafe will only be displayed if assertion fails: " REsult text is NOT displayed"
        Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed");

        String expectedTExt = "You successfully clicked an alert";
        String actualText = resultText.getText();

        Assert.assertEquals(actualText,expectedTExt," Actual result Text is NOT as expected");



    }

}
