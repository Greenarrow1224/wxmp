package com.green.mp.wechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Greenarrow
 */
@SpringBootApplication
public class WeChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeChatApplication.class, args);
        System.out.println("------启动成功------");
    }

}
