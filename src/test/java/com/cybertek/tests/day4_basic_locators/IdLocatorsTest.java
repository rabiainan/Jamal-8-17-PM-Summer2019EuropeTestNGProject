package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;



public class IdLocatorsTest {

    public static void main(String[] args) {


        WebDriver driver= WebDriverFactory.getDriver("chrome") ;
        driver.manage().window().maximize();
        driver.get("");

    }

}
