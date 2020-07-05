package com.course.testng;

import org.testng.annotations.*;

/**
 * 基本注解
 */
public class BasicAnnotation {

    //testng 最基本的注解，用来把方法标记为测试的一部分
    //注解的作用
    /*
    * 重点：注解的执行顺序
    * 1 套件 （BeforeSuite  AfterSuite ）
    * 2 类注解 （BeforeClass  AfterClass ）
    * 3 方法注解 （BeforeMethod  AfterMethod ）
    * 4 用例注解 （BeforeTest  AfterTest  Test）
    *
    * */

    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void befereMethod(){
        System.out.println("BeforeMethod：这是在测试方法之前运行的注解");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod：这是在测试方法之后运行的注解");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass:这是在类运行之前运行的注解");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass:这是在类运行之后运行的注解");
    }


    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite测试套件");
    }
}
