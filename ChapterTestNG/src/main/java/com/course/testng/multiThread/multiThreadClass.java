package com.course.testng.multiThread;

import org.testng.annotations.Test;

import static java.lang.Thread.currentThread;

public class multiThreadClass {

    @Test
    public void multiThreadMethod1(){
        System.out.printf("Thread ID : %s%n", currentThread().getId());
    }
    @Test
    public void multiThreadMethod2(){
        System.out.printf("Thread ID : %s%n", currentThread().getId());
    }
    @Test
    public void multiThreadMethod3(){
        System.out.printf("Thread ID : %s%n", currentThread().getId());
    }

}
