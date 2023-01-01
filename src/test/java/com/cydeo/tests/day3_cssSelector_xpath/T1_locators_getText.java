package com.cydeo.tests.day3_cssSelector_xpath;


import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {

    public static void main(String[] args) {

        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");


        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");



        //3- Enter incorrect username: “incorrect”
       // driver.findElement(By.className("login-inp")).sendKeys(" incorrect"); -- bu şekilde de olur ama satır uzunluğu ılerisi ıcın sıkıntı olabılır o yuzden ıkıye bölmek daha iyi
        WebElement inputUsername = driver.findElement(By.className("login-inp"));
        inputUsername.sendKeys(" incorrect");

        //4- Enter incorrect password: “incorrect”
       WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("skudkadıl");

        //5- Click to login button.
       WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //6- Verify error message text is as expected:
       // Expected: Incorrect login or password
       WebElement errorMassage = driver.findElement(By.className("errortext"));

        String expectedErrorMassage = "Incorrect login or password";
        String actualErrorMassage = errorMassage.getText();

        if (actualErrorMassage.equals(expectedErrorMassage)){
            System.out.println("Error massage verification PASSED");
        }else {
            System.out.println("Error massage verification FAILED!!!");
        }


    }
}

