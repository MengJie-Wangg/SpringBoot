package com.mengjie.springboot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@ComponentScan
@Import(WebServerAutoConfiguration.class)
public @interface MySpringBootApplication {
}
