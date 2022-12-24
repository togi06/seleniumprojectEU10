package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {

        //TC#: Google search
        //1- Open a Chrome search
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://google.com
        driver.get("https://google.com");

        // geçişler arasına böyle zaman koymak daha anlaşılır oluyor
        Thread.sleep(3000);

        //3- Write "apple" in search box
        //allow to cookies;
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div")).click();
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        //4-Press Enter using Keys.Enter
        googleSearchBox.sendKeys("apple" + Keys.ENTER);

        Thread.sleep(3000);

        //5- Verify title:
        //Expected: Title should start with "apple" word

        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();
        if (actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED!!!");
        }



    }
}
