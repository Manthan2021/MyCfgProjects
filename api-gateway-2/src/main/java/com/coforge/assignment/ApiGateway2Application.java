package com.coforge.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@EnableZuulProxy  //It will acts as Zuul service proxy
@SpringBootApplication
public class ApiGateway2Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiGateway2Application.class, args);
	}
	
	//Simple Filter Bean is Injected to Starter Class
	
    @Bean
	public SimpleFilter simpleFilter() {
		
		return new SimpleFilter();
	}
	
	
}
