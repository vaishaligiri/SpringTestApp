package org.techhub.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	 @RequestMapping("/")
	 public String homePage()
	 {
		 return "Welcome in Spring Boot Application";
	 }
}
