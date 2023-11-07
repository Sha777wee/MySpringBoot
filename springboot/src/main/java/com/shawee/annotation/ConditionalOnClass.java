package com.shawee.annotation;

import com.shawee.autoConfiguration.WebServerCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author Shawee
 * @Date 2023/11/6
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Conditional({WebServerCondition.class})
public @interface ConditionalOnClass {
    String value();
}
