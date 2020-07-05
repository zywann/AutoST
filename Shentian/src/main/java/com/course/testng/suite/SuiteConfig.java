package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * suite test
 *  所有公共套件
 * 用例运行之前所需的方法等
 */
public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("运行 beforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("运行 afterSuite");
    }
}
