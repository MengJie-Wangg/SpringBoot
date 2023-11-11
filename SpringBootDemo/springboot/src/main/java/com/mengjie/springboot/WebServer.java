package com.mengjie.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

/**
 * @BelongsProject: SpringBootDemo
 * @BelongsPackage: com.mengjie.springboot
 * @Author: 王梦杰
 * @CreateTime: 2023-11-09  08:22
 * @Description: TODO
 * @Version: 1.0
 */
public interface WebServer {
    void start(WebApplicationContext applicationContext);
}
