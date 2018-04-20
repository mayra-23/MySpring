package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring cofig file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Same object: "+ result);
		
		System.out.println("Memory loc theCoach: "+ theCoach);
		
		System.out.println("Memory loc alphaCoach: "+ alphaCoach);
		
		context.close();

	}

}
