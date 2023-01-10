package com.cydeo.tests.homeWork;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Challenge2 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        driver.get("https://www.flipkart.com/");
        WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        close.click();

        WebElement search= driver.findElement(By.xpath("//input[@class='_3704LK']"));
        search.sendKeys("tshirts "+ Keys.ENTER);


    }
}
