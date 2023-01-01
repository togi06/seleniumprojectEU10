package com.cydeo.tests.homeWork;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Kutlu_Sardunya {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//div[@class= 'QS5gu sy4vM']")).click();



        WebElement googleSearchBox = driver.findElement(By.xpath("//input[@name='q']"));
        googleSearchBox.sendKeys("Sardunya Meze" + Keys.ENTER);

        Thread.sleep(2000);

        WebElement SardunyaClick = driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
        SardunyaClick.click();

        Thread.sleep(2000);

        WebElement menü = driver.findElement(By.xpath("//a[@href='https://www.sardunyameze.com/qr\']"));
        menü.click();

        Thread.sleep(2000);
        WebElement anaYemekler = driver.findElement(By.xpath("//span[@clas='swiper-pagination-bullet']"));
        anaYemekler.click();

    }
}
