package com.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller // - tells Spring that this class is a web controller, meaning it handles HTTP requests from a browser.
public class HelloWorldController {

	/**
	 * @RequestParam gets a value from the URL query parameter.
	 * value = "name" → looks for ?name=... in the URL
	 * required = false → it’s optional
	 * defaultValue = "World" → if nothing is provided, it uses "World"
	 * */
	@RequestMapping("/hello") // - Maps HTTP requests with the URL /hello to the method below. Only defines request path not file location
	public ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("From " + HelloWorldController.class.getSimpleName());
		ModelAndView modelAndView = new ModelAndView("hello"); // "hello" → refers to hello.html template.
		modelAndView.addObject("hello", "Hello");
		modelAndView.addObject("name", name);

		return modelAndView;
	}
}
