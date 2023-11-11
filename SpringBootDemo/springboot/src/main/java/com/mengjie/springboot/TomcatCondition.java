package com.mengjie.springboot;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @BelongsProject: SpringBootDemo
 * @BelongsPackage: com.mengjie.springboot
 * @Author: 王梦杰
 * @CreateTime: 2023-11-09  08:40
 * @Description: TODO
 * @Version: 1.0
 */
public class TomcatCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //判断逻辑
        try {
            Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(MengjieConditionOnClass.class.getName());
            String className = (String) annotationAttributes.get("value");
            context.getClassLoader().loadClass(className);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
