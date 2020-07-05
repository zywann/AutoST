package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderParamterTest {

    @Test(dataProvider = "data")
    public void testMethod(String name,int age){
        System.out.println("name = "+name+";  age = "+age);
    }

    @DataProvider(name = "data")
    public Object[][] dataProviderMethod(){
        Object[][] o = new Object[][]{
                {"zhangsan",20},
                {"lisi",21},
                {"wangwu",22}
        };
        return o;
    }

}
