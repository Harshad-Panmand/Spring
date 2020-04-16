package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.inteface.Coach;
import com.spring.inteface.FortuneService;

@Component("namedBean")
public class TennisCoach implements Coach {

	FortuneService fortuneService;

	/*
	 * As of Spring Framework 4.3, an @Autowired annotation on such a constructor is
	 * no longer necessary if the target bean only defines one constructor to begin
	 * with. However, if several constructors are available, at least one must be
	 * annotated to teach the container which one to use.
	 */
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
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
