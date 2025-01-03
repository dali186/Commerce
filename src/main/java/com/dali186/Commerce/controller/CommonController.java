package com.dali186.Commerce.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common")
public class CommonController {

	@RequestMapping("/v1")
	public String githubActions() {
		
		String version = "v4";
		return "success";
	}
}
