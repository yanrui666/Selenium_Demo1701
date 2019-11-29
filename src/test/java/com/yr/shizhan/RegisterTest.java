package com.yr.shizhan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2019/11/26.
 */
public class RegisterTest {
    WebDriver driver;
@BeforeMethod
    public void openBroser(){
    System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://mail.163.com/");
    driver.manage().window().maximize();
}
@AfterMethod
    public void closeBroser(){
    driver.quit();
}

@Test
    public void register() throws InterruptedException {
    WebElement element=driver.findElement(By.xpath("//*[@id=\"commonOperation\"]/a[2]"));
    element.click();
    Thread.sleep(3000);
    String handle1= driver.getWindowHandle();
    for (String handle2:driver.getWindowHandles()){
        if (handle2.equals(handle1)){
            continue;
        }else{
            driver.switchTo().window(handle2);
        }
    }
      driver.findElement(By.id("nameIpt")).sendKeys("yrok741");
      driver.findElement(By.id("mainPwdIpt")).sendKeys("123456y");
      driver.findElement(By.id("mainCfmPwdIpt")).sendKeys("123456y");
      driver.findElement(By.id("vcodeIpt")).sendKeys("123123");
      driver.findElement(By.id("mainMobileIpt")).sendKeys("18306298987");
    Thread.sleep(5000);
      driver.findElement(By.id("mainAcceptIpt")).click();
      Thread.sleep(5000);
      driver.findElement(By.id("mainRegA")).click();
    Thread.sleep(5000);
    String err= driver.findElement(By.xpath("//*[@id=\"m_vcode\"]/span")).getText();
    Assert.assertEquals(err,"  验证码不正确，请重新填写");
    Thread.sleep(5000);


}


}
