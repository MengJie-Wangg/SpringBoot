package com.mengjie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: SpringBootDemo
 * @BelongsPackage: com.mengjie.controller
 * @Author: 王梦杰
 * @CreateTime: 2023-11-08  15:03
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
public class UserController {
    @GetMapping("/test")
    public String test(){
        return "Hello,World!";
    }
}
