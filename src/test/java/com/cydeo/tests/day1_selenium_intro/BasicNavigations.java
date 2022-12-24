package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {


        //1- Set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2- Creat instance of the Selenium WebDeriver
        // This is the line opening an emty browser
        WebDriver driver = new ChromeDriver();

        //This line will maximize the browser size
        driver.manage().window().maximize();

        //3- Go to "https://www.tesla.com"
        driver.get("http://www.tesla.com");
        //get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);


        String currentURL =driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //stop code execution for 3 seconds
        Thread.sleep(3000);


        //use Selenium to nevigate back

        Thread.sleep(3000);

        // use selenium to navigate forward
        driver.navigate().forward();

        Thread.sleep(3000);

        // use selenium to navigate refresh
        driver.navigate().refresh();

        Thread.sleep(3000);
        //use navigate().to

        driver.navigate().to("https://www.google.com");
       /*
       çerezleri kabul etmek için
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div")).click();

        */


        // get the current title after getting the google page
        currentTitle = driver.getTitle();


        //get the title of the page
       // System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("currentTitle = " + currentTitle);

        // get the current URL using Selenium
         currentURL =driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


        // this will close the currently opened window
        driver.close();

        // this will close the all of the opened windows
        driver.quit();


    }



}
