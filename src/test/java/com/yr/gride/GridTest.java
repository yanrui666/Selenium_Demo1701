package com.yr.gride;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Administrator on 2019/11/28.
 */
public class GridTest {
    @Test
    public void testChrome() throws InterruptedException, MalformedURLException {
        DesiredCapabilities dc=DesiredCapabilities.chrome();
        WebDriver driver =new RemoteWebDriver(new URL("http://192.168.155.1:4444/wd/hub"),dc);
        driver.get("http://www.baidu.com");
        Thread.sleep(10000);
        driver.quit();
    }
}
