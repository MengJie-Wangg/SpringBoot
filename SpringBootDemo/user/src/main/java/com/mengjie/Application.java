package com.mengjie;

import com.mengjie.springboot.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * @BelongsProject: SpringBootDemo
 * @BelongsPackage: com.mengjie
 * @Author: 王梦杰
 * @CreateTime: 2023-11-08  15:02
 * @Description: TODO
 * @Version: 1.0
 */
@MySpringBootApplication
public class Application {
    public static void main(String[] args) {
        MengjieSpringApplication.run(Application.class);
    }
}
