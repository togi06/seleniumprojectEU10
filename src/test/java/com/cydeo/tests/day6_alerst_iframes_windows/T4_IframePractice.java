package com.cydeo.tests.day6_alerst_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_IframePractice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //1. Create a new class called: T4_Iframes
        //2. Create new test and make set ups
        //3. Go to: https://practice.cydeo.com/iframe
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(" https://practice.cydeo.com/iframe");

        //TC #4: Iframe practice

        //4. Assert: “Your content goes here.” Text is displayed.
        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”

    }


    @Test
    public void iframe_test(){

        //switch 'ler de "frame" yazıyoruz, locate ederken "iframe" yazıyoruz
        //We need yto switch driver's focus to iframe
        //option1 - switching to iframe  using id attribute value
        //driver.switchTo().frame("mce_0_ifr");


        //option2 - passing index number of iframe
       // driver.switchTo().frame(0); //ilk iframe olduğu için "0" yazdık,

        //option3 - locate as web element and pass in frame() method
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));



        //Locate the p tag
        WebElement yourContentHereTExt = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentHereTExt.isDisplayed());


        //Verify "An iFrame containing the TinyMCE WYSIWYG Editor"
        //To be able to verify the header, we must switch back to "main HTML"
        driver.switchTo().parentFrame();
        WebElement headerText = driver.findElement(By.xpath("//h3"));

        //assertion of the header text is displayed or not
       Assert.assertTrue(headerText.isDisplayed());



    }


}
