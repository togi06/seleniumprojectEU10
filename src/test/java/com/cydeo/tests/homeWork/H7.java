package com.cydeo.tests.homeWork;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class H7 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //TC #5: Selecting state from State dropdown and verifying result
        //1. Open Chrome browser

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



    }
    @AfterMethod
    public void tearDownMethod(){

    }


    @Test (priority=1)
    public void task7() throws InterruptedException {



        //Use all Select options. (visible text, value, index)

        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id ='state']")));
        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();
        String actualSimpleDropdownText = currentlySelectedOption.getText();


        String expectedStateDropdownText = "Select a State";
        String actualStateDropdownText = simpleDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualStateDropdownText, expectedStateDropdownText);

        //3. Select Illinois
        WebElement stateDropdown = driver.findElement(By.id("state"));
        Select selectObj = new Select(stateDropdown);
        selectObj.selectByValue("IL");



        String expectedOption = "Illinois";
        String actualOption = selectObj.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption);

       // Thread.sleep(2000);

        //4. Select Virginia
        WebElement stateDropdown1 = driver.findElement(By.id("state"));
        Select selectObj1 = new Select(stateDropdown);
        selectObj1.selectByValue("VA");


        String expectedOption1 = "Virginia";
        String actualOption1 = selectObj1.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption);

        //5. Select California
        WebElement stateDropdown2= driver.findElement(By.id("state"));
        Select selectObj2 = new Select(stateDropdown);
        selectObj1.selectByValue("CA");
        String expectedOption2 = "California";
        String actualOption2 = selectObj1.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption);

        //6. Verify final selected option is California.
        String expectedOption3 = "California";
        String actualOption3 = "California";
        Assert.assertTrue(actualOption3.equals(expectedOption3));


    }







}
