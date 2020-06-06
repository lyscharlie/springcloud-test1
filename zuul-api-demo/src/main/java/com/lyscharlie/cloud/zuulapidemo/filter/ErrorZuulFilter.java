package com.lyscharlie.cloud.zuulapidemo.filter;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ErrorZuulFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return "error";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		// 该过滤器需要执行
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		Map<String, Object> map = new HashMap<>();
		map.put("success", false);
		map.put("msg", "报错了");
		return map;
	}
}
