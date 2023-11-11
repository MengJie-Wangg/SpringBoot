package com.mengjie.springboot;

import org.springframework.web.context.WebApplicationContext;

/**
 * @BelongsProject: SpringBootDemo
 * @BelongsPackage: com.mengjie.springboot
 * @Author: 王梦杰
 * @CreateTime: 2023-11-09  08:23
 * @Description: TODO
 * @Version: 1.0
 */
public class JettyWebServer implements WebServer{
    @Override
    public void start(WebApplicationContext applicationContext) {
        System.out.println("启动Jetty");
    }
}
