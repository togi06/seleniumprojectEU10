package com.cydeo.tests.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask1 {

    public static void main(String[] args) {
        //TC #1: Facebook title verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]")).click();

        //3. Verify title:
        //Expected: “Facebook - Log In or Sign Up”
        String expectedTitle =  "Facebook - Giriş Yap veya Kaydol";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("The verification PASSED");
        }else {
            System.out.println("The verification FAILED!!!");
        }

    }
}
