package com.course.testng.groups;

import org.testng.annotations.Test;


/**
 * @TEST 注解，不只是应用到方法上
 * @TEST 注解，还能应用到类上
 */
@Test(groups = "stu")
public class GroupsClass1 {

    public void grousClassMethod1(){
        System.out.println("这是信息用例111");
    }

    public void grousClassMethod2(){
        System.out.println("这是信息用例222");
    }
}
