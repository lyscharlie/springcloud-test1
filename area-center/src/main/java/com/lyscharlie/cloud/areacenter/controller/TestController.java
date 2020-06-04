package com.lyscharlie.cloud.areacenter.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.lyscharlie.cloud.areacenter.controller.vo.UserVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Api(value = "test")
@RestController
@RequestMapping(value = "test")
@Slf4j
public class TestController {

	@Value("${myspcloud.userCenter.url}")
	private String userCenterUrl;

	@Autowired
	private RestTemplate restTemplate;

	@ApiOperation(value = "用户列表")
	@GetMapping(value = "userList")
	public List<UserVO> userList() {

		try {
			UserVO[] users = this.restTemplate.getForObject(this.userCenterUrl + "/userList", UserVO[].class);
			return Arrays.asList(users);
		} catch (RestClientException e) {
			log.error("TestController.userList", e);
			return new ArrayList<>();
		}
	}

}
