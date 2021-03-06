package com.spring.tagform;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel){
	
		// create  a student object
		Student studentObject =  new Student();
		
		//add student object to the model
		theModel.addAttribute("student",studentObject);
		
		//add the country options to the model
		theModel.addAttribute("countryOptions", countryOptions);
		
		return "student-form";
	}
	
	
	@RequestMapping("/processForm")
	//Model Attribute name should be the same as the one definde in the form with the modelAttribute tag
	public String processFrom(@ModelAttribute("student") Student theStudent){
		//log the input data
		System.out.println("theSteudent: "+theStudent.getFirstName() +"  "+ theStudent.getLastName());
		
		return "student-confirmation";
		
	}
	
	

}
