package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {

	public static void main(String[] args) {
		
		//get context
		
		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		//get bean
		
		//Coach coach =  context.getBean("beanId",Coach.class);
		Coach coach =  context.getBean("tennisCoach",Coach.class);
		Coach coach2 =  context.getBean("runningCoach",Coach.class);
		
		// use the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		System.out.println(coach2.getDailyWorkout());
		
		
		//close context
		context.close();

	}

}
