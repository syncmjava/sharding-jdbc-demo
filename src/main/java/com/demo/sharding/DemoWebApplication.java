package com.demo.sharding;

import com.demo.sharding.service.DemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = "com.demo.sharding")
@SpringBootApplication
public class DemoWebApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoWebApplication.class, args);
        context.getBean("demoService", DemoService.class).demo();
    }
}
