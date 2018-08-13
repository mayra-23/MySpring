package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//use spring java configuration class
		AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(SportConfiguration.class);
		
		//Get bean	
		Coach coach =  context.getBean("tennisCoach",Coach.class);
		
		RunningCoach coach2 =  context.getBean("runningCoach",RunningCoach.class);
		
		// use the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println("---------------------------------------");
		
		System.out.println(coach2.getDailyWorkout());
		System.out.println(coach2.getEmail());
		System.out.println(coach2.getTeam());
		System.out.println(coach2.getDailyFortune());
		
		//close context
		context.close();

	}

}
