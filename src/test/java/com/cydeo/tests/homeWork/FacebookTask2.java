package com.cydeo.tests.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask2 {
    public static void main(String[] args) throws InterruptedException {

        //TC #2: Facebook incorrect login title verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]")).click();

        //3. Enter incorrect username
        WebElement emailInput= driver.findElement(By.id("email"));
        emailInput.sendKeys("jhsdkahkjshkjsadh");

        //4. Enter incorrect password
        WebElement passwordInput = driver.findElement(By.name("pass")); // I want to use "By.name" here
        passwordInput.sendKeys("wrongPassword" + Keys.ENTER);

        Thread.sleep(6000);

        //5. Verify title changed to:
        //Expected: “Log into Facebook”

        String expectedTitle = "Facebook'a Giriş Yap";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("The verification PASSED");
        }else {
            System.out.println("The verification FAILED");
        }
    }
}
