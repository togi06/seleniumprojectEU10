package com.cydeo.tests.Zulfikar_Review.week6;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest {

    @Test
    public void test1(){
        Driver.getDriver().get("https://afd.calpoly.edu/web/sample-tables");
        WebElement adress1 = Driver.getDriver().findElement(By.xpath("//td[.='Building 99 Room 1']"));
        Assert.assertEquals("Building 99 Room 1", adress1.getText());

    }

    @Test
    public void test2(){
     Driver.getDriver().get("https://afd.calpoly.edu/web/sample-tables");

     String drName = "Dr. Steve";
     List<WebElement> info = Driver.getDriver().findElements(By.xpath("//td[contains(text(),'" + drName + "')]/following-sibling::td"));
     Assert.assertEquals("555-5678",info.get(0).getText());
     Assert.assertEquals("steve@calpoly.edu",info.get(1).getText());
     Assert.assertEquals("56-78",info.get(2).getText());
    }
}
