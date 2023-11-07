package com.shawee.autoConfiguration;

import com.shawee.annotation.ConditionalOnClass;
import com.shawee.server.JettyServer;
import com.shawee.server.TomcatServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Shawee
 * @Date 2023/11/6
 */

@Configuration
public class WebServerAutoConfiguration {

    @Bean
    @ConditionalOnClass("org.apache.catalina.startup.Tomcat")
    public TomcatServer tomcatServer() {
        return new TomcatServer();
    }

    @Bean
    @ConditionalOnClass("org.eclipse.jetty.server.Server")
    public JettyServer jettyServer() {
        return new JettyServer();
    }
}
