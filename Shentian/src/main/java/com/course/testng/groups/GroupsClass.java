package com.course.testng.groups;


/*
*  这是分组测试 - 注解
*
* */


import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsClass {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是测试用例111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是测试用例222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是测试用例111");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是测试用例222");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnService(){
        System.out.println("这是测试方法运行之前运行的服务端测试组1111");
    }
    @AfterGroups("server")
    public void afterGroupsOnService(){
        System.out.println("这是测试方法运行之后运行的服务端测试组2222");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是测试方法运行之前运行的客户端测试组1111");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是测试方法运行之后运行的客户端测试组2222");
    }

}
