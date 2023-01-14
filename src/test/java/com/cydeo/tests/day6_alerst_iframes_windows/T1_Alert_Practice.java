package com.cydeo.tests.day6_alerst_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
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
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test(priority = 1)
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

        //Failure massage will only be displayed if assertion fails: " REsult text is NOT displayed"
        Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed");

        String expectedTExt = "You successfully clicked an alert";
        String actualText = resultText.getText();

        Assert.assertEquals(actualText,expectedTExt," Actual result Text is NOT as expected");



    }

    @Test(priority = 2)
    public void task2(){
        //3. Click to “Click for JS Confirm” button
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        informationAlertButton.click();

        Alert alert = driver.switchTo().alert();


        //4. Click to OK button from the alert

        alert.accept();
        //5. Verify “You clicked: Ok” text is displayed.
        WebElement clickText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(clickText.isDisplayed(), "Result text is NOT displayed");
        String expectedClickText = "You clicked: Ok";
        String actualClickText = clickText.getText();

        Assert.assertEquals(actualClickText,expectedClickText, "Actual result Text is NOT as expected");



    }

    @Test(priority = 3)
    public void task3() throws InterruptedException {

        //3. Click to “Click for JS Prompt” button
        WebElement informationAllertButton3 = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        informationAllertButton3.click();


        Alert alert = driver.switchTo().alert();

        //4. Send “hello” text to alert
        alert.sendKeys("hello");
       // alert.sendKeys("hello" + Keys.ENTER);
        Thread.sleep(2000);

        //5. Click to OK button from the alert
        alert.accept();
        //6. Verify “You entered: hello” text is displayed.

        WebElement resultText =driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed(), "Result Text is NOT displayed");

        String expectedResultText = "You entered: hello";
        String actualResultText = resultText.getText();

        Assert.assertEquals(actualResultText,expectedResultText, "Actual result Text is NOT expected");

    }

    // WebElement Result=driver.findElement(By.xpath("//p[@style='color:green']"));
    //        String expected="You entered: hello";
    //        String actual= Result.getText();
    //        Assert.assertEquals(expected,actual);

}

//diğer iki task ı kendın yap

