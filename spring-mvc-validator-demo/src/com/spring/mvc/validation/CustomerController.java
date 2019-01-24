package com.spring.mvc.validation;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class CustomerController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel){
		theModel.addAttribute("customer",new Customer());
		
		return "customer-form";
	}
	
	
	//@Valid : Perform validation rules on the objetc
	//Results of validation will placed in the BindingResult
	@RequestMapping("/processForm")
	public String processForm(
				@Valid @ModelAttribute("customer") Customer theCustomer,
				BindingResult theBindingResult
			){
		System.out.println("Last Name = "+theCustomer.getLastName());
		if(theBindingResult.hasErrors()){
			return "customer-form";
		}
		else{
			return "customer-confirmation";		
		}
	}
	
	//@InitBinder = pre-process all web requests coming into our controller
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		//removes whitespaces - leading & trailing
		StringTrimmerEditor editor = new StringTrimmerEditor(true);//true : trim to null
		dataBinder.registerCustomEditor(String.class, editor);
	}
	

}
