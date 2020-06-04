package com.lyscharlie.cloud.areacenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@MapperScan("com.lyscharlie.cloud.areacenter.biz.mapper")
public class AreaCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AreaCenterApplication.class, args);
	}

}
