package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_WindowHandling {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethods(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public  void  windown_handling_test(){

        //2. Go to : https://www.amazon.com
        driver.get("https://www.amazon.com");




        //bu şekilde çoklu pence açabilirsin
        //3. Copy-paste the lines from below in to your class
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.youtube.com','_blank');");

        //4. Create a logic to switch to the tab where Etsy.com is open

        Set<String > allWindowsHandles = driver.getWindowHandles();

        for (String each : driver.getWindowHandles()) {

            driver.switchTo().window(each);
            System.out.println("Current URL: "+ driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains("etsy")){
                break;
            }

        }


        /*WebElement cookies2 = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        cookies2.click();

        WebElement searchArea = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        searchArea.sendKeys("Schuhe"+ Keys.ENTER);

        WebElement cookies3 = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        cookies3.click();

         */

        //Yukarıdaki gibi bir "for loop" oluşturduktan sonra cookieleri kabul et ya da başka bir şey yapabilirsin

       // WebElement cookies = driver.findElement(By.xpath("//div[.='Tümünü kabul et']"));
       // cookies.click();
        //5. Assert: Title contains “Etsy”

        String actualTitle = driver.getTitle();
        String expectedInTitle = "Etsy";
        Assert.assertTrue(actualTitle.contains(expectedInTitle));

       /* for (String each : driver.getWindowHandles()) {

            driver.switchTo().window(each);
            System.out.println("Current URL: "+ driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains("facebook")){
                break;
            }


        }
        WebElement cookies4 = driver.findElement(By.xpath("(//button[@value='1'])[3]"));
        cookies4.click();

        WebElement eposta = driver.findElement(By.xpath("//input[@type='text']"));
        eposta.sendKeys("t_bayter_06@hotmail");

        WebElement şifre = driver.findElement(By.xpath("//input[@type='password']"));
        şifre.sendKeys("231732918");

        WebElement logIn= driver.findElement(By.xpath("//button[@name='login']"));
        logIn.click();

        */


    }
}
