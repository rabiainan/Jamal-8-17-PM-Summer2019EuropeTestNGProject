package com.cybertek.tests.Vytrack_PozitifNegatif_TestCase;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VytracPozitiveTestCase {

    public static void main(String[] args) {

//        Positive test case:
//            •Go to the login page of VyTrack
//            •Enter valid credential (can be any role)
//            •Click login button
//            •Verify that the user login successfully

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://qa1.vytrack.com/user/login");

        WebElement userName= driver.findElement(By.id("prependedInput"));
        userName.sendKeys("storemanager54");

        WebElement passWord=driver.findElement(By.id("prependedInput2"));
        passWord.sendKeys("UserUser123");

        WebElement loginButton= driver.findElement(By.id("_submit"));
        loginButton.click();

        driver.quit();


    }


}
