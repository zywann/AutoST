package com.course.testng;

import org.testng.annotations.Test;

public class DependsOnMethodTest {

    /**
     * 依赖测试 @Test注解 属性： dependsOnMethods
     * 被依赖的方法-test1正确才会执行需要依赖他的方法test2，否则依赖方法test2不会被执行
     * 注意：传值的格式 {"test1"}
     *
     * 用途：比如，登录后才能操作下一步这样的场景，test1登录，test2拿到登录后的值做参数依赖
     */
    @Test
    public void test1(){
        System.out.println("这是test2依赖");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("这是test2");
    }
}
