package com.cydeo.tests.homeWork;

import com.cydeo.utilities.TitleVerification;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class H10_day7_task5 {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }

    @Test
    public void basketfaul(){
        driver.get("https://basketfaul.com");

        TitleVerification.verify_Title(driver, "BasketFaul.com - Anasayfa");
    }
}
