package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RunningCoach implements Coach {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyWorkout() {		
		return "Ruuuun moreee";
	}

}
