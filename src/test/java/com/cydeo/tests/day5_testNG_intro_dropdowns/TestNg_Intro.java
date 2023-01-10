package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNg_Intro {

    @BeforeClass
    public void  setupMethod(){
        System.out.println("----> BeforeClass is running");

    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("----> AfterClass is running");
    }

    @BeforeMethod
    public  void setUpMethod(){
        System.out.println("---> BeforeMethod is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("---> AfterMethod is running");
    }

    @Test (priority = 1) // priority bize test edilenleri sırasını gösteriyor!!!
    public void test1(){
        System.out.println("Test 1 is running...");

        //ASSER EQUALS: compare 2 of the same thing

        String actual = "apple";
        String expected = "apple";
        Assert.assertEquals(actual,expected); // Yanlış bir veri ortaya çıktığında aradaki farkı gösteriyor


    }

    @Test(priority = 2)
    public void test2(){
        System.out.println("Test 2 is running");

        //AssertTrue
        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected)); // bir yanlışlık olduğunda sadece "false" u gösteriyor!!!


    }

}
