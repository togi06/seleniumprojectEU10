package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Registration_Form {



    @Test
    public void registration_form_test(){

        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
        //Driver.getDriver()--> driver.get(url)
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        //Create JavaFaker object
        Faker faker = new Faker();

        //3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());



        //4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());


        //5. Enter username
        WebElement inputUserName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        //1. yol inputUserName.sendKeys(faker.name().username().replace(".",""));

        //2.yol inputUserName.sendKeys(faker.bothify("helpdesk###"));

        //3.yol
        String user = faker.bothify("helpdesk###");
        inputUserName.sendKeys(user);

        //3.yolu aşağı ile bağlamak bana daha profesyonel geldi bunu kullanman daha çok mantıklı olacaktır !!!

        //6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
       //1.yol inputEmail.sendKeys(faker.bothify("helpdesk@hotmail.com"));
        //2. yol
        inputEmail.sendKeys(user + "@gmail.com");


        //7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.numerify("########"));


        //8. Enter phone number
        WebElement inputPhoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhoneNumber.sendKeys(faker.numerify("571-###-####"));

        //9. Select a gender from radio buttons
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        inputGender.click();

        //10. Enter date of birth
        WebElement inputBirthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        faker.number().numberBetween(1,12);
        inputBirthday.sendKeys("01/23/2023");

        //11. Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));

        //12. Select Job Title
        Select jobTitleDropDown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitleDropDown.selectByIndex(faker.number().numberBetween(1,8));

        //13. Select programming language from checkboxes
        WebElement checkboxes1 = Driver.getDriver().findElement(By.xpath("//label[@for='inlineCheckbox1']"));
        WebElement checkboxes3 = Driver.getDriver().findElement(By.xpath("//label[@for='inlineCheckbox3']"));

        checkboxes1.click();

        checkboxes3.click();


        //14. Click to sign up button
        WebElement singBtn = Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']"));
        singBtn.click();
        //15. Verify success message “You've successfully completed registration.” is
        //displayed.
        WebElement text = Driver.getDriver().findElement(By.tagName("p"));
        System.out.println("text.isDisplayed() = " + text.isDisplayed());

        String expectedText =  "You've successfully completed registration!";
        String actualText = text.getText();
        Assert.assertEquals(actualText,expectedText);

        //1. Use new Driver utility class and method
        //2. User JavaFaker when possible
        //3. User ConfigurationReader when it makes sense


    }

}
