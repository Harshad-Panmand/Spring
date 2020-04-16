package com.spring.beans;

import org.springframework.stereotype.Component;

import com.spring.inteface.Coach;

/**
 * Bean id for @Component without name will class name with first character as lower case
 * @author hpanmand
 *
 */

@Component
public class TennisCoachDefaultBean implements Coach {

	@Override
	public String getDailyWorkout() {
		return "From Default bean: Do wormup for 30 minutes before exercise";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
