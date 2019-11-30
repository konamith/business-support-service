package com.bss.service.account.application;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication(scanBasePackages = "com.bss.service.account")
@EnableDubbo(scanBasePackages = "com.bss.service.account")
@PropertySources({@PropertySource("classpath:bss-account-service.properties")})
public class AccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class);
    }
}
