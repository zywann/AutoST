package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsClass2 {

    public void grousClassMethod3(){
        System.out.println("这是成绩用例111");
    }

    public void grousClassMethod4(){
        System.out.println("这是成绩用例222");
    }
}
