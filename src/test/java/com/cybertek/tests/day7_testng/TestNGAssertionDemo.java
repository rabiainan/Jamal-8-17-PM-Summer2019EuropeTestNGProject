package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionDemo {

    @Test
  public  void test1(){
        System.out.println("first assertion");
        Assert.assertEquals(1, 1);

        System.out.println("second assertion");
        Assert.assertEquals("title","titlE");
        System.out.println("after second assertion");
    }
   @Test
    public  void test2() {
     // verify that title starts withw C
       String actualTitle="Cybertek";
       String expecTitleBegining="C";
       System.out.println("first assertion");
        Assert.assertTrue(actualTitle.startsWith(expecTitleBegining), "verify that title starts withw C");

        // verify that email includes @ sign

       Assert.assertTrue("email@com".contains("@"), "verify @ in email");
   }


   @Test
    public void test3(){
    Assert.assertNotEquals("one","two");

   }
      @Test
    public  void test4(){

        Assert.assertFalse(1<0);

      }



}
