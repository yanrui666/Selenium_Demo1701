package com.yr.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2019/11/19.
 */
public class TestNGDemo1 {
    @BeforeTest
    public void beforeTest01(){
        System.out.println("这是@BeforeTest注解");
    }
     @BeforeMethod
     public void beforeMethod01(){
         System.out.println("这是@BeforeMethod注解");
     }
    @Test
    public void testCase1(){
        System.out.println("这是@Test注解1");
    }
    @Test
    public void testCase2(){
        System.out.println("这是@Test注解2");
    }
    @Test
    public void openChromeDrivers(){
        System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
    }

}
