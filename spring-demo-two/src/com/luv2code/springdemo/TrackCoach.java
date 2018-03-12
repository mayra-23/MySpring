package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {		
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5k TrackCoach";
	}

	@Override
	public String getDailyFortune() {
		return "Just run it " + fortuneService.getFortune();
	}
	
	
	//Hooks
	
	//add init method
	public void initMethodSpring(){
		System.out.println("TrackCoach inside initMethodSpring");		
	}
	// add destroy method
	public void destroyMethodSpring(){
		System.out.println("TrackCoach inside destroyMethodSpring");	
		
	}

}
