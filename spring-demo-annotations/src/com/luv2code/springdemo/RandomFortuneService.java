package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"Beware of the wolf",
			"Journey is the reward",
			"You are the best"
	};
	
	//random number generator
	private Random myRandom = new Random();
	
	

	@Override
	public String getDailyFortune() {
	//pick random string from array
		int index = myRandom.nextInt(data.length);
		
		return data[index];
	}

}
