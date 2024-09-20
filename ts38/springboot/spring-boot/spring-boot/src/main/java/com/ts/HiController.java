package com.ts;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HiController {
	@RequestMapping("/hi")
	public String hiController() {
		return "Hi";

	}
	@RequestMapping("/Hello")
	public String Hello() {
		return "Hello Purushotham";
	}


}
