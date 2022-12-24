package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kartal {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        Thread.sleep(3000);


        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div")).click();

        WebElement googleSearchBox = driver.findElement(By.name("q"));

        Thread.sleep(3000);
        googleSearchBox.sendKeys("Kartal" + Keys.ENTER);

        Thread.sleep(3000);

        String expectedInTitle = "Kartal";
        String actualTitle = driver.getTitle();
        if (actualTitle.startsWith(expectedInTitle)){
            System.out.println("Okay");
        }else {
            System.out.println("try again");
        }



    }
}
