package com.mengjie.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: SpringBootDemo
 * @BelongsPackage: com.mengjie.springboot
 * @Author: 王梦杰
 * @CreateTime: 2023-11-09  08:38
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration
public class WebServerAutoConfiguration {
    @Bean
    @MengjieConditionOnClass("org.eclipse.jetty.server.Server")
    public WebServer jettyWebServer(){
        return new JettyWebServer();
    }
    @Bean
    @MengjieConditionOnClass("org.apache.catalina.startup.Tomcat")
    public WebServer tomcatWebServer(){
        return new TomcatWebServer();
    }
}
