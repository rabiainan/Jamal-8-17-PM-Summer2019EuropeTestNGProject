package com.cybertek.tests.Vytrack_PozitifNegatif_TestCase;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VytrackNegativeTestCase {

    public static void main(String[] args) {
//        Negative test case:
//            •Go to the login page of VyTrack
//            •Enter invalidcredential (can be any role)
//            •Click login button
//            •Verify that the system shows error message “Invalid user name or password.”

        WebDriver driver= WebDriverFactory.getDriver("chrome") ;
        driver.get("http://qa1.vytrack.com/user/login");

        WebElement invalidUserName= driver.findElement(By.id("prependedInput"));
        invalidUserName.sendKeys("storemanager900");

        WebElement invalidPassword=driver.findElement(By.id("prependedInput2"));
        invalidPassword.sendKeys("UserUser500");

        WebElement loginButton= driver.findElement(By.id("_submit"));
        loginButton.click();

        WebElement errorMessage= driver.findElement(By.xpath("//*[contains(text(),'Invalid user name or password.')]"));

        String actualErorrMessage=errorMessage.getText();
        String expectedErrorMessage= "Invalid user name or password.";

        if(expectedErrorMessage.equals(actualErorrMessage)){

            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("expectedErrorMessage = " + expectedErrorMessage);
            System.out.println("actualErorrMessage = " + actualErorrMessage);
        }

         driver.quit();
    }


}
