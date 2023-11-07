package com.shawee;

import com.shawee.annotation.MySpringBootApplication;
import com.shawee.autoConfiguration.WebServerAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 * @Author Shawee
 * @Date 2023/11/6
 */

@MySpringBootApplication
@Import(WebServerAutoConfiguration.class)
// AutoConfigurationSelector待实现
//@Import(AutoConfigurationSelector.class)
public class MyApplication {
    public static void main(String[] args) {
        MySpringApplication.run(MyApplication.class);
    }
}
