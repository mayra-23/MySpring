package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//BEAN

//@Component("beanId")  -  Define bean Id
@Component //if any bean Id defined, by defualt bean Id =  class name starting with lower case ->   tennisCoach 
public class TennisCoach implements Coach {
	
	//Field Injection - even for private fields
//	@Autowired
	//@Qualifier("randomFortuneService") //For multiple implementations of FortuneService - @Qualifier(beanId)
	private FortuneService fortuneService;
	
	//default constructor
	public TennisCoach(){
		System.out.println( "inside default tennisCoach constructor");
	}
	
	//Constructor injection -  autowirinf FortuneService
	/*@Autowired
	public TennisCoach(	@Qualifier("randomFortuneService") FortuneService fortune){
		System.out.println("Constructor injection - Inside constructor");
		fortuneService = fortune;
	}*/
	
	
	
	public String getDailyFortune(){
		return fortuneService.getDailyFortune();
	}
	
	
	//Setter injection - autowiring FortuneService
	@Autowired
	@Qualifier("randomFortuneService")
	public void doesNotMatterMethodName(FortuneService fortuneService) {
		System.out.println("Setter injection - Inside set fortune Service");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout(){
		return "Practice handball";
	}

}
