package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
		//load spring configuration file
		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach coach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check if they are the same bean
		boolean same = coach.equals(alphaCoach);
		System.out.println("The beans are the same: "+same);
		System.out.println("Memory location coach: "+coach);
		System.out.println("Memory location alphaCoach: "+alphaCoach);
	}

}
