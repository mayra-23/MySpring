package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

//No @Component annotation used, bean will created with @Bean in configuration class
public class SadFortuneService implements FortuneService{

	@Override
	public String getDailyFortune() {
		return "Sad fortune service";
	}

}
