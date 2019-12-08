package com.cybertek.tests.day11_action_sexecuter;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecutorDemo {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
        // driver.quit();


    }

    @Test

    public  void click(){
    driver.get("http://practice.cybertekschool.com/");
        WebElement Link=driver.findElement(By.linkText("Dropdown"));
        JavascriptExecutor jse=(JavascriptExecutor) driver;

       jse.executeScript("arguments[0].click()",Link);



    }
  @Test
    public  void type(){

      driver.get("http://practice.cybertekschool.com/dynamic_controls");
      WebElement inputbox = driver.findElement(By.cssSelector("input[type='text']"));
      JavascriptExecutor jse = (JavascriptExecutor) driver;
      String str = "hello disable inputbox";
      jse.executeScript("arguments[0].setAttribute('value', '" + str +"')",inputbox);


  }

  @Test
  public  void Scroll() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/infinite_scroll");

        JavascriptExecutor jse= (JavascriptExecutor) driver;



      for (int i = 0; i < 10; i++) {
            Thread.sleep(500);
            //scrolling down
          jse.executeScript("window.scrollBy(0,250)");
      }

      for (int i = 0; i < 10; i++) {
          Thread.sleep(500);
          // scrolling up
          jse.executeScript("window.scrollBy(0,-250)");
      }


  }


}
