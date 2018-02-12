package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//call beans
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		//use beans
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());		
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		
		//close context
		context.close();

	}

}
