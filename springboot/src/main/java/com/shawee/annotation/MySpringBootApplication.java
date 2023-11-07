package com.shawee.annotation;

import org.springframework.context.annotation.ComponentScan;

import java.lang.annotation.*;

/**
 * @Author Shawee
 * @Date 2023/11/6
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@ComponentScan
public @interface MySpringBootApplication {
}
