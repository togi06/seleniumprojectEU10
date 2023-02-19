package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_cont {
    public static void main(String[] args) {

        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //3. Click to “Hockey” radio button
        //WebElement hockeyRadioButton = driver.findElement(By.xpath("//input[@id='hockey']"));

        //Locate name='sports' radio button and store a list of web Element

        clickAndVerifyRadioButton(driver,"sport", "hockey");
        clickAndVerifyRadioButton(driver, "sport", "football");
        clickAndVerifyRadioButton(driver, "color", "yellow");

        //driver.quit();
    }

    private  static void  clickAndVerifyRadioButton(WebDriver driver, String  nameAttribute, String idValue){
        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));
        //Loop through the list of WebElement and select matching result "hockey"

        for (WebElement each: radioButtons){
            String eachId =   each.getAttribute("id");

            if (eachId.equals(idValue)){

                each.click();
                System.out.println(eachId +" is selected : " + each.isSelected());
                break;
            }

        }
        //Radio Buttonlarda List<> yapıyorsun bir isim vererek, sonrasında da verilen ortak olan ögesini yazıqyorsun,
        // ör:List<WebElement> sportRadioButtons = driver.findElements(By.name("sport"));
        //sonra da "for" loop yapıyorsun "each.getAttribute" ile, burada "ıd" ı seçtik cunku onda tüm veriler ayrılıyordu
        //sonrasında da "if" kullanım "each.id.equals("...") yazıpi "each.click" -> each.isSelected.soutv -> break ile bitiyorsun.
        // hedef nerede yakalanıyorsa orada bıtırıyor diğer verilere bakmıyor...


    }

}
