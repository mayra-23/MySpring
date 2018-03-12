package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//BEAN

//@Component("beanId")  -  Define bean Id
@Component //if any bean Id defined, by defualt bean Id =  class name starting with lower case ->   tennisCoach 
public class TennisCoach implements Coach {
	
	FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService fortune){
		fortuneService = fortune;
	}
	
	public String getDailyFortune(){
		return fortuneService.getDailyFortune();
	}
	
	public String getDailyWorkout(){
		return "Practice handball";
	}

}
