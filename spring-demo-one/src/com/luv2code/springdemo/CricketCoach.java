package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String email;
	private String team;
	
	//create a non-arg constructor
	public CricketCoach(){
		System.out.println("Creating cricket coach");
	}

	@Override
	public String getDailyWorkout() {
		return "Cricket daily workout";
	}

	@Override
	public String getDailyFortune() {		
		return "cricket fortune " + fortuneService.getFortune();
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside cricket setFortune method");
		this.fortuneService = fortuneService;
	}
	
	public void setEmail(String email) {
		System.out.println("Setting email address");
		this.email = email;
	}

	public void setTeam(String team) {
		System.out.println("Setting team name");
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
