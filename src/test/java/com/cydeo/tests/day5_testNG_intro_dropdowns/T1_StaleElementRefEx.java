package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefEx {
    public static void main(String[] args) throws InterruptedException {
        //TC #1: StaleElementReferenceException handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        //3. Click to “Add Element” button                                      //button[@onclick='addElement()'
        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));// for TExt

        Thread.sleep(2000);
        addElementButton.click();

        //4. Verify “Delete” button is displayed after clicking.            //button[.='Delete']
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));

        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        //5. Click to “Delete” button.
        deleteButton.click();

        //6. Verify “Delete” button is NOT displayed after clicking.


       try {//kodu çalıştırdıktan sonra "StaleElementReferenceExeption" çıkarsa, çıkan satıra "try-cath" yapıyorsun
              System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

       }catch (StaleElementReferenceException e){
           System.out.println("-->StaleElementReferenceExeption exception is thrown");
           System.out.println("--> This means the web element completely deleted from the page");
           System.out.println("delete.Button.isDisplayed() = false");
       }

            driver.close();
    }
}
