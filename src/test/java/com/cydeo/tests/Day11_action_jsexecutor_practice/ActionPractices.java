package com.cydeo.tests.Day11_action_jsexecutor_practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionPractices {

    @Test
    public void task_4_and_5_test(){


        //TC #4: Scroll practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        //3- Scroll down to “Powered by CYDEO”
        //create object of the Action and pass our "driver" instance
        Actions actions = new Actions(Driver.getDriver());

        // Locating cydeo link to abe to pass in the actions method
                                                            //By.xpath("a[@href='https://cydeo.com/']
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));



        //4- Scroll using Actions class “moveTo(element)” method
        actions.moveToElement(cydeoLink).perform();
        //BrowserUtils.sleep(1);
        //cydeoLink.click();

        //TC #5: Scroll practice 2
        //1- Continue from where the Task 4 is left in the same test.
        //2- Scroll back up to “Home” link using PageUP button

        //1.yol
                        //PAGE.UP- DOWN pek kullanışlı değil onun yerine "move to" kullanırsan daha iyi
        //actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();

        //2.yol
        BrowserUtils.sleep(2);
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
        actions.moveToElement(homeLink).perform();

        Driver.closeDriver();

    }


    @Test
    public void test2(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();

    }


}
