package com.xietong.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@RequestMapping("hello")
	public String hello() {
		return "hello";
		
	}
}
