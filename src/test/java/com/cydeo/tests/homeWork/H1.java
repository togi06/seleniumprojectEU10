package com.cydeo.tests.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H1 {
    public static void main(String[] args) throws InterruptedException {


        //TC #1: Etsy Title Verification
         // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com

        driver.get("https://www.etsy.com");
        //driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/div[2]/div/div[2]/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/div[2]/div[2]/button")).click();


        //3. Search for “wooden spoon”
        WebElement etsySearchBox = driver.findElement(By.name("search_query"));
        Thread.sleep(3000);
        etsySearchBox.sendKeys("wooden spoon" + Keys.ENTER);
        // I want to use "by.name"


        //4. Verify title:
        //Expected: “Wooden spoon | Etsy”,
        String expectedTitle ="Wooden spoon - Etsy DE";
        String actualTitle = driver.getTitle();





        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED!!!");
        }






    }
}
