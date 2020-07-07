package com.course.httpclient.demo;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class HttpclientDemo {

    /**
     * get 请求 httpclient 获取
     */
    @Test
    public void test() throws IOException {
        // 存放返回结果
        String result;
        // 使用get方式，发送请求地址
        HttpGet get = new HttpGet("http://www.baidu.com");
        // 执行 get 方法
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        // 获取 响应结果,并存放
        result = EntityUtils.toString(response.getEntity());

        System.out.println(result);
    }
}
