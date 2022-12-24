package com.cydeo.tests.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H4 {
    public static void main(String[] args) {

        //TC #4: Practice Cydeo – Class locator practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        //3- Click to “Home” link
        WebElement home = driver.findElement(By.className("nav-link")); // çünkü içerikte sadece "class name" vardı
        home.click();



        //4- Verify title is as expected:
        //Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("The verification PASSED");
        }else    {
            System.out.println("The verification FAILED!!!");
        }


        //PS: Locate “Home” link using “className” locator



    }
}
