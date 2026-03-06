package com.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("From Controller..");
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("hello", "Hello");
		modelAndView.addObject("name", name);

		return modelAndView;
	}
}