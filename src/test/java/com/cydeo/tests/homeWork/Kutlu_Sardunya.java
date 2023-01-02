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



        WebElement SardunyaClick = driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
        SardunyaClick.click();



        WebElement menü = driver.findElement(By.xpath("//a[@href='https://www.sardunyameze.com/qr\']"));
        menü.click();


        WebElement anaYemekler = driver.findElement(By.xpath("//*[@id=\"post-703\"]/div/div/section/div/div/div/div/div/div/div/div[1]/div[1]/span[5]"));
        anaYemekler.click();

        WebElement aliNazik= driver.findElement(By.xpath("//a[@href='https://www.sardunyameze.com/urun/alinazik/']"));
        aliNazik.click();

        WebElement sepeteEkle = driver.findElement(By.xpath("//button[@class ='single_add_to_cart_button button alt']"));
        sepeteEkle.click();

        WebElement sepetiGörüntüle = driver.findElement(By.xpath("//a[@class='button wc-forward']"));
        sepetiGörüntüle.click();

        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();

        WebElement zeytinyağlı = driver.findElement(By.xpath("//span[text()='Zeytinyağlılar']"));
        zeytinyağlı.click();



    }
}
