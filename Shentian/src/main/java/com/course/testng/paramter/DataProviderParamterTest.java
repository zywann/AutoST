package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderParamterTest {
    /**
     * 普通的DataProvider参数化传值
     * @param name
     * @param age
     */
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

    /**
     * 根据方法不同，进行不同的参数化传递
     * @param name
     * @param age
     */
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("这是test111方法：  name = "+name+";  age = "+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("这是test222方法：  name = "+name+";  age = "+age);
    }
    @DataProvider(name = "methodData")
    public Object[][] dataProviderMethod1(Method method){ //获取method类对象
        Object[][] result = null;
        if (method.getName().equals("test1")){ //获取需要传值的方法
            result = new Object[][]{
                    {"zhangsan",20},
                    {"lisi",21}
            };
        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu",26},
                    {"zhaoliu",27}
            };
        }
        return result;
    }
}
