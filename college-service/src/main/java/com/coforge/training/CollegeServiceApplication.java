package com.coforge.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/*In order to implement Circuit Breaker in your application/microservice, 
 * you need to apply @EnableHystrix at the main class of your application.
To see the analytics provided by Hystrix as a dashboard, apply @EnableHystrixDashboard at the main class. */
//By Default the circuit is closed.
//client sends the service request when the circuit is closed-Normal


/*Hystrix server acts as a fault-tolerance robust system.
It is used to avoid complete failure of an application.
It does this by using the Circuit Breaker mechanism. */




@EnableEurekaClient
@EnableHystrixDashboard
@EnableHystrix
@SpringBootApplication
public class CollegeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeServiceApplication.class, args);
	}

}
