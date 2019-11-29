package com.yr.shizhan2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2019/11/27.
 */
public class LoginTest {
    WebDriver driver;
    @BeforeMethod
    public void openBroser(){
        System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://mail.163.com/");
        driver.manage().window().maximize();
    }
   /** @AfterMethod
    public void closeBroser(){
        driver.quit();
    }
    **/
    @Test
    public void loginTest() throws InterruptedException {
        driver.findElement(By.id("switchAccountLogin")).click();
        String frameid= driver.findElement(By.tagName("iframe")).getAttribute("id");
        driver.switchTo().frame(frameid);
        Thread.sleep(5000);
        driver.findElement(By.name("email")).sendKeys("meyoungtester");
        driver.findElement(By.name("password")).sendKeys("meyoung123");
        driver.findElement(By.id("dologin")).click();
     Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"_mail_component_125_125\"]/a")).click();


    }


}
