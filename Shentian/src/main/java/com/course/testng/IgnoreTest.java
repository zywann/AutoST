package com.course.testng;

import org.testng.annotations.Test;

/**
 * 忽略测试
 */
public class IgnoreTest {
    /*
     * @Test - enabled 属性
     * false ：选择false方法不会被执行
     * true ： 默认为true
     * 主要作用：测试过程中忽略测试用例，让其方法不被执行
     */
    @Test
    public void ignoreTest1(){
        System.out.println("ignoreTest1 运行");
    }

    @Test(enabled = false)
    public void ignoreTest2(){
        System.out.println("ignoreTest2 运行");
    }

    @Test(enabled = true)
    public void ignoreTest3(){
        System.out.println("ignoreTest3 运行");
    }
}
