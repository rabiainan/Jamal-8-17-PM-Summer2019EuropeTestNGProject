package com.cybertek.tests.day10_fileUpload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FilePath {

   @Test
   public void test1(){


       String projectPath = System.getProperty("user.dir");
       String relativePath = "src/test/Resources/testfile.txt";
       String filePath = projectPath+"/"+relativePath;

       System.out.println(filePath);

   }

}
