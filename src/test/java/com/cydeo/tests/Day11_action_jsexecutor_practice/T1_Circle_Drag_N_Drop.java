package com.cydeo.tests.Day11_action_jsexecutor_practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_Drag_N_Drop {



    @Test
    public void drag_drop_test(){
        //TC #: Drag and drop
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement cookies = Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        cookies.click();

        //Locate small and big circle to be able to drag them around
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        //scoll the 2 times = 2 kere aşağı kaydırmak için burası lazımdı
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        for (int i = 0; i < 2; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,750)");
        }

        //2. Drag and drop the small circle to bigger circle.
        BrowserUtils.sleep(2);
        Actions actions = new Actions(Driver.getDriver());
       //1.yol actions.dragAndDrop(smallCircle,bigCircle).perform();
        //2.yol
        actions.clickAndHold(smallCircle)
                .pause(2000)
                .moveToElement(bigCircle)
                .pause(2000)
                .release()
                .perform();
        //3. Assert:
        //-Text in big circle changed to: “You did great!”
        String actualBigCircleText = bigCircle.getText();
        String expectedBigCircleText = "You did great!";

        Assert.assertEquals(actualBigCircleText,expectedBigCircleText);


    }
}
