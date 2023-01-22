package com.cydeo.tests.Zulfikar_Review.week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StaleElementReferenceException {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://google.com");

        WebElement gmail = driver.findElement(By.xpath("//a[.='Home']"));

        //System.out.println(gmail.getText());

        //driver.navigate().refresh();

        //WebElement home = driver.findElement(By.xpath("//a[.='Home']"));

        //System.out.println(gmail.getText());



    }
}
