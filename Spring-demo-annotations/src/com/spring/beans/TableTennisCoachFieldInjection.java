package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.inteface.Coach;
import com.spring.inteface.FortuneService;

@Component
public class TableTennisCoachFieldInjection implements Coach {

	/*
	 * Behind the scene spring framework set this field.
	 * Spring framework also sets field injection for private field
	 */
	@Autowired
	private FortuneService fortuneService;

	public TableTennisCoachFieldInjection() {
		System.out.println("TableTennisCoachFieldInjection: Inside default constructor");
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
