package com.amit.springdemo;

public class BaseballCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
	
	
	public String getDailyWorkout(){
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

}
