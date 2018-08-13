package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Spring MVC Controller
@Controller //@Controller extends from @Component -picked during component scanning
public class HomeController {

	@RequestMapping("/")//handle all pages and types of requests
	public String showPage(){
		return "main-menu"; //Spring will prepend prefix and append suffix defined in configuration xml file, and searches the view
	}

}
