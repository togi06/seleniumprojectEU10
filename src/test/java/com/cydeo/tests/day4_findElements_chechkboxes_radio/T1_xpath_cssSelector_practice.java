package com.cydeo.tests.day4_findElements_chechkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {

        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        //Locate homelink using cssSelector
        WebElement homeLink_ex1 =driver.findElement(By.cssSelector("a[class='nav-link']"));

        //Locate homelink using cssSelector syntax #2
        WebElement homeLink_ex2= driver.findElement(By.cssSelector("a.nav-link"));
        //Locate homelink using cssSelector syntax #3
        WebElement homeLink_ex3 =driver.findElement(By.cssSelector("a[href='/']"));

        //b. “Forgot password” header
        //Locate header using cssSelector : Locate parent element and move down to h2
        WebElement header_ex1= driver.findElement(By.cssSelector("div.example > h2"));

        // Locate header using xpath, and using web element and move down to h2
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        //WebElement header_ex2 = driver.findElement(By.xpath("//h2[.='Forgot Password']")); Yukarıdakiyle bu aynı!!!

        //c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));


        //d. E-mail input box
        WebElement inputBox = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement inputBox2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        //e. “Retrieve password” button
        //button[@id='form_submit']
        //button[@class='radius']
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@type='submit']"));

        //f. “Powered by Cydeo text

        WebElement poweredByCydeoText =  driver.findElement(By.xpath("//div[@style='text-align: center;']"));



        //4. Verify all web elements are displayed.
        //.isDisplayed =  kendiliğinden geliyor sadece benim veriyi yazdıktan sonra nokta koyup "is" yazmam yeterli
        // sonrasında da nokta koyup "soutv" yazıp alttaki verileri elde ediyorum

        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox.isDisplayed() = " + inputBox.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());
    }
}
