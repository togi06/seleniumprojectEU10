package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTablesUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");

    }


    @Test(priority = 1)
    public void order_name_verify_test(){
        // Locate the cell that has Bob Martin text in it
        WebElement bobMartinCell= driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        System.out.println("bobMartinCell = " + bobMartinCell.getText());

        //2. Verify Bob’s name is listed as expected.
        //Expected: “Bob Martin”
        String  expectedBobName = "Bob Martin";
        String actualBobName = bobMartinCell.getText();
        Assert.assertEquals(actualBobName,expectedBobName);


        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021

        //akternative locator to bobMartinDAteCell = "//table[@id='ctl00_MaiContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"
        WebElement bobMartinDateCell =
                driver.findElement(By.xpath("//td[.='Bob Martin']/../td[5]"));



        String expectedBobDate= "12/31/2021";
        String actualBobDate= bobMartinDateCell.getText();

        Assert.assertEquals(actualBobDate,expectedBobDate);


    }

    // We use the utility method we created
    @Test(priority = 2)
    public void test2(){
     String costumerOrderDate1 =   WebTablesUtils.returnOrderDate(driver,"Alexandra Gray");

        System.out.println("costumerOrderDate1 = " + costumerOrderDate1);


      String costumerOrderDate2 =   WebTablesUtils.returnOrderDate(driver,"Ned Stark");
      System.out.println("costumerOrderDate2 = " + costumerOrderDate2);

    }
//using WebTablesUtils.orderVerify(): method
    @Test(priority = 3)
    public void test3(){

        WebTablesUtils.orderVerify(driver, "Bart Fisher", "01/16/2021");



    }
}
