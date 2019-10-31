package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {
       // setup the browser
        WebDriverManager.chromedriver().setup();

        /// import class cmd+enter or alt + enter or cpntrol space

        WebDriver driver=new ChromeDriver();
       // navigate to website
        driver.get("https://www.google.com");

         // another way of opening website
        driver.navigate().to( "https://www.facebook.com");

        // goes back to previus website
       driver.navigate().back();
        Thread.sleep(3000);
       // cli ck the forwad after goes back
        driver.navigate().forward();

      // refresh the page

        driver.navigate().refresh();
    }


}
