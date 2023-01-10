package com.cydeo.tests.homeWork;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Challenge1 {
    public static void main(String[] args) {
        //-  Go to https://www.flipkart.com/
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);


        driver.get("https://www.flipkart.com/");
        WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        close.click();


        //- Locate Wire Headphones
        //If you can find the locator you can share it with us.
        //Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, ...
        //Shop for electronics, apparels & more using our Flipkart app Free shipping & COD.
    }
}
