package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//Controller methos to show initial HTML form
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form"; //Spring will prepend prefix and append suffix defined in configuration xml file, and searches the view
	}
	
	//Controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm (){
		return "helloworld";
	}
	
	//Controller method to read form data and add data to the model
	@RequestMapping("/processFormTwo")
	public String modelExample(HttpServletRequest request, Model model){
		
		//read the request parameter from HTML form
		String theName =  request.getParameter("studentName");
		
		//convert data to caps
		theName = theName.toUpperCase();
		
		//create message
		String result =  "Hi! "+theName;
		
		//add message to the model
		model.addAttribute("message",result);
		return "helloworld";		
	}
	
	@RequestMapping("/processFormThree")
	public String requestParameterExample(@RequestParam("studentName")String theName, Model model){
		
		//convert data to caps
		String upperName = theName.toUpperCase();
		
		//create message
		String result =  "Holiii "+upperName;
		
		//add message to the model
		model.addAttribute("requestParamMsg",result);
		return "helloworld";		
	}

}
