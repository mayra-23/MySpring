package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		List<String> fortunes =  new ArrayList<String>();
		fortunes.add("Random fortune 1");
		fortunes.add("Random fortune 2");
		fortunes.add("Random fortune 3");
		
		Random random =  new Random();
		int i= random.nextInt(3);
		return fortunes.get(i);
	}

}
