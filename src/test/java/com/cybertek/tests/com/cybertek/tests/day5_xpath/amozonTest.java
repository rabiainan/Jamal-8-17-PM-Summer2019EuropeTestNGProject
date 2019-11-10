package com.cybertek.tests.com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class amozonTest {

  /*  navigate to amazon.com
    type selenium in the searchbox

    click search button */

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.co.uk/");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("selenium");

        driver.findElement(By.xpath("//*[@value='Go']")).click();






    }


}
