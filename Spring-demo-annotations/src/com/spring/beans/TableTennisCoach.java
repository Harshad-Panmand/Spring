package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.inteface.Coach;
import com.spring.inteface.FortuneService;

@Component
public class TableTennisCoach implements Coach {

	FortuneService fortuneService;

	public TableTennisCoach(FortuneService fortuneService) {
		System.out.println("TableTennisCoach: Inside default constructor");
	}

	// Setter injection
	// You can user @Autowired annotation to any method (not necessary to have
	// setter method only)
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TableTennisCoach: Inside setFortuneService");
		this.fortuneService = fortuneService;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do wormup for 30 minutes before exercise";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
