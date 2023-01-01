package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_xpath {
    public static void main(String[] args) {

        //TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Enter incorrect username into login box: //
        WebElement inputUsername = driver.findElement(By.xpath("//input[@class='login-inp']"));
        inputUsername.sendKeys("incorrect"); //sütunları doldurma!!!

        //4- Click to `Reset password` button

        WebElement resetButton = driver.findElement(By.xpath("//button[@class='login-btn']"));
        resetButton.click(); //bir yere tıklama !!!

        // 5- Verify “error” label is as expected
        //Expected: Login or E-mail not found

        WebElement errorLabel = driver.findElement(By.xpath("//div[@class= 'errortext']")); //sonuçta çıkan yazı
        String expectedErrorLabel= "Login or E-mail not found";
        String actualErrorLabel= errorLabel.getText();

        if (actualErrorLabel.equals(expectedErrorLabel)){
            System.out.println("Label verification Passed");
        }else {
            System.out.println("Label verification Failed!!!");
        }




    }
}
