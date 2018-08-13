package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration //Annotate as configuration class
//@ComponentScan("com.luv2code.springdemo")//scan package, same as xml component scan
@PropertySource("classpath:sport.properties")
public class SportConfiguration {

	//Define a bean for sad fortune service - Expose sad fortune service
	@Bean 
	public FortuneService sadFortuneService(){ //Name of the method will be the bean id
		return new SadFortuneService();
	}
	
	//Define a bean for our swim coach 
	@Bean
	public SwimCoach swimCoach(){
		return new SwimCoach(sadFortuneService()); //Inject fortune service bean dependency
	}	
	
}
