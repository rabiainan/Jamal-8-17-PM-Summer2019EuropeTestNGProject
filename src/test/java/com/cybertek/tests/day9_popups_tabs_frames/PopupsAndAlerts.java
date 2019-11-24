package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupsAndAlerts {
    WebDriver driver;
   @BeforeMethod
   public void setUpMethod(){
      driver= WebDriverFactory.getDriver("chrome");

   }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
       Thread.sleep(5000);
      //driver.quit();
    }

@Test
    public void  test1(){

        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

        driver.findElement(By.xpath("//*[text()='Destroy the World']")).click();
        driver.findElement(By.xpath("//*[text()='No' ]")).click();
    }

  @Test

    public void Alerts(){

       driver.get("http://practice.cybertekschool.com/javascript_alerts");
       // click for JS alert
       driver.findElement(By.xpath("//button[1]")).click();

       //controling alert using with alert class
       Alert alert= driver.switchTo().alert();

       // clicking ok in the alerts
       alert.accept();
      driver.findElement(By.xpath("//button[2]")).click();
      alert.dismiss();
      driver.findElement(By.xpath("//button[3]")).click();
      alert.sendKeys("mike smith");
      alert.accept();
  }


}
