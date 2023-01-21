package com.cydeo.tests.Zulfikar_Review.week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement bluBtn = driver.findElement(By.id("blue"));
        WebElement redBtn = driver.findElement(By.id("red"));

        redBtn.click();
        Thread.sleep(2000);
        bluBtn.click();

    }
}
