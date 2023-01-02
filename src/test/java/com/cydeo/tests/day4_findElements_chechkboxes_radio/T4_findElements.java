package com.cydeo.tests.day4_findElements_chechkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {
    public static void main(String[] args) {

        // TC #4: FindElements Task
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate all the links in the page.
        //shortcut : alt + enter = "List <WebElement>
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        //4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());

        //5- Print out the texts of the links.
        //yukarıda girdiğimiz bilgiyi burada gösterebilmek için "bilgi.for" yapıp enter a basıyoruz
        // ör: allLinks.for =  sonrasında  alttaki gibi çıkıyor ve sayfadaki TExt'leri almak içinde "each.getText()" yazıyoruz!!!
        //6- Print out the HREF attribute values of the links
        //linkler için de "each.getAttribute("href") yazıyoruz
        for (WebElement each : allLinks) {
            System.out.println("Text of Link: + " + each.getText());
            System.out.println("HREF Values: "+ each.getAttribute("href"));
        }





    }

}
