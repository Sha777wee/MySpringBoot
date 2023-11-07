package com.shawee;

import com.shawee.server.WebServer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.util.Map;

/**
 * @Author Shawee
 * @Date 2023/11/6
 */
public class MySpringApplication {

    public static void run(Class clazz) {
        // 创建一个spring容器
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        // clazz相当于容器的一个配置类
        applicationContext.register(clazz);
        applicationContext.refresh();

        // 启动tomcat
        WebServer webServer = getWebServer(applicationContext);
        webServer.start();
    }

    private static WebServer getWebServer(WebApplicationContext applicationContext) {
        Map<String, WebServer> beansOfType = applicationContext.getBeansOfType(WebServer.class);
        if (beansOfType.size() == 0) {
            throw new NullPointerException();
        }
        if (beansOfType.size() > 1) {
            throw new IllegalStateException();
        }
        return beansOfType.values().stream().findFirst().get();
    }
}
