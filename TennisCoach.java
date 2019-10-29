package com.amit.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}


	public TennisCoach() {
		
	}


	@Override
	public String getDailyWorkout() {
		
		return "practice your backhand volley";
	}


	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

}
