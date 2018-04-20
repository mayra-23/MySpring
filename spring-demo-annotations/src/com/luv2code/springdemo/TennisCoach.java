package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//BEAN

//@Component("beanId")  -  Define bean Id
@Component //if any bean Id defined, by defualt bean Id =  class name starting with lower case ->   tennisCoach
//@Scope("prototype") // - define scope of the beans
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
	
	
	//Define init method
	@PostConstruct
	public void doMyStartup(){
		System.out.println("Inside doMyStartup");
	}
	
	
	@PreDestroy
	public void doCleanup(){
		System.out.println("Inside doCleanup");
	}
	
	
	
	
	
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
