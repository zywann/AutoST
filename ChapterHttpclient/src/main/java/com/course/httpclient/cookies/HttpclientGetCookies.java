package com.course.httpclient.cookies;

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

public class HttpclientGetCookies {

    private String url;
    private ResourceBundle bundle;
    private CookieStore store;
    /**
     * 执行用例前获取需要的 服务器及访问地址
     */
    @BeforeTest
    public void getApplication(){
        // 获取配置文件 - 该工具类默认找properties文件，只需输入配置文件名即可
        bundle = ResourceBundle.getBundle("application");
        // 获取文件中的属性 - 服务器
        url = bundle.getString("test.url");
    }


    @Test
    public void getCookies() throws IOException {
        String result;
        // 获取文件中的属性 - 访问地址
        String uri = bundle.getString("httpclientGetRequest.uri");
        // 获取服务器访问地址 - 对服务器、访问地址进行拼接并传值
        HttpGet get = new HttpGet(this.url+uri);
        // 执行get方法
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        // 获取响应信息
        result = EntityUtils.toString(response.getEntity());
        System.out.println(result);


        // 获取 cookies
        // 创建获取cookies的对象
        this.store =((DefaultHttpClient) client).getCookieStore();
        // 获取响应cookies
        List<Cookie> cookies = store.getCookies();
        for (Cookie cookie: cookies){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("cookies name = "+name+" cookies value = "+value);
        }
    }

    @Test(dependsOnMethods = {"getCookies"})
    public void getWithCookies() throws IOException {
        String result;
        //获取get请求moco属性
        String uri = bundle.getString("test.get.with.cookies");
        //获取访问地址
        HttpGet get = new HttpGet(this.url+uri);
        //创建client对象
        HttpClient client = new DefaultHttpClient();
        //设置cookies信息
        ((DefaultHttpClient) client).setCookieStore(this.store);
        //执行get请求方法
        HttpResponse response = client.execute(get);

        //获取响应的状态码
        int status = response.getStatusLine().getStatusCode();
        System.out.println("statusCode = " + status);
        if (status == 200){
            result = EntityUtils.toString(response.getEntity(),"utf-8");
            System.out.println(result);
        }
    }

}
