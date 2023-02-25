package com.cydeo.tests.Zulfikar_Review.week6;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UploadTest {
    @Test
    public void test1() throws InterruptedException {
        Driver.getDriver().get("https://chercher.tech/practice/" +
                "practice-pop-ups-selenium-webdriver");

        //sağ tıkla, sonra copy path 'ten absolute path i seç
        String path = "C:\\Users\\t_bay\\IdeaProjects\\seleniumprojectEU10\\src\\test\\java\\com\\cydeo\\tests" +
                "\\Zulfikar_Review\\week6\\test document";
        WebElement uploadLink = Driver.getDriver().findElement(By.name("upload"));
        uploadLink.sendKeys(path);
        Thread.sleep(3000);

    }
}
