package com.cydeo.tests.Zulfikar_Review.week6;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsTest {

    // hover
    @Test
    public void test1() {
        Driver.getDriver().get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        WebElement hover = Driver.getDriver().findElement(By.id("sub-menu"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(hover).perform();
        Driver.getDriver().findElement(By.id("link2")).click();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Google");
    }

    // double click
    @Test
    public void test2() throws InterruptedException {
        Driver.getDriver().get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        WebElement doubleClick = Driver.getDriver().findElement(By.id("double-click"));
        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(doubleClick).perform();
        Alert alert = Driver.getDriver().switchTo().alert();
        Assert.assertEquals(alert.getText(), "You double clicked me!!!, You got to be kidding me");
        Thread.sleep(3000);
        alert.accept();
    }


    // double click in chain
    @Test
    public void test3() throws InterruptedException {
        Driver.getDriver().get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        WebElement doubleClick = Driver.getDriver().findElement(By.id("double-click"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(doubleClick).doubleClick().perform();
//        actions.doubleClick().perform();
        Thread.sleep(3000);
    }


    // drag and drop
    @Test
    public void test4() throws InterruptedException {
        //Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement target = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement source = Driver.getDriver().findElement(By.id("draggable"));
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(source, target).perform();
        Thread.sleep(3000);
    }


    // keyboard actions
    @Test
    public void test5() throws InterruptedException {
        Driver.getDriver().get("http://practice.cybertekschool.com/key_presses");
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.SPACE).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.SHIFT).perform();
        Thread.sleep(2000);


    }
}
