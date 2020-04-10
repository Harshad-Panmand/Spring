package com.spring.demo;

public class BaseballCoach implements Coach {

	// Define private field for the dependency
	private FortuneService fortuneService;

	public BaseballCoach() {

	}

	// Define constructor for dependency class
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {

		// Use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
