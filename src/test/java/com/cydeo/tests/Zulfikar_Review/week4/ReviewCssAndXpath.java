package com.cydeo.tests.Zulfikar_Review.week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReviewCssAndXpath {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        /*
        1. Css locator
            tagName[attributeNAme='value']
            tagName#idValue or tagName.classValue


            div[type='text']
            div#radio   using id value
            div.radio   using class value

            use > sign to go from parent to child
            div.radio > h1  fist way is using >
            div.radio h1    second way is using a space

            nth-of-type(index number)


         2. Xpath Locator

               1) absolute xpath -- start from the first element (which is html)
               then go your element step by step

               stat whit /. continue with/


               2) relative xpath -- start wherever you want
               start with //, contınue with //i when want to child element, then use

               //li[@class='list-group-item']

               frequently used syntax for xpath

               //tagName[@attribute='value']
               //tagName[contains@attribute, 'value']
               //tagName[.='text'] ( same as //tagName[text()='text']
               //*[@attribute='value'] (use * when we don't want to use tag name)


               go from parent to child
               We use / to go from parent tp child
               //tagName[@attribute ='value']/tagName

                we also can go from child to parent using /..
                childElement/..

                We can go between siblings using/preceding or following siblings method

                following-sibling::tagName
                preceding-sibling::
         */
         */
         */
         */
         */
         */










    }
}
