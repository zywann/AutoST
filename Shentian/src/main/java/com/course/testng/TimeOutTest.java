package com.course.testng;

import org.testng.annotations.Test;

/**
 * 超时测试 timeOut
 * 应用场景：接口超时就跳过该用例
 */
public class TimeOutTest {
    @Test(timeOut = 3000)
    public void timeOutSusess() throws InterruptedException {
        Thread.sleep(2000);
    }
    @Test(timeOut = 2000)
    public void timeOutFilfailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
