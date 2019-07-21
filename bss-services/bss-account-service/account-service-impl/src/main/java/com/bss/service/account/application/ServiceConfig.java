package com.bss.service.account.application;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan(basePackages = "com.bss.service.account")
@EnableDubbo(scanBasePackages = "com.bss.service.account")
@PropertySources({@PropertySource("classpath:bss-account-service.properties")})
public class ServiceConfig {

}
