package com.amit.springdemo;

public class TrackCoach implements Coach {

	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
	
		return "just do it:"+ fortuneService.getFortune();
	}

}
