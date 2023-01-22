package com.cydeo.tests.Zulfikar_Review.week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement box1 = driver.findElement(By.id("box1"));
        WebElement box2 = driver.findElement(By.id("box2"));
        System.out.println(box1.isDisplayed());
        System.out.println(box2.isDisplayed());

        box2.click();
        box1.click();




    }
}
