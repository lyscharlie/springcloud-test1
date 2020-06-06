package com.lyscharlie.cloud.zuulapidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulApiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiDemoApplication.class, args);
	}

}
