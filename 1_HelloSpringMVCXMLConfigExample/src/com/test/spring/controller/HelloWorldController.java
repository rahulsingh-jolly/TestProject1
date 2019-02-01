package com.test.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);
	@RequestMapping("/HelloWorld")
	public ModelAndView printWelcome() {
		LOGGER.info("inside of printWelcome() method....");
		String message = "Spring MVC 5 HelloWorld Example";
		
		LOGGER.info("inside of printWelcome again..........");
		return new ModelAndView("welcome", "message", message);
	}
}
