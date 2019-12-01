package com.cybertek.tests.day10_Syncronzation;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThreadSleepExaple {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public  void test1() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/dynamic_loading/3");

        Thread.sleep(1000);
        driver.findElement(By.id("username")).sendKeys("mike smith");




    }



}

