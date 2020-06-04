package com.lyscharlie.cloud.areacenter.common;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;

@Configuration
public class RestTemplateConfig {

	/**
	 * 向Spring容器中定义RestTemplate对象
	 *
	 * @return
	 */
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public IRule myRule() {
		//return new RoundRobinRule();
		//return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
		return new RetryRule();  //在这里选择负载均衡算法
	}

}
