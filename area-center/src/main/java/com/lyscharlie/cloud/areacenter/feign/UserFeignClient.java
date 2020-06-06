package com.lyscharlie.cloud.areacenter.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.lyscharlie.cloud.areacenter.controller.vo.UserVO;

@FeignClient(value = "user-center")
public interface UserFeignClient {

	@GetMapping(value = "/user/userList")
	List<UserVO> userList();

}
