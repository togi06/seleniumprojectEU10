package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class T4_Config_Practice {

  // public WebDriver driver;

  //  @BeforeMethod
  //  public void setupMethod(){

  //      //We are getting browserType dynamically from our configuration.properties file
  //      String browserType = ConfigurationReader.getProperty("browser");


  //    driver= WebDriverFactory.getDriver(browserType);
  //   driver.manage().window().maximize();
  //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

  //  }

    @Test
    public void google_search_test() throws InterruptedException {
        //Driver.getDriver() -->

        Driver.getDriver().get("https://google.com");

        //3- Write “apple” in search box

        WebElement cookies = Driver.getDriver().findElement(By.xpath("//div[.='Tümünü kabul et']"));
        cookies.click();
        Thread.sleep(1000);
        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);



    //4- Verify title:
    //Expected: apple - Google Search
        String  expectedTitle = ConfigurationReader.getProperty("searchValue")+" - Google'da Ara";
                                //configuration bölümünde ne yazarsan buradan ona ulaşacak
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);





    }



}
