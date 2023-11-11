package com.mengjie.springboot;

import org.apache.catalina.*;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.core.StandardEngine;
import org.apache.catalina.core.StandardHost;
import org.apache.catalina.startup.Tomcat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.Map;

/**
 * @BelongsProject: SpringBootDemo
 * @BelongsPackage: com.mengjie.springboot
 * @Author: 王梦杰
 * @CreateTime: 2023-11-08  15:00
 * @Description: TODO
 * @Version: 1.0
 */
@MySpringBootApplication
public class MengjieSpringApplication {
    public static void run(Class<?> configClass){
        //1、创建Spring容器
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(configClass);
        applicationContext.refresh();

        WebServer webServer = getWebServer(applicationContext);
        webServer.start(applicationContext);
    }
    public static WebServer getWebServer(ApplicationContext applicationContext){
        Map<String, WebServer> webServers = applicationContext.getBeansOfType(WebServer.class);
        if (webServers.isEmpty()){
            throw new NullPointerException();
        }
        if (webServers.size() > 1){
            throw new IllegalStateException();
        }
        return webServers.values().stream().findFirst().get();
    }
}
