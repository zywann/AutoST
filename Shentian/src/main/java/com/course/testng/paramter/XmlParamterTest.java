package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XmlParamterTest {
    /**
     * XML参数化 @Parameters({"name","age"})
     * 注意：传值方式
     * @param name
     * @param age
     */

    @Test
    @Parameters({"name","age"})
    public void xmlParamMtthod(String name,int age){
        System.out.println("name = "+name+";  age = "+age);
    }
}
