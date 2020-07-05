package com.course.testng.groups;


import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsClass3 {

    public void grousClassMethod1(){
        System.out.println("这是teacher用例111");
    }

    public void grousClassMethod2(){
        System.out.println("这是teacher用例222");
    }
}
