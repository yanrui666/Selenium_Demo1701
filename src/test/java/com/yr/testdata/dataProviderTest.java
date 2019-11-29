package com.yr.testdata;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2019/11/29.
 */
public class dataProviderTest {
    @DataProvider(name = "data")
    public Object[][] testData(){
        return new Object[][]{{"1","a"},{"2","b"}};
    }
    @Test(dataProvider ="data" )
    public void testcase1(String str1,String str2){
        System.out.println("str1:"+str1+" "+"str2:"+str2);
    }
}
