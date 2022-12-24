package com.cydeo.tests.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H2 {

    public static void main(String[] args) {

        //TC #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        //Expected: “Log in to ZeroBank”

        String expectedHeaderText = "Log in to ZeroBank";
        //String actualHeaderText = driver.getTitle(); = bununla da doğru olması lazım ama bu olmadı aşağıdaki doğru
        // Çünkü drive.findeElement(By.tagName(!!)) yaparak daha doğru bir adres vermiş olunuyor
                String actualHeaderText = driver.findElement(By.tagName("h3")).getText();

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("The verification PASSED");
        }else {
            System.out.println("The verification FAILED!!!");
        }
    }
}
