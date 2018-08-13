package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RunningCoach implements Coach {
	
	//Inject value from properties file
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.name}")
	private String team;

	
	
	@Autowired
	@Qualifier("randomFortuneServiceFromFile") //For multiple implementations of FortuneService - @Qualifier(beanId)
	private FortuneService fortuneService;
	
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public String getDailyFortune(){
		return fortuneService.getDailyFortune();
	}

	@Override
	public String getDailyWorkout() {		
		return "Ruuuun moreee";
	}

}
