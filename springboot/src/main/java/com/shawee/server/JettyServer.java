package com.shawee.server;

/**
 * @Author Shawee
 * @Date 2023/11/6
 */
public class JettyServer implements WebServer {
    @Override
    public void start() {
        System.out.println("jetty 启动");
    }
}
