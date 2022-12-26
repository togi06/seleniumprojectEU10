package com.cydeo.tests.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sardunya {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.sardunyameze.com");
        String expectedTitle = "Ana Sayfa - Sardunya Meze - Ankara";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Abisininki");
        }else {
            System.out.println("Not Abisininki");
        }
        Thread.sleep(2000);

        // WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
          //     abTestLink.click();
      WebElement menü = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/section/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/a[1]/span"));
       menü.click();

        Thread.sleep(2000);

        WebElement denizÜrünleri = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div/div/section/div/div/div/div/div/div/div/div[1]/div[1]/span[2]"));
       denizÜrünleri.click();


       WebElement levrekMarin = driver.findElement(By.xpath("//*[@id=\"post-703\"]/div/div/section/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[2]/a[1]"));
       levrekMarin.click();


        // WebElement sepeteEkle = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div/div/section/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[2]/a[2]"));
        //sepeteEkle.click();

       // driver.navigate().back();

        Thread.sleep(2000);

       WebElement çorbalar = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div/div/section/div/div/div/div/div/div/div/div[1]/div[1]/span[7]"));
        çorbalar.click();

        WebElement sepeteEkle2 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div/div/section/div/div/div/div/div/div/div/div[2]/div/div/div[7]/div/div/div/div/div[2]/a[1]"));
        sepeteEkle2.click();



    Thread.sleep(2000);

       WebElement sepet = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div[2]/div/div/div/div/nav/ul/li[4]/a"));
        sepet.click();

Thread.sleep(2000);

        WebElement kodInput = driver.findElement(By.id("coupon_code"));
        kodInput.sendKeys("Abisiniki");


        WebElement kupon = driver.findElement(By.name("apply_coupon"));
        kupon.click();



        WebElement odeme = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/a"));
        odeme.click();


    }
}
