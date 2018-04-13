package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneServiceFromFile implements FortuneService {

	@Value("${fortunes}")
	private String[] data;
	
	//random number generator
		private Random myRandom = new Random();
		
		

		@Override
		public String getDailyFortune() {
		//pick random string from array
			int index = myRandom.nextInt(data.length);
			
			return data[index];
		}

}
