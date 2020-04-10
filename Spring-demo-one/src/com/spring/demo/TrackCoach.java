package com.spring.demo;

public class TrackCoach implements Coach {

	// Define private field for the dependency
	private FortuneService fortuneService;

	public TrackCoach() {

	}

	// Define constructor for dependency class
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		// Use my fortuneService to get a fortune
		return "Just Do it: " + fortuneService.getFortune();
	}

	// Init method
	public void doStartupStuff() {
		System.out.println("TrackCoach: Inside doStartupStuff");
	}

	public void doCleanupStuff() {
		System.out.println("TrachCoac: Inside doCleanupStuff");
	}
}
