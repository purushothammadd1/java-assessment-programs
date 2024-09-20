package com.ts;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	@RequestMapping("/hello")
	public String hello(){
		return "Hello";
	}
	@RequestMapping("/Home")
	public String Home() {
		return "This is HOMEPAGE";
	}

}
