package com.mscourse.hroauth.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mscourse.hroauth.entities.User;



@Component
@FeignClient(name="hr-user", path = "/users")
public interface UserFeignClient {
	
	@GetMapping(value = "/search/{email}")
	ResponseEntity<User> findByEmail(@PathVariable String email);

}
