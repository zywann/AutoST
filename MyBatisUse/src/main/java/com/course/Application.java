package com.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;

import javax.annotation.PreDestroy;

/**
 * 启动程序
 * 入口应用程序
 */
@Controller
@EnableScheduling
@SpringBootApplication
@EnableAutoConfiguration
public class Application {
    private static ConfigurableApplicationContext context;

    //快捷键 psvm
    public static void main(String[] args) {
        Application.context = SpringApplication.run(Application.class,args);
    }


    @PreDestroy
    public void close(){
        Application.context.close();
    }


}
