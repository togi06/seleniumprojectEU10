package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    /*
    In this class we are solving the day2_Task1
     */

    public static void main(String[] args) throws InterruptedException {

        //TC #1: Cydeo practice tool verifications
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://practice.cydeo.com
        driver.navigate().to("http://practice.cydeo.com");

        //3. Verify URL contains
        //Expected: cydeo
        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED");
        }else{
            System.out.println("URL verification FAILED");
        }

        //4. Verify title:
        // Expected: Practice


        String expentedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expentedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }

        Thread.sleep(5000);
        driver.close();
    }

}
