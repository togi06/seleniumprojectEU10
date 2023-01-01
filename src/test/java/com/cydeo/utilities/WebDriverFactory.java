package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Task: New Method Cration
//Method name: getDriver
//Static method
//Accepts String arg: browserType
//  - This arg will determine what type of browser is opened
//  - If "chrome" passed ---> it will open chrome browser
//  - If "firefox" passed ---> it will open firefox browser
// Return type:    "WebDriver"

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){

        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        }else if (browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else {
            System.out.println("Given browsertype does not exist / or is not currently supported");
            System.out.println("Driver = null");
            return null;
        }

    }


}
