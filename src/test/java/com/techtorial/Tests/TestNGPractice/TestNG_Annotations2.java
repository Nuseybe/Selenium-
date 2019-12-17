package com.techtorial.Tests.TestNGPractice;

import org.testng.annotations.*;

public class TestNG_Annotations2 {

    @Test(priority = 1)
    public void test2() {
        System.out.println("This is test 1");
    }
    @Test(priority = 2, alwaysRun = true)
    public void test1() {
        System.out.println("This is test 2");
    }
    @Test(priority = 3, enabled = true)
    public void test3() {
        System.out.println("This is test 3");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is before method");
    }
    @AfterMethod
    public void afterMethod(){
       System.out.println("This is after method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("This is before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("This is after class");
    }


}