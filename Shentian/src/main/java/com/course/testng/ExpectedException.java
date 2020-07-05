package com.course.testng;


import org.testng.annotations.Test;

/**
 * 异常测试
 */
public class ExpectedException {

//    @Test(expectedExceptions = RuntimeException.class)
//    public void ExpectedExceptionFailedMethed(){
//        System.out.println("这是一个失败的异常的测试");
//    }

    @Test(expectedExceptions = RuntimeException.class)
    public void ExpectedExceptionSuccessMethed(){
        // 注意：异常后面不能写执行语句，因为异常后不会再执行代码，书写后会报错
        System.out.println("这是一个成功的异常的测试");
        throw new RuntimeException();
    }

}
