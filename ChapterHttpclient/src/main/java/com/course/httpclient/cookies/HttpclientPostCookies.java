package com.course.httpclient.cookies;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.io.IOException;
import java.util.List;
import java.util.ResourceBundle;

public class HttpclientPostCookies {

    private String url;
    private ResourceBundle bundle;
    private CookieStore store;
    /**
     * 把服务器作为参数进行配置
     * 避免代码重复
     * 步骤1：执行用例前获取需要的 服务器及访问地址
     */
    @BeforeTest
    public void getApplication(){
        //获得配置文件
        bundle = ResourceBundle.getBundle("application");
        //获得配置文件中属性-服务器地址
        url = bundle.getString("test.url");
    }
    @Test
    public void getCookies() throws IOException {
        String result; //存放response结果
        //获取配置文件中属性-访问地址
        String uri = bundle.getString("httpclientPostRequest.uri");
        //拼接访问地址
        HttpGet get = new HttpGet(this.url+uri);
        //执行地址
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        //获得响应信息
        result = EntityUtils.toString(response.getEntity());
        System.out.println(result);

        //判断结果
        //获取cookies信息 (可以存在多个)
        this.store = ((DefaultHttpClient) client).getCookieStore();

        //获取每个cookies 键值对,并进行展示
        List<Cookie> cookies = store.getCookies();
        for (Cookie cookie : cookies){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("获取的Cookies = "+ name +":" + value);
        }

    }
}
