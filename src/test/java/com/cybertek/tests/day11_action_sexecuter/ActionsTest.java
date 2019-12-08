package com.cybertek.tests.day11_action_sexecuter;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionsTest {

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
    public void hoverTest() {
        driver.get("http://practice.cybertekschool.com/hovers");
        //Actions --> class that contains all the user interactions
        //how to create actions object/ passing driver as a constructor
        Actions actions = new Actions(driver);
        WebElement img = driver.findElement(By.tagName("img"));
        //perform() --> perform the action. complete the action
        //moveToElement() --> move your mouse to webelement(hover over)
        actions.moveToElement(img).perform();
        Assert.assertTrue(driver.findElement(By.linkText("View profile")).isDisplayed(), "verify view profile displayed");


    }

    @Test
    public void DragDrop() {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //how to create actions object/ passing driver as a constructor
        Actions actions = new Actions(driver);
        // we drag this element(source)
        WebElement source = driver.findElement(By.id("draggable"));
        //we drop here (target)
        WebElement target = driver.findElement(By.id("droptarget"));
        //pause() --> waiting just like thread.sleep, accepts milliseconds
        actions.pause(1000);
        driver.findElement(By.xpath("//button[.='Accept Cookies']")).click();
        //we have to provide source and target to this method, it will drag and drop
        actions.dragAndDrop(source,target).perform();


    }
@Test
    public void DragDropChaning() {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //how to create actions object/ passing driver as a constructor
        Actions actions = new Actions(driver);
        // we drag this element(source)
        WebElement source = driver.findElement(By.id("draggable"));
        //we drop here (target)
        WebElement target = driver.findElement(By.id("droptarget"));
        //pause() --> waiting just like thread.sleep, accepts milliseconds
        actions.pause(1000);
        driver.findElement(By.xpath("//button[.='Accept Cookies']")).click();
        //we have to provide source and target to this method, it will drag and drop
       actions.moveToElement(source).clickAndHold().moveToElement(target).pause(200).build().perform();

    }


}