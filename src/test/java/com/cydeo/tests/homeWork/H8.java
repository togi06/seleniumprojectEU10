package com.cydeo.tests.homeWork;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class H8 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //TC #7: Selecting value from non-select dropdown
        //1. Open Chrome browser

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void  tearDownMethod(){

        driver.close();

    }
    @Test(priority = 1)

    public void task7(){
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");



        //3. Click to non-select dropdown

        WebElement nonSelectDropdown = driver.findElement(By.id("dropdownMenuLink"));
        nonSelectDropdown.click();



        //4. Select Facebook from dropdown


        List<WebElement> dropdownOptions = driver.findElements(By.xpath("//a[@class=\"dropdown-item\"]"));
        dropdownOptions.get(3).click();

        //ya da şu şekilde de olabilir
        // WebElement facebook = driver.findElement(By.linkText("Facebook"));
        //            facebook.click();
        //            WebElement cookies = driver.findElement(By.xpath("(//div/button)[7]"));
        //            cookies.click();




        //5. Verify title is “Facebook - Log In or Sign Up”

        WebElement cookies = driver.findElement(By.xpath("(//div/button)[7]"));
        cookies.click();

        String actualPageTitel = driver.getTitle();
        String expectedPageTitle = "Facebook - Giriş Yap veya Kaydol";

        Assert.assertEquals(actualPageTitel, expectedPageTitle);

        System.out.println("expectedPageTitle = " + expectedPageTitle);
        System.out.println(expectedPageTitle);


    }

}
